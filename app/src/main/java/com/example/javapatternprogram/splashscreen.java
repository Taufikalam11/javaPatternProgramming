package com.example.javapatternprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    TextView text1,text2;
    Animation top,bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        text1 =(TextView) findViewById(R.id.textStar);
        text2 =(TextView) findViewById(R.id.textName);

        top = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.mainlogoanimation);
        bottom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sublogoanimation);

        text1.setAnimation(top);
        text2.setAnimation(bottom);
       new  Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(splashscreen.this,MainActivity.class);
               startActivity(intent);
               finish();
           }
       }, 3000);

    }
}