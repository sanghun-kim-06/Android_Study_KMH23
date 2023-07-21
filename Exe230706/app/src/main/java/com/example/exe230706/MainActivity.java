package com.example.exe230706;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.padding_magin);

        TextView tv1, tv2, tv3;
        tv1 = (TextView)findViewById(R.id.textView1);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);

        tv1.setText("안녕하다.");
        tv1.setTextColor(Color.CYAN);
        tv2.setTextSize(30);
        tv2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        tv3.setText("바람보다빠르게눈물보다빠르게하늘보다높게별보다밝게 뛰어널뛰며 숨쉬는 나는");
        tv3.setSingleLine();
    }
}