package com.example.exe230714;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.ImageTransformation;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Intent inIntent = getIntent();
        int result = inIntent.getIntExtra("num1", 0) +
                     inIntent.getIntExtra("num2", 0);
        Toast.makeText(this, "결과 : " + Integer.toString(result), Toast.LENGTH_LONG).show();

        btn2 = (Button) findViewById(R.id.btnReturn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("Hap", result);
                setResult(RESULT_OK, outIntent);
                finish();
            }
        });

    }
}
