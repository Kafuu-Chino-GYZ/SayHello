package com.example.sayhello;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WaitJoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_join);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String theme=bundle.getString("theme");
        String difficulty=bundle.getString("difficulty");
        String anonymity=bundle.getString("anonymity");
        String wait="您已创建主题为"+theme+difficulty+"难度的"+anonymity+"训练";
        TextView waittext=findViewById(R.id.waittext);
        waittext.setText(wait);
    }
}
