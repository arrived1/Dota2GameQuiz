package com.dota.my;

import android.app.ListActivity;
import android.os.Bundle;


public class TabActivityDeathMatch extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        DatabaseHandler db = new DatabaseHandler(this, TABLE.DeathMetch);

        ListAdapter adapter = new ListAdapter(this, db.getAllRecords());
        setListAdapter(adapter);
    }
}
