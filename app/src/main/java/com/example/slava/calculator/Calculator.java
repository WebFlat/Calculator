package com.example.slava.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    //Добавляем элементы
    TextView textView;
    TextView result;
    TextView tvClear;
    TextView tvOpen;
    TextView tvClose;
    TextView tvDev;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tvMul;
    TextView tvMin;
    TextView tvPlus;
    TextView tvDot;
    TextView tv0;
    TextView tvBack;
    TextView tvEqual;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Находим элементы
        textView =(TextView) findViewById(R.id.textView);
        result =(TextView) findViewById(R.id.result);
        tvClear =(TextView) findViewById(R.id.tvClear);
        tvOpen =(TextView) findViewById(R.id.tvOpen);
        tvClose =(TextView) findViewById(R.id.tvClose);
        tvDev =(TextView) findViewById(R.id.tvDev);
        tv1 =(TextView) findViewById(R.id.tv1);
        tv2 =(TextView) findViewById(R.id.tv2);
        tv3 =(TextView) findViewById(R.id.tv3);
        tv4 =(TextView) findViewById(R.id.tv4);
        tv5 =(TextView) findViewById(R.id.tv5);
        tv6 =(TextView) findViewById(R.id.tv6);
        tv7 =(TextView) findViewById(R.id.tv7);
        tv8 =(TextView) findViewById(R.id.tv8);
        tv9 =(TextView) findViewById(R.id.tv9);
        tvMul =(TextView) findViewById(R.id.tvMul);
        tvMin =(TextView) findViewById(R.id.tvMin);
        tvPlus =(TextView) findViewById(R.id.tvPlus);
        tvDot =(TextView) findViewById(R.id.tvDot);
        tv0 =(TextView) findViewById(R.id.tv0);
        tvBack =(TextView) findViewById(R.id.tvBack);
        tvEqual =(TextView) findViewById(R.id.tvEqual);





    }
}
