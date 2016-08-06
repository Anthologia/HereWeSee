package com.gokathon.monoblack.herewesee;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Pyoung on 2016-08-06.
 */

public class Splash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash) ;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 3000);
    }
}
