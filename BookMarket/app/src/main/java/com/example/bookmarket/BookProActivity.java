package com.example.bookmarket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BookProActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_pro);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bookpro, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case(R.id.menu_home):
                Toast.makeText(this, "홈메뉴 클릭", Toast.LENGTH_SHORT).show();
                Intent home_intent = new Intent(this, MainActivity.class);
                startActivity(home_intent);
                break;
            case(R.id.menu_list):
                Toast.makeText(this, "도서목록 클릭", Toast.LENGTH_SHORT).show();
                Intent book_intent = new Intent(this, BookActivity.class);
                startActivity(book_intent);
                break;
            case(R.id.menu_cart):
                Toast.makeText(this, "장바구니 클릭", Toast.LENGTH_SHORT).show();
                break;
                
        }
        return super.onOptionsItemSelected(item);
    }


}