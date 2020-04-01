package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

public class TotalList extends AppCompatActivity {

    ListView totlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_list);

        totlist = (ListView)findViewById(R.id.totlist);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String date = intent.getStringExtra("date");
        String quantity = intent.getStringExtra("quantity");

        if(name!=null) {
            ArrayList<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();

            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("date", date);
            map.put("quantity", quantity);
            data.add(map);

            String[] keys = {"name", "date", "quantity"};
            int[] ids = {R.id.textView5, R.id.textView6, R.id.textView7};

            SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.data_list, keys, ids);
            totlist.setAdapter(adapter);

        }
    }
}
