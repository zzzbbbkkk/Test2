package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button b_point;
    private Button b_jia;
    private Button b_jian;
    private Button b_deng;
    private Button b_cheng;
    private Button b_chu;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        b0=findViewById(R.id.btn_0);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        b_point=findViewById(R.id.btn_point);
        b_jia=findViewById(R.id.btn_add);
        b_deng=findViewById(R.id.btn_equal);
        b_jian=findViewById(R.id.btn_empty);
        b_cheng=findViewById(R.id.btn_multiply);
        b_chu=findViewById(R.id.btn_subtract);

    }


}