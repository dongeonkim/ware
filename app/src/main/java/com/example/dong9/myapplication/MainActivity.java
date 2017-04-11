package com.example.dong9.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("TAG", "onCreate메소드를 호출함 ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        Log.e("TAG", "onDestroy메소드를 호출함" );
        super.onDestroy();
    }
}
