package com.example.mit.test1mit;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton,imageButton1,imageButton2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton1=(ImageButton)findViewById(R.id.imageButton2);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about=new Intent(MainActivity.this,aboutActivity.class);
                startActivity(about);
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile=new Intent(MainActivity.this,profileActivity.class);
                startActivity(profile);
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song=new Intent(MainActivity.this,songsActivity.class);
                startActivity(song);
            }
        });

    }

}
