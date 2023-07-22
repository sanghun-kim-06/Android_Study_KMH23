package com.example.exe230713_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        button1 = (Button) findViewById(R.id.button_d);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] nArr = new String[] {"아이유","아이묭","아이"};
                final boolean[] checkArr = new boolean[] {true, false, false};
                AlertDialog.Builder dlg = new AlertDialog.Builder(ThirdActivity.this);
                dlg.setTitle("제목입니다.");
                dlg.setIcon(R.mipmap.ic_launcher);
//                dlg.setItems(nArr, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        button1.setText(nArr[which]);
//                    }
//                });
//                dlg.setSingleChoiceItems(nArr, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        button1.setText(nArr[which]);
//                    }
//                });
                dlg.setMultiChoiceItems(nArr, checkArr, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        button1.setText(nArr[which]);
                    }
                });
                dlg.setPositiveButton("닫기", null);
                dlg.show();
            }
        });
    }
}
