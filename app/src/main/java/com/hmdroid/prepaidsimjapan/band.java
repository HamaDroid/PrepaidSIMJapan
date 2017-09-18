package com.hmdroid.prepaidsimjapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class band extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);
    }

        public void menu (View v){
        Intent intent = new Intent(getApplicationContext() , MainActivity.class);
        startActivity(intent);
    }
}
