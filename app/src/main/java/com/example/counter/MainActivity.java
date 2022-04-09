package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView cnttext;
    private Button BTincrease;
    private Button BTdecrease;
    private Button BTreset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        BTincrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newcnt=Integer.toString(Integer.parseInt(cnttext.getText().toString())+1);
                cnttext.setText(newcnt);
            }
        });
        BTdecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newcnt=Integer.toString(Integer.parseInt(cnttext.getText().toString())-1);
                cnttext.setText(newcnt);
            }
        });
        BTreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnttext.setText("0");
            }
        });
    }

    private void setUI(){
        cnttext=findViewById(R.id.cnt);
        BTincrease=findViewById(R.id.btincrease);
        BTdecrease=findViewById(R.id.btdecrease);
        BTreset=findViewById(R.id.btreset);


    }
}