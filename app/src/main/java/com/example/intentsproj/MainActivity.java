package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Toast toast;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        et1 = findViewById(R.id.editTextNumber);
        et2 = findViewById(R.id.editTextNumber2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence text = "you just click the ok button";
                int duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context,text,duration);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("n1",et1.getText().toString());
                intent.putExtra("n2",et2.getText().toString());
                startActivity(intent);
            }
        });
    }

   // protected void openSecond(View view){
   //     Intent intent= new Intent(MainActivity.this,SecondActivity.class);
    //    intent.putExtra("n1",et1.getText().toString());
    //    intent.putExtra("n2",et2.getText().toString());

     //   startActivity(intent);
   // }
}
