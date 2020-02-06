package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = (TextView) findViewById(R.id.textView2);
        //Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        float Input = bundle.getFloat("message");
        float exchange = (float) 0.77;
        float end = exchange * Input;
        String output = Float.toString(end);
        textView2.setText("£" + output);
    }
}
