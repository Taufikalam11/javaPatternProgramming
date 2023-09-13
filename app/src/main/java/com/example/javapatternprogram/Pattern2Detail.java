package com.example.javapatternprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pattern2Detail extends AppCompatActivity {
    TextView NameofCode;
    TextView NameOfDesc;
    TextView Butoon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern2_detail);

        NameofCode = findViewById(R.id.pattern2text);
        NameOfDesc = findViewById(R.id.textPatternDesc);

        NameofCode.setText(getIntent().getStringExtra("NameCode"));
        NameOfDesc.setText(getIntent().getStringExtra("textDesc"));
        Butoon = findViewById(R.id.textView);
        Butoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

    }

   
}