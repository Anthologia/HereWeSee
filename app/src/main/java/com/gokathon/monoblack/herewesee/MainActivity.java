package com.gokathon.monoblack.herewesee;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    //음악 파일 가져오기
    SoundPool soundpool;
    int C;
    int Cs;
    int D;
    int Ds;
    int E;
    int F;
    int Fs;
    int G;
    int Gs;
    int A;
    int As;
    int B;

    //첫노트
    LinearLayout first;
    TextView first_note;
    TextView first_hex;
    TextView first_rgb;

    //두번째 노트
    LinearLayout second;
    TextView second_note;
    TextView second_hex;
    TextView second_rgb;

    //세번째 노트
    LinearLayout third;
    TextView third_note;
    TextView third_hex;
    TextView third_rgb;

    //네번째 노트
    LinearLayout fourth;
    TextView fourth_note;
    TextView fourth_hex;
    TextView fourth_rgb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundpool=new SoundPool(4,AudioManager.STREAM_MUSIC,0);
        C=soundpool.load(this,R.raw.cs,1);
        Cs=soundpool.load(this,R.raw.c,1);
        D=soundpool.load(this,R.raw.d,1);
        Ds=soundpool.load(this,R.raw.ds,1);
        E=soundpool.load(this,R.raw.e,1);
        F=soundpool.load(this,R.raw.fs,1);
        Fs=soundpool.load(this,R.raw.f,1);
        G=soundpool.load(this,R.raw.gs,1);
        Gs=soundpool.load(this,R.raw.g,1);
        A=soundpool.load(this,R.raw.a,1);
        As=soundpool.load(this,R.raw.as,1);
        B=soundpool.load(this,R.raw.b,1);



        first = (LinearLayout)findViewById(R.id.first);
        first_note=(TextView)findViewById(R.id.first_note);
        first_hex=(TextView)findViewById(R.id.first_hex);
        first_rgb=(TextView)findViewById(R.id.first_rgb);
        //첫번째 노트 가져오기

        second = (LinearLayout)findViewById(R.id.second);
        second_note=(TextView)findViewById(R.id.second_note);
        second_hex=(TextView)findViewById(R.id.second_hex);
        second_rgb=(TextView)findViewById(R.id.second_rgb);
        //두번째 노트 가져오기

        third = (LinearLayout)findViewById(R.id.third);
        third_note=(TextView)findViewById(R.id.third_note);
        third_hex=(TextView)findViewById(R.id.third_hex);
        third_rgb=(TextView)findViewById(R.id.third_rgb);
        //세번째 노트 가져오기

        fourth = (LinearLayout)findViewById(R.id.fourth);
        fourth_note=(TextView)findViewById(R.id.fourth_note);
        fourth_hex=(TextView)findViewById(R.id.fourth_hex);
        fourth_rgb=(TextView)findViewById(R.id.fourth_rgb);
        //네번째 노트 가져오기

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFFFC3A51));
        //액션바 색깔 바꾸기



        // Splash(로딩화면) 띄우기
        startActivity(new Intent(this, Splash.class)); // in onCreate()
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // 선택된 메뉴에 따라 텍스트뷰 배경색상 변경하기
        int id = item.getItemId();

        switch(id){

            case R.id.C: // R.id.출력할 음
                first.setBackgroundResource(R.color.C); // 배경색상(Ex, C의 색상)
                first_note.setText(R.string.name3);     // 해당 음계 이름(Ex, C, Ds, ...)
                first_hex.setText(R.string.hex3);       // 색상값을 hex값으로 표현
                first_rgb.setText(R.string.rgb3);       // 색상값을 RGB값으로 표현
                soundpool.play(C, 1, 1, 0, 1, 1);       // 해당 음을 스피커로 출력

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null); // 3음으로 구성된 화음은 Null값 대입
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Cm:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Cdim:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Caug:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Csus4:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Csus2:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Cmaj7:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cmi_maj7:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cm7:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cm7_b5:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cdim7:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cmaj7_s5:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Caug7:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.C7sus4:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.C7sus2:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.C7:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.C6:
                first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cm6:first.setBackgroundResource(R.color.C);
                first_note.setText(R.string.name3);
                first_hex.setText(R.string.hex3);
                first_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cs:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Csm:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Csdim:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Csaug:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Cssus4:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Cssus2:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Csmaj7:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csmi_maj7:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csm7:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csm7_b5:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csdim7:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csmaj7_s5:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csaug7:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cs7sus4:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cs7sus2:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cs7:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Cs6:
                first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Csm6:first.setBackgroundResource(R.color.Cs);
                first_note.setText(R.string.name4);
                first_hex.setText(R.string.hex4);
                first_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.D:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dm:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Ddim:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Daug:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dsus4:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dsus2:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dmaj7:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dmi_maj7:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dm7:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dm7_b5:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ddim7:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Gs);
                third_note.setText(R.string.name11);
                third_hex.setText(R.string.hex11);
                third_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dmaj7_s5:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Daug7:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.D7sus4:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.D7sus2:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.D7:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.D6:
                first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dm6:first.setBackgroundResource(R.color.D);
                first_note.setText(R.string.name5);
                first_hex.setText(R.string.hex5);
                first_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.B);
                fourth_note.setText(R.string.name2);
                fourth_hex.setText(R.string.hex2);
                fourth_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ds:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dsm:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dsdim:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dsaug:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dssus4:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dssus2:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Dsmaj7:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsmi_maj7:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsm7:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsm7_b5:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsdim7:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.A);
                third_note.setText(R.string.name0);
                third_hex.setText(R.string.hex0);
                third_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsmaj7_s5:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsaug7:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ds7sus4:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ds7sus2:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.F);
                second_note.setText(R.string.name8);
                second_hex.setText(R.string.hex8);
                second_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ds7:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ds6:
                first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Dsm6:first.setBackgroundResource(R.color.Ds);
                first_note.setText(R.string.name6);
                first_hex.setText(R.string.hex6);
                first_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name3);
                fourth_hex.setText(R.string.hex3);
                fourth_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.E:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Em:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Edim:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Eaug:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Esus4:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Esus2:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Emaj7:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Emi_maj7:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Em7:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Em7_b5:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Edim7:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.As);
                third_note.setText(R.string.name1);
                third_hex.setText(R.string.hex1);
                third_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Emaj7_s5:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Eaug7:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.E7sus4:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.E7sus2:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Fs);
                second_note.setText(R.string.name9);
                second_hex.setText(R.string.hex9);
                second_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.E7:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.E6:
                first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Cs);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.Em6:first.setBackgroundResource(R.color.E);
                first_note.setText(R.string.name7);
                first_hex.setText(R.string.hex7);
                first_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.C);
                fourth_note.setText(R.string.name4);
                fourth_hex.setText(R.string.hex4);
                fourth_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                return true;


            case R.id.F:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fm:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fdim:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Faug:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fsus4:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fsus2:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fmaj7:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fmi_maj7:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fm7:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fm7_b5:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fdim7:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.B);
                third_note.setText(R.string.name2);
                third_hex.setText(R.string.hex2);
                third_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fmaj7_s5:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Faug7:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.F7sus4:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.F7sus2:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.G);
                second_note.setText(R.string.name10);
                second_hex.setText(R.string.hex10);
                second_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.F7:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.F6:
                first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fm6:first.setBackgroundResource(R.color.F);
                first_note.setText(R.string.name8);
                first_hex.setText(R.string.hex8);
                first_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.D);
                fourth_note.setText(R.string.name5);
                fourth_hex.setText(R.string.hex5);
                fourth_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fs:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fsm:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fsdim:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fsaug:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fssus4:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fssus2:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Fsmaj7:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsmi_maj7:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsm7:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsm7_b5:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsdim7:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.C);
                third_note.setText(R.string.name3);
                third_hex.setText(R.string.hex3);
                third_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsmaj7_s5:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsaug7:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fs7sus4:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fs7sus2:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Gs);
                second_note.setText(R.string.name11);
                second_hex.setText(R.string.hex11);
                second_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fs7:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fs6:
                first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.Fsm6:first.setBackgroundResource(R.color.Fs);
                first_note.setText(R.string.name9);
                first_hex.setText(R.string.hex9);
                first_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Ds);
                fourth_note.setText(R.string.name6);
                fourth_hex.setText(R.string.hex6);
                fourth_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                return true;


            case R.id.G:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gm:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gdim:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gaug:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gsus4:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gsus2:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gmaj7:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gmi_maj7:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gm7:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gm7_b5:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gdim7:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Cs);
                third_note.setText(R.string.name4);
                third_hex.setText(R.string.hex4);
                third_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gmaj7_s5:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gaug7:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.G7sus4:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.G7sus2:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.A);
                second_note.setText(R.string.name0);
                second_hex.setText(R.string.hex0);
                second_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.G7:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.G6:
                first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gm6:first.setBackgroundResource(R.color.G);
                first_note.setText(R.string.name10);
                first_hex.setText(R.string.hex10);
                first_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.E);
                fourth_note.setText(R.string.name7);
                fourth_hex.setText(R.string.hex7);
                fourth_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gs:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gsm:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gsdim:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gsaug:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gssus4:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gssus2:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Gsmaj7:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsmi_maj7:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsm7:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsm7_b5:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsdim7:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.D);
                third_note.setText(R.string.name5);
                third_hex.setText(R.string.hex5);
                third_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsmaj7_s5:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsaug7:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gs7sus4:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gs7sus2:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.As);
                second_note.setText(R.string.name1);
                second_hex.setText(R.string.hex1);
                second_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gs7:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gs6:
                first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Gsm6:first.setBackgroundResource(R.color.Gs);
                first_note.setText(R.string.name11);
                first_hex.setText(R.string.hex11);
                first_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name8);
                fourth_hex.setText(R.string.hex8);
                fourth_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.A:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Am:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Adim:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Aaug:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Asus4:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Asus2:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Amaj7:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Ami_maj7:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Am7:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Am7_b5:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Adim7:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Ds);
                third_note.setText(R.string.name6);
                third_hex.setText(R.string.hex6);
                third_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Amaj7_s5:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Aaug7:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.A7sus4:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.A7sus2:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.B);
                second_note.setText(R.string.name2);
                second_hex.setText(R.string.hex2);
                second_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.A7:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.A6:
                first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Fs);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.Am6:first.setBackgroundResource(R.color.A);
                first_note.setText(R.string.name0);
                first_hex.setText(R.string.hex0);
                first_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.F);
                fourth_note.setText(R.string.name9);
                fourth_hex.setText(R.string.hex9);
                fourth_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                return true;


            case R.id.As:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Asm:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Asdim:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Asaug:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Assus4:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Assus2:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Asmaj7:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asmi_maj7:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asm7:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asm7_b5:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asdim7:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.E);
                third_note.setText(R.string.name7);
                third_hex.setText(R.string.hex7);
                third_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asmaj7_s5:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asaug7:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.As7sus4:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.As7sus2:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.C);
                second_note.setText(R.string.name3);
                second_hex.setText(R.string.hex3);
                second_rgb.setText(R.string.rgb3);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.As7:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.As6:
                first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Asm6:first.setBackgroundResource(R.color.As);
                first_note.setText(R.string.name1);
                first_hex.setText(R.string.hex1);
                first_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name10);
                fourth_hex.setText(R.string.hex10);
                fourth_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;
            
            case R.id.B:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Bm:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Bdim:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Baug:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Bsus4:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Bsus2:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Null);
                fourth_note.setText(R.string.Null);
                fourth_hex.setText(R.string.Null);
                fourth_rgb.setText(R.string.Null);

                return true;


            case R.id.Bmaj7:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Bmi_maj7:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Bm7:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Bm7_b5:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Bdim7:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.F);
                third_note.setText(R.string.name8);
                third_hex.setText(R.string.hex8);
                third_rgb.setText(R.string.rgb8);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Bmaj7_s5:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.As);
                fourth_note.setText(R.string.name1);
                fourth_hex.setText(R.string.hex1);
                fourth_rgb.setText(R.string.rgb1);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.Baug7:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.G);
                third_note.setText(R.string.name10);
                third_hex.setText(R.string.hex10);
                third_rgb.setText(R.string.rgb10);
                soundpool.play(G, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.B7sus4:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.E);
                second_note.setText(R.string.name7);
                second_hex.setText(R.string.hex7);
                second_rgb.setText(R.string.rgb7);
                soundpool.play(E, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.B7sus2:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Cs);
                second_note.setText(R.string.name4);
                second_hex.setText(R.string.hex4);
                second_rgb.setText(R.string.rgb4);
                soundpool.play(C, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.B7:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.A);
                fourth_note.setText(R.string.name0);
                fourth_hex.setText(R.string.hex0);
                fourth_rgb.setText(R.string.rgb0);
                soundpool.play(A, 1, 1, 0, 1, 1);

                return true;


            case R.id.B6:
                first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.Ds);
                second_note.setText(R.string.name6);
                second_hex.setText(R.string.hex6);
                second_rgb.setText(R.string.rgb6);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.Gs);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;


            case R.id.Bm6:first.setBackgroundResource(R.color.B);
                first_note.setText(R.string.name2);
                first_hex.setText(R.string.hex2);
                first_rgb.setText(R.string.rgb2);
                soundpool.play(B, 1, 1, 0, 1, 1);

                second.setBackgroundResource(R.color.D);
                second_note.setText(R.string.name5);
                second_hex.setText(R.string.hex5);
                second_rgb.setText(R.string.rgb5);
                soundpool.play(D, 1, 1, 0, 1, 1);

                third.setBackgroundResource(R.color.Fs);
                third_note.setText(R.string.name9);
                third_hex.setText(R.string.hex9);
                third_rgb.setText(R.string.rgb9);
                soundpool.play(F, 1, 1, 0, 1, 1);

                fourth.setBackgroundResource(R.color.G);
                fourth_note.setText(R.string.name11);
                fourth_hex.setText(R.string.hex11);
                fourth_rgb.setText(R.string.rgb11);
                soundpool.play(G, 1, 1, 0, 1, 1);

                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
