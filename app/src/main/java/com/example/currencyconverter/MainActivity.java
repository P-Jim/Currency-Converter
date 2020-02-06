package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction (View view){
        EditText myText = (EditText) findViewById(R.id.editText);
        String str = myText.getText().toString();
        try{
            float value = Float.parseFloat(str);
            goToActivity2(value);
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "Invalid input, please only input a number", Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void goToActivity2 (float s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}
