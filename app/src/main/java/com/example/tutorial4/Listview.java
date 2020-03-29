package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }

    public void moveColdList(View view) {
        Intent intent = new Intent(this, ColdList.class);
        startActivity(intent);
    }

    public void moveFrozenList(View view) {
        Intent intent = new Intent(this, FrozenList.class);
        startActivity(intent);
    }

    public void moveRoomList(View view) {
        Intent intent= new Intent(this, RoomList.class);
        startActivity(intent);
    }

    public void moveTotalList(View view) {
        Intent intent = new Intent(this, TotalList.class);
        startActivity(intent);
    }
}
