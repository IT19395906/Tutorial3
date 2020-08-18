package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    EditText et3;
    EditText et4;
    String number1;
    String number2;
    int n1;
    int n2;
    TextView txtsum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et3 = findViewById(R.id.editTextNumber3);
        et4 = findViewById(R.id.editTextNumber4);
        txtsum = findViewById(R.id.textView5);

        Intent intent = getIntent();

         intent.getStringExtra("n1");
         intent.getStringExtra("n2");

        et3.setText(number1);
        et4.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }

    public void add(View view){

        txtsum.setText(number1 + "+" + number2 + "=" + (n1+n2));
    }
    public void substract(View view){

        txtsum.setText(number1 + "-" + number2 + "=" + (n1-n2));
    }
    public void multiply(View view){

        txtsum.setText(number1 + "x" + number2 + "=" + (n1*n2));
    }
    public void devide(View view){

        txtsum.setText(number1 + "/" + number2 + "=" + (n1/n2));
    }
}