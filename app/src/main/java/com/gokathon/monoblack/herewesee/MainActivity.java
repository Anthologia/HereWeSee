package com.gokathon.monoblack.herewesee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Splash(로딩화면) 띄우기
        startActivity(new Intent(this, Splash.class)); // in onCreate()
    }
}
