package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddList extends AppCompatActivity {

    private TextView textView_Date;
    private DatePickerDialog.OnDateSetListener callbackMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);

        this.InitializeView();
        this.InitializeListener();
    }

    public void InitializeView() {
        textView_Date = (TextView)findViewById(R.id.editText_date);
    }

    public void InitializeListener() {

        callbackMethod = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                textView_Date.setText(year + "년" + (monthOfYear +1)+ "월" + dayOfMonth + "일");
            }
        };
    }

    public void viewDate(View view) {
        DatePickerDialog dialog = new DatePickerDialog(this, callbackMethod, 2019, 5, 24);

        dialog.show();
    }

    public void nowDate(View view) {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");

        Date time = new Date();

        String time1 = format1.format(time);

        textView_Date.setText(time1);

    }
}
