package com.example.labtrans1021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;



public class MainActivity2 extends AppCompatActivity {
private Button send_btn;
private EditText set_drink;
private RadioGroup rg1,rg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rg1 = findViewById(R.id.radioGroup);
    }
}