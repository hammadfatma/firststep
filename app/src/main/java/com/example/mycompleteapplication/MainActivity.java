package com.example.mycompleteapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button Num;
    Button Pic;
    ImageView img1;
    ImageView img2;
    ImageView img3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num = (Button) findViewById(R.id.Num) ;
        Pic = (Button) findViewById(R.id.Pic) ;
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        Num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Num = new Intent(MainActivity.this, NumberMainActivity.class);
                startActivity(Num);
            }
        });
        Pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pic = new Intent(MainActivity.this, StrokeMainActivity.class);
                startActivity(Pic);
            }
        });
    }

}