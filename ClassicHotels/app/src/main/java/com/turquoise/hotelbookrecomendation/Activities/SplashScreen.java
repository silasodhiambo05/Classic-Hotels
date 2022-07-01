package com.turquoise.hotelbookrecomendation.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.turquoise.hotelbookrecomendation.R;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
///import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.turquoise.hotelbookrecomendation.R;

public class SplashScreen extends AppCompatActivity {

    protected ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
