package com.example.k8684.phonemodels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listview = (ListView) findViewById(R.id.listView);

        String[] phones = new String[]{
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu"
        };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < phones.length; ++i) {
            list.add(phones[i]);
        }

        // add data to ArrayAdapter (default Android ListView style/layout)
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.rowlayout, R.id.textView, list);
        PhoneArrayAdapter adapter = new PhoneArrayAdapter(this, list);
        // set data to listView with adapter
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get list row data (now String as a phone name)
                String phone = list.get(position);
                // create an explicit intent
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                // add data to intent
                intent.putExtra("phone",phone);
                // start a new activity
                startActivity(intent);
            }
        });
    }
}