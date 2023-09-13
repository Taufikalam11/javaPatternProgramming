package com.example.javapatternprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PatternDetail extends AppCompatActivity {

    TextView txtPatternName;
    ImageView PatternImage;
   TextView button;



    @SuppressLint({"CutPasteId", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_pattern_detail);
        PatternImage = findViewById(R.id.patternImg);
        txtPatternName = findViewById(R.id.tvDesc);

        PatternImage.setImageResource(getIntent().getIntExtra("Image", 0));

        txtPatternName.setText(getIntent().getStringExtra("desc"));
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });







    }


}