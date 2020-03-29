package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class TotalList extends AppCompatActivity {


    String  name ;
    String  date;
    String  quantity;


    ListView totlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_list);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String date = intent.getStringExtra("date");
        String quantity = intent.getStringExtra("quantity");


        totlist = (ListView)findViewById(R.id.totlist);

        ArrayList<HashMap<String, Object>> data_name = new ArrayList<HashMap<String, Object>>();

            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("date", date);
            map.put("quantity", quantity);
            data_name.add(map);

        String [] keys = {"name", "date", "quantity"};
        int [] ids = {R.id.textView5, R.id.textView6, R.id.textView7};

        SimpleAdapter adapter = new SimpleAdapter(this, data_name, R.layout.list, keys, ids);
        totlist.setAdapter(adapter);
    }
}
