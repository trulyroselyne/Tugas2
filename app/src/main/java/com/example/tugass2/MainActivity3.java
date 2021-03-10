package com.example.tugass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void btnbth2(View view) {
        Intent a = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(a);
    }

    public void btnartikel2(View view) {
        Intent a = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(a);
    }
}