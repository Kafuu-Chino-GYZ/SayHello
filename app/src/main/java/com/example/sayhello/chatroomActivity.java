package com.example.sayhello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;;

/**
 * Created by DELL on 2020/6/12.
 */


public class chatroomActivity extends Activity {

    Chronometer ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);

        ImageView imageView1 = (ImageView) findViewById(R.id.member1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(view);
                openContextMenu(view);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.member2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(view);
                openContextMenu(view);
            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.member3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(view);
                openContextMenu(view);
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.member4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(view);
                openContextMenu(view);
            }
        });

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,    //计时器
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ch = findViewById(R.id.clo1);
        ch.setBase(SystemClock.elapsedRealtime());
        ch.setFormat("%s");
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if(SystemClock.elapsedRealtime()-ch.getBase()>= 120000){
                    ch.stop();
                }
            }
        });

        ImageButton imageButton = findViewById(R.id.xuanxiang);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOptionsMenu();
            }
        });

        Button clobuts = findViewById(R.id.clobuts);
        clobuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch.setBase(SystemClock.elapsedRealtime());
                ch.start();
            }
        });

        Button clobutc = findViewById(R.id.clobutc);
        clobutc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch.stop();
            }
        });

    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("添加好友");
        menu.add("查看信息");
        menu.add("举报");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.xuanlan1:
                Intent intent = new Intent(chatroomActivity.this,Mine.class);
                startActivity(intent);
                break;
            case R.id.xuanlan2:
                //弹出本次的信息 之后再写

                break;
            case R.id.xuanlan3:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}

