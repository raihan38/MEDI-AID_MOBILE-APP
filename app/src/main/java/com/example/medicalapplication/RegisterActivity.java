package com.example.medicalapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText eml,pass,cnf,alreg;
    Button ln,reg;
    DatabaseHelper mdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mdb = new DatabaseHelper(this);
        eml = findViewById(R.id.eml);
        pass = findViewById(R.id.pass);
        cnf = findViewById(R.id.cnfpas);
        alreg = findViewById(R.id.alreg);
        ln = findViewById(R.id.vi);
        reg = findViewById(R.id.reg);

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(t);
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddData();
            }
        });
    }
    public  void AddData() {
        boolean isInserted = mdb.insertData(eml.getText().toString(), pass.getText().toString());
        if (isInserted == true)
            Toast.makeText(RegisterActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(RegisterActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();
    }

}
