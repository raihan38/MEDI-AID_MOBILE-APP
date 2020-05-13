package com.example.medicalapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.widget.Toolbar;// here the latest verstion of widget toolbar is androidx so setsupport action bar wasn't working because of using the older version.

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import static android.app.PendingIntent.getActivity;


public class MedicalAlarm extends AppCompatActivity {


    MediTime mediTime;
    int currentHour;
    int currentMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditime);
        //setContentView(R.layout.calendarview);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText alarm;
        alarm=findViewById(R.id.alarm1);

        //ListView listView = findViewById(R.id.listview);

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MedicalAlarm.this,MediTime.class);//definign intent here this is from source activity to destination activity
                startActivity(intent);




            }
            /*public void onEditTextClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,MediTime.class); //definign intent here this is from source activity to destination activity
                startActivity(intent);
            }*/
        });


    }

    private Object getActivity() {
        final MediTime mediTime = this.mediTime;
        return mediTime;

    }
    public void entryAlarm(){

    }
}


