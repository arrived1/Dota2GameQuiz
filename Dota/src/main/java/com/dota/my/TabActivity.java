package com.dota.my;


import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;


public class TabActivity extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        DatabaseHandler db = new DatabaseHandler(this);

        Log.d("DUPA tabActivity", Integer.toString(db.getRecordCount()));
        db.printAllRecords();

        LisstAdapter adapter = new LisstAdapter(this, db.getAllRecords());
        setListAdapter(adapter);
    }
}
