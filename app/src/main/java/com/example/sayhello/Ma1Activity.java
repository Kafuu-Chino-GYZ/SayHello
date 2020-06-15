package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ma1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma1);
        Button button_joinDialog =findViewById(R.id.button_joinDialog);
        Button button_newDialog=findViewById(R.id.button_newDialog);
    }
    public void OpenNew(View v){
        Intent it=new Intent(this,NewActivity.class);
        startActivity(it);
    }
    public void OpenChatRoom(View v){
        Intent it=new Intent(this, chatroomActivity.class);
        startActivity(it);
    }
}
