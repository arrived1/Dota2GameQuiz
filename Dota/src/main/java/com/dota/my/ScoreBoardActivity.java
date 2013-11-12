package com.dota.my;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("ALL")
public class ScoreBoardActivity extends android.app.TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        // create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");


        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        tab1.setIndicator("Single Random");
        tab1.setContent(new Intent(this, TabActivitySingleRandom.class));

        tab2.setIndicator("Death Match");
        tab2.setContent(new Intent(this, TabActivityDeathMatch.class));


        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
    }
}

