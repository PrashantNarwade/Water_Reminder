package com.example.water_reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Animation top;
ImageView i;
private static int SPLASH_SCREEN=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        top=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        i=findViewById(R.id.i1);
        i.startAnimation(top);
        //top= AnimationUtils.loadAnimation();
        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i11=new Intent(MainActivity.this,Login.class);
                startActivity(i11);
                finish();
            }
        },SPLASH_SCREEN);
    }

}