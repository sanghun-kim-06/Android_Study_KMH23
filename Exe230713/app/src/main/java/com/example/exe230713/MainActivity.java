package com.example.exe230713;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {
    Button btnClick;
    TextView tvClick, tv1, tvN10, tvN50, tvN100, tvN200, tvN300;
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("탭 호스트 만들기");

        // 1번, 탭호스트 만들기
        TabHost tabHost = getTabHost();
        // 2번, 탭스펙 만들기
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("5626");
        // 3번, 탭스펙에 내용 연결
        tabSpecSong.setContent(R.id.tabSong);
        // 4번, 탭호스트에 탭스펙을 추가
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("시간의 조악성");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("욕망의 항아리");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);

        btnClick = (Button) findViewById(R.id.btnClick);
        tvClick = (TextView) findViewById(R.id.tvClick);
        tv1 = (TextView) findViewById(R.id.tv1);
        tvN10 = (TextView) findViewById(R.id.tvN10) ;
        tvN50 = (TextView) findViewById(R.id.tvN50) ;
        tvN100 = (TextView) findViewById(R.id.tvN100) ;
        tvN200 = (TextView) findViewById(R.id.tvN200) ;
        tvN300 = (TextView) findViewById(R.id.tvN300) ;

        tv1.setText("시간을 잡고싶다는 인간의 원초적 욕망을 표현한다. 타임피커로 아무리 시간을 누르고, 지켜봐도 결국 흘러가는 시간을 바라볼 뿐이다.");

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = n + 1;
                String str = n + "번";
                tvClick.setText(str);
                if(n > 10){
                    tvN10.setVisibility(View.VISIBLE);
                }
                if(n > 50){
                    tvN50.setVisibility(View.VISIBLE);
                }
                if(n > 100){
                    tvN100.setVisibility(View.VISIBLE);
                }
                if(n > 200){
                    tvN200.setVisibility(View.VISIBLE);
                }
                if(n > 300){
                    tvN300.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}