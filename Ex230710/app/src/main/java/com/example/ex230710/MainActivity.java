package com.example.ex230710;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoImg1, rdoImg2, rdoImg3;
    Button btnOK;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("21세기 락스타의 정신세계");
        text1 = (TextView)findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        text2 = (TextView)findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoImg1 = (RadioButton) findViewById(R.id.RdoImg1);
        rdoImg2 = (RadioButton) findViewById(R.id.RdoImg2);
        rdoImg3 = (RadioButton) findViewById(R.id.RdoImg3);
        btnOK = (Button)findViewById(R.id.BtnOK);
        img = (ImageView) findViewById(R.id.ImgCyberfunk);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoImg1: img.setImageResource(R.drawable.img1); break;
                    case R.id.RdoImg2: img.setImageResource(R.drawable.img2); break;
                    case R.id.RdoImg3: img.setImageResource(R.drawable.img3); break;
                    default:
                        Toast.makeText(MainActivity.this, "정신세계를 선택하세요ㅁ?ㅁ,.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}