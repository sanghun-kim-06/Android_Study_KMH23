package com.example.unimove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FindActivity extends AppCompatActivity {
    ImageView car_iv, bus_iv, ubus_iv, walk_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        car_iv = findViewById(R.id.car_iv);
        bus_iv = findViewById(R.id.bus_iv);
        ubus_iv = findViewById(R.id.ubus_iv);
        walk_iv = findViewById(R.id.walk_iv);

        car_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car_iv.setImageResource(R.drawable.car);
                bus_iv.setImageResource(R.drawable.busclick);
                ubus_iv.setImageResource(R.drawable.ubusclick);
                walk_iv.setImageResource(R.drawable.walkclick);
            }
        });
        bus_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car_iv.setImageResource(R.drawable.carclick);
                bus_iv.setImageResource(R.drawable.bus);
                ubus_iv.setImageResource(R.drawable.ubusclick);
                walk_iv.setImageResource(R.drawable.walkclick);
            }
        });

        ubus_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car_iv.setImageResource(R.drawable.carclick);
                bus_iv.setImageResource(R.drawable.busclick);
                ubus_iv.setImageResource(R.drawable.underbus);
                walk_iv.setImageResource(R.drawable.walkclick);
            }
        });
        walk_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car_iv.setImageResource(R.drawable.carclick);
                bus_iv.setImageResource(R.drawable.busclick);
                ubus_iv.setImageResource(R.drawable.ubusclick);
                walk_iv.setImageResource(R.drawable.walk);
            }
        });


    }
}