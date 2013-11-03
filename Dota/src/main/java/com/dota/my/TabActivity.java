package com.dota.my;

import android.app.ListActivity;
import android.os.Bundle;


public class TabActivity extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        DatabaseHandler db = new DatabaseHandler(this);

        ListAdapter adapter = new ListAdapter(this, db.getAllRecords());
        setListAdapter(adapter);
    }
}