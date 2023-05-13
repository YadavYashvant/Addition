package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button sum_button;
    TextView sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        sum = findViewById(R.id.sum);
        sum_button = findViewById(R.id.sum_button);
        sum_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum_text = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                sum.setText("Sum is " + sum_text);
            }
        });

    }
}