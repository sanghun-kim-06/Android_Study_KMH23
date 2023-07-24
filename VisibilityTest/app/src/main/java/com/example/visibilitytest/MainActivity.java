package com.example.visibilitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgView1, imgView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView1 = (ImageView)findViewById(R.id.imgPic1);
        imgView2 = (ImageView)findViewById(R.id.imgPic2);
    }
    public void mOnClick1(View v){
        imgView1.setVisibility(View.INVISIBLE);
    }
    public void mOnClick2(View v){
        imgView1.setVisibility(View.GONE);
    }
    public void mOnClick3(View v){
        imgView1.setVisibility(View.VISIBLE);
    }
};