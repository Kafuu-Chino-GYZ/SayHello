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
        button_joinDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Ma1Activity.this,ChatRoomActivity.class);//启动Activity需要创建Intent对象，第一个是一个上下文对象，activity是text一个子类，可以直接用，第二个是class对象
                startActivity(intent1);//启动的入口参数是intent
            }//detail加入 join训练
        });
        button_newDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Ma1Activity.this,NewActivity.class);//启动Activity需要创建Intent对象，第一个是一个上下文对象，activity是text一个子类，可以直接用，第二个是class对象
                startActivity(intent2);//启动的入口参数是intent
            }//new 新建训练
        });
    }
}
