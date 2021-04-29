package com.example.demoexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSuperman, tvBatman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSuperman = (TextView) findViewById(R.id.textViewSuperman);
        tvBatman = (TextView) findViewById(R.id.textViewBatman);

        tvSuperman.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Hero Superman = new Hero("Superman", 100, 60);
                Intent i = new Intent(MainActivity.this, HeroStatsActivity.class);
                i.putExtra("hero", Superman);
                startActivity(i);
            }
        });
        tvBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hero Batman = new Hero("Batman", 60, 90);
                Intent i = new Intent(MainActivity.this, HeroStatsActivity.class);
                i.putExtra("hero", Batman);
                startActivity(i);
            }
        });
    }
}