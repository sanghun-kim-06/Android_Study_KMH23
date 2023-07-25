package com.example.bookmarket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {
    ImageView colnme10bj, colnme20bj;
    LinearLayout layout10bj, layout20bj;
    ImageView book110bj, book210bj, book310bj, book410bj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        colnme10bj = findViewById(R.id.books_iv02);
        colnme20bj = findViewById(R.id.books_iv03);
        layout10bj = findViewById(R.id.list_layout01);
        layout20bj = findViewById(R.id.list_layout02);
        book110bj = findViewById(R.id.bookscol1_iv01);
        book210bj = findViewById(R.id.bookscol1_iv02);
        book310bj = findViewById(R.id.bookscol1_iv03);
        book410bj = findViewById(R.id.bookscol1_iv04);

        book110bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(BookActivity.this, "자바 코딩의 기술", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), BookProActivity.class);
                startActivity(intent);
            }
        });
        book210bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookActivity.this, "머신러닝을 다루는 기술", Toast.LENGTH_SHORT).show();
            }
        });
        book310bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookActivity.this, "모던 리눅스 관리", Toast.LENGTH_SHORT).show();
            }
        });
        book410bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookActivity.this, "유니티의 모든것", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.book, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case (R.id.menu_home):
                Toast.makeText(this, "홈메뉴 클릭", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.menu_video):
                Toast.makeText(this, "동영상강좌 클릭", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.menu_customer):
                Toast.makeText(this, "고객센터 클릭", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.menu_mypage):
                Toast.makeText(this, "마이페이지 클릭", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.menu_search):
                Toast.makeText(this, "검색 클릭", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onBookViewClick(View v){
        switch (v.getId()){
            case R.id.books_iv02:
                colnme10bj.setImageResource(R.drawable.list_type1);
                colnme20bj.setImageResource(R.drawable.list_type22);
                layout10bj.setVisibility(View.VISIBLE);
                layout20bj.setVisibility(View.INVISIBLE);
                break;
            case R.id.books_iv03:
                colnme10bj.setImageResource(R.drawable.list_type12);
                colnme20bj.setImageResource(R.drawable.list_type2);
                layout10bj.setVisibility(View.INVISIBLE);
                layout20bj.setVisibility(View.VISIBLE);
                break;
        }
    }
}