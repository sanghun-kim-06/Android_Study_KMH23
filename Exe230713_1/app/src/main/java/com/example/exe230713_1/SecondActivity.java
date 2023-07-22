package com.example.exe230713_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1, button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.context);
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout_c);
        button1 = (Button) findViewById(R.id.button1_c);
        button2 = (Button) findViewById(R.id.button2_c);
//        컨텍스트메뉴의 위젯 설정
        registerForContextMenu(button1);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mInflater =  getMenuInflater();
        if(v == button1){
            menu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.cmenu1, menu);
        }else if(v == button2) {
            menu.setHeaderTitle("버튼 변경");
            mInflater.inflate(R.menu.cmenu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.itemRed_c:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen_c:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue_c:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate_c:
                button2.setRotation(45);
                return true;
            case R.id.subSize_c:
                button2.setScaleX(2);
                return true;
        }

        return false;
    }
}
