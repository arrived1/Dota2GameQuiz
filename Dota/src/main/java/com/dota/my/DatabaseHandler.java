package com.dota.my;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "statisticManager";
    private static final String TABLE_STATISTIC = "statistic";


    private static final String KEY_ID = "id";
    private static final String KEY_SCORE = "score";
    private static final String KEY_CHANCES_LEFT = "chancesLeft";
    private static final String KEY_TIME = "time";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_STATISTIC + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_SCORE + " TEXT,"
                + KEY_CHANCES_LEFT + " TEXT,"
                + KEY_TIME + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STATISTIC);

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

        DataBaseRecord record = new DataBaseRecord(cursor.getString(0),
                                                   cursor.getString(1),
                                                   cursor.getString(2));
        return record;
    }


    public List<DataBaseRecord> getAllRecords() {
        List<DataBaseRecord> recordList = new ArrayList<DataBaseRecord>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_STATISTIC;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                DataBaseRecord record = new DataBaseRecord(cursor.getString(0),
                                                            cursor.getString(1),
                                                            cursor.getString(2));

                recordList.add(record);
            } while (cursor.moveToNext());
        }

        return recordList;
    }

    public int getRecordCount() {
        String countQuery = "SELECT  * FROM " + TABLE_STATISTIC;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        return cursor.getCount();
    }

    public int updateRecord(DataBaseRecord record) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_SCORE, record.getScore());
        values.put(KEY_CHANCES_LEFT, record.getChancesLeft());
        values.put(KEY_TIME, record.getTime());

        return db.update(TABLE_STATISTIC,
                         values,
                         KEY_ID + " = ?",
                         new String[] { String.valueOf(record.getId()) });
    }

    public void deleteRecord(DataBaseRecord record) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_STATISTIC,
                  KEY_ID + " = ?",
                  new String[] { String.valueOf(record.getId()) });
        db.close();
    }
}
