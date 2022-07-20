package com.tanvi.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    // object creation
private Button myButton;
private EditText et1;
private EditText et2;
private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // initialze
        myButton = findViewById(R.id.sub);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        answer=findViewById(R.id.answer);

// operate click listener
        myButton.setOnClickListener(view -> {
           int num1 =  Integer.parseInt(et1.getText().toString());
           int num2 =  Integer.parseInt(et2.getText().toString());
           int diff = num1 - num2;
           answer.setText( diff+"");

        });
    }
}