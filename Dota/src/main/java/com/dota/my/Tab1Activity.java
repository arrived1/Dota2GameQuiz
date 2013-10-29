package com.dota.my;

import android.app.Activity;
import android.app.ListActivity;
import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Tab1Activity extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        // 1. pass context and data to the custom adapter
        LisstAdapter adapter = new LisstAdapter(this, generateData());

        //2. setListAdapter
        setListAdapter(adapter);
    }

    private ArrayList<DataBaseRecord> generateData() {
        ArrayList<DataBaseRecord> items = new ArrayList<DataBaseRecord>();
        items.add(new DataBaseRecord(1,1, 1, ""));
        items.add(new DataBaseRecord(1,1, 1, ""));
        items.add(new DataBaseRecord(1,1, 1, ""));

        return items;
    }
}



//public class Tab1Activity extends Activity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview_activity);
//
//        final ListView listview = (ListView) findViewById(R.id.listview);
//        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
//                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
//                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
//                "Android", "iPhone", "WindowsMobile" };
//
//        final ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < values.length; ++i) {
//            list.add(values[i]);
//        }
//        final StableArrayAdapter adapter = new StableArrayAdapter(this,
//                            android.R.layout.simple_list_item_1, list);
//        listview.setAdapter(adapter);
//
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, final View view,
//                                    int position, long id) {
//                final String item = (String) parent.getItemAtPosition(position);
//                view.animate().setDuration(2000).alpha(0)
//                        .withEndAction(new Runnable() {
//                            @Override
//                            public void run() {
//                                list.remove(item);
//                                adapter.notifyDataSetChanged();
//                                view.setAlpha(1);
//                            }
//                        });
//            }
//
//        });
//    }
//
//    private class StableArrayAdapter extends ArrayAdapter<String> {
//
//        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();
//
//        public StableArrayAdapter(Context context, int textViewResourceId,
//                                  List<String> objects) {
//            super(context, textViewResourceId, objects);
//            for (int i = 0; i < objects.size(); ++i) {
//                mIdMap.put(objects.get(i), i);
//            }
//        }
//
//        @Override
//        public long getItemId(int position) {
//            String item = getItem(position);
//            return mIdMap.get(item);
//        }
//
//        @Override
//        public boolean hasStableIds() {
//            return true;
//        }
//
//    }
//
//}

//public class Tab1Activity  extends Activity
//{
//    @Override
//    public void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//
//        TextView tv=new TextView(this);
//        tv.setTextSize(25);
//        tv.setGravity(Gravity.CENTER_VERTICAL);
//        tv.setText("This Is Tab1 Activity");
//
//        setContentView(tv);
//    }
//}
