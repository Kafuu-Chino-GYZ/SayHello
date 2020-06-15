package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button excriseButton=findViewById(R.id.excrise);
    }
    public void OpenMine(View v){
        Intent it=new Intent(this,Mine.class);
        startActivity(it);
    }
    public void OpenMa1(View v){
        Intent it=new Intent(this,Ma1Activity.class);
        startActivity(it);
    }
}
