package com.example.bookmarket;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    int index  =0;
    ImageView  menuObj;

    Toolbar toolbar;
    DrawerLayout dLayout;
    NavigationView navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuObj = findViewById(R.id.imageView);

        toolbar = findViewById(R.id.toolbar); // 툴바 아이디 가져오기
        setSupportActionBar(toolbar); // 툴바 출력하기
        navigation = findViewById(R.id.navigation); // 네이게이션바 아이디 가져오기
        dLayout =  findViewById(R.id.drawer_layout); // 네비게이션바 레이아웃 가져오기
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dLayout.openDrawer(Gravity.LEFT);
            }
        });

        navigation.setNavigationItemSelectedListener(this); // 네비게이션바 메뉴 항목 선택 이벤트리스너
    }

    public void onBookClick(View view){

        //Toast.makeText(getApplicationContext(),"도서목록버튼이 클릭되었습니다",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),BookActivity.class);
        startActivity(intent);
    }
    public void onVideoClick(View view){
        Toast.makeText(getApplicationContext(),"동영상강좌버튼이 클릭되었습니다",Toast.LENGTH_LONG).show();
    }

    public void onCustomerClick(View view){
        Toast.makeText(getApplicationContext(),"고객센터버튼이 클릭되었습니다",Toast.LENGTH_LONG).show();
    }

    public void onMyPageClick(View view){
        Toast.makeText(getApplicationContext(),"마이페이지버튼이 클릭되었습니다",Toast.LENGTH_LONG).show();
    }

    public void onImageClick(View view){
        ImageView menuObj  = (ImageView) findViewById(R.id.imageView);
        if (index %2 == 0) menuObj.setImageResource(R.drawable.cover02);
        else menuObj.setImageResource(R.drawable.cover01);
        index++;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu01:
                // Toast.makeText(this, " 메뉴1 : " + item.getTitle(), Toast.LENGTH_SHORT).show();

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog_login, null);
                builder.setView(dialogView);
                AlertDialog dialog = builder.show();

                Button loginBtn   = dialogView.findViewById(R.id.loginBtn);
                loginBtn.setOnClickListener(new View.OnClickListener() { // 네비게이션바의 로그인 매뉴인 메뉴1 클릭 시 로그인 대화상자 불러오기
                    @Override
                    public void onClick(View view) {
                        TextView tvID  = dialogView.findViewById(R.id.userID);
                        TextView tvPW  = dialogView.findViewById(R.id.userPW);

                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "아이디: "+ tvID.getText() + "비밀번호: " + tvPW.getText(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case R.id.menu02:
                Toast.makeText(this, " 메뉴2 : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu03:
                Toast.makeText(this, " 메뉴3 : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        dLayout.closeDrawers();


        return false;
    }

    @Override
    public void onBackPressed() {
        if (dLayout.isDrawerOpen(Gravity.LEFT)) {
            dLayout.closeDrawers();
        } else {

            super.onBackPressed();
        }
    }
}