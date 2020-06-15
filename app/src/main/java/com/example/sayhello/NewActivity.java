package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    RadioButton rt;
    RadioButton rd;
    RadioButton ra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);//对应显示new
        RadioGroup radtheme=findViewById(R.id.radTheme);
        RadioGroup raddifficulty=findViewById(R.id.radDifficulty);
        RadioGroup radanonymity=findViewById(R.id.radAnonymity);


        //获取主题
        radtheme.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rt=findViewById(checkedId);
                rt.getText();
                Toast.makeText(NewActivity.this,"主题："+rt.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        //获取难度
        raddifficulty.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rd=findViewById(checkedId);
                rd.getText();
                Toast.makeText(NewActivity.this,"难度："+rd.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        //获取匿名性
        radanonymity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ra=findViewById(checkedId);
                ra.getText();
                Toast.makeText(NewActivity.this,"匿名："+ra.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        Button savebutton=findViewById(R.id.save);
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String theme=rt.getText().toString();
                String difficulty=rd.getText().toString() ;
                String anonymity=ra.getText().toString();
                //如果信息填写完整，如果（）里面的内容不等于“”这个空字符串，也就是非空
                if(!"".equals(theme)&& !"".equals(difficulty)&& !"".equals(anonymity)){
                    Intent intent=new Intent(NewActivity.this,chatroomActivity.class);//要填赵一泽的那个页面！！
                    Bundle bundle=new Bundle();
                    bundle.putCharSequence("主题",theme);
                    bundle.putCharSequence("难度",difficulty);
                    bundle.putCharSequence("匿名",anonymity);
                    intent.putExtras(bundle);//传递  赵一泽写好了直接填
                    startActivity(intent);//启动另一个activity，并传递 赵一泽写好了直接填
                }
                else{
                    Toast.makeText(NewActivity.this,"请完成选项！",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}
