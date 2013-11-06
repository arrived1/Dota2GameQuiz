package com.dota.my;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

enum TABLE {
    DeathMetch,
    SingleRandom
}

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "statisticManager";
    private static final String TABLE_STATISTIC_SINGLE_RANDOM = "statisticSingleRandom";
    private static final String TABLE_STATISTIC_DEATH_MATCH = "statisticDeathMatch";
    private static String TABLE_STATISTIC = "";

    private static final String KEY_ID = "id";
    private static final String KEY_SCORE = "score";
    private static final String KEY_CHANCES_LEFT = "chancesLeft";
    private static final String KEY_TIME = "time";

    public DatabaseHandler(Context context, TABLE type) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        if(type == TABLE.DeathMetch) {
            TABLE_STATISTIC = TABLE_STATISTIC_SINGLE_RANDOM;
        }
        if(type == TABLE.SingleRandom) {
            TABLE_STATISTIC = TABLE_STATISTIC_DEATH_MATCH;
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTable(db, TABLE_STATISTIC_SINGLE_RANDOM);
        createTable(db, TABLE_STATISTIC_DEATH_MATCH);
    }

    private void createTable(SQLiteDatabase db, String tableName) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + tableName + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_SCORE + " TEXT,"
                + KEY_CHANCES_LEFT + " TEXT,"
                + KEY_TIME + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STATISTIC_SINGLE_RANDOM);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STATISTIC_DEATH_MATCH);
        onCreate(db);
    }

    public void addRecord(DataBaseRecord record) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_SCORE, record.getScore());
        values.put(KEY_CHANCES_LEFT, record.getChancesLeft());
        values.put(KEY_TIME, record.getTime());

        db.insert(TABLE_STATISTIC, null, values);
        db.close();
    }

    public DataBaseRecord getRecord(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_STATISTIC,
                new String[] { KEY_ID, KEY_SCORE, KEY_CHANCES_LEFT, KEY_TIME },
                KEY_ID + "=?",
                new String[] { String.valueOf(id) },
                null, null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        DataBaseRecord record = new DataBaseRecord(
                cursor.getString(1),
                cursor.getString(2),
                cursor.getString(3));
        return record;
    }

    public ArrayList<DataBaseRecord> getAllRecords() {
        ArrayList<DataBaseRecord> recordList = new ArrayList<DataBaseRecord>();

        String selectQuery = "SELECT  * FROM " + TABLE_STATISTIC;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                DataBaseRecord record = new DataBaseRecord(cursor.getString(1),
                                                           cursor.getString(2),
                                                           cursor.getString(3));
                recordList.add(record);
            } while (cursor.moveToNext());
        }
        srotRecords(recordList);
        return recordList;
    }

    private class DataBaseRecordComparator implements Comparator<DataBaseRecord> {
        @Override
        public int compare(DataBaseRecord o1, DataBaseRecord o2)
        {
            Integer i1 = Integer.parseInt(o1.getScore());
            Integer i2 = Integer.parseInt(o2.getScore());
            if(i1 == i2)
                return compareTime(o1, o2);
            else if(i1 < i2)
                return 1;
            else
                return -1;
        }

        private int compareTime(DataBaseRecord o1, DataBaseRecord o2) {
            String[] time1 = o1.getTime().split(":");
            String[] time2 = o2.getTime().split(":");

            Integer min1 = Integer.parseInt(time1[0]);
            Integer min2 = Integer.parseInt(time2[0]);
            Integer sec1 = Integer.parseInt(time1[1]);
            Integer sec2 = Integer.parseInt(time2[1]);

            if(min1 == min2) {
                if(sec1 == sec2)
                    return 0;
                else if(sec1 < sec2)
                    return -1;
                else
                    return 1;
            }
            else if(min1 < min2)
                return -1;
            else
                return 1;

        }
    }

    private void srotRecords(ArrayList<DataBaseRecord> array) {
        Collections.sort(array, new DataBaseRecordComparator());
    }


//    public int getRecordCount() {
//        String countQuery = "SELECT  * FROM " + TABLE_STATISTIC;
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.rawQuery(countQuery, null);
//
//        int count = 0;
//
//        if(cursor != null && !cursor.isClosed()){
//            count = cursor.getCount();
//            cursor.close();
//        }
//        return count;
//    }
//
//    public int updateRecord(DataBaseRecord record) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(KEY_SCORE, record.getScore());
//        values.put(KEY_CHANCES_LEFT, record.getChancesLeft());
//        values.put(KEY_TIME, record.getTime());
//
//        return db.update(TABLE_STATISTIC,
//                         values,
//                         KEY_ID + " = ?",
//                         new String[] { String.valueOf(record.getId()) });
//    }
//
//    public void deleteRecord(DataBaseRecord record) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(TABLE_STATISTIC,
//                  KEY_ID + " = ?",
//                  new String[] { String.valueOf(record.getId()) });
//        db.close();
//    }
}
