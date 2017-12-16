package com.example.suraj.netpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q1 extends AppCompatActivity {
    TextView t;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4;
    Button b1,b2,b3;
    TextView tv;
    static int start=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button12);
        b3=(Button)findViewById(R.id.button13);
        r1=(RadioButton) findViewById(R.id.radioButton3);
        r2=(RadioButton)findViewById(R.id.radioButton4);
        r3=(RadioButton)findViewById(R.id.radioButton5);
        r4=(RadioButton)findViewById(R.id.radioButton6);
        rg=(RadioGroup) findViewById(R.id.radioGroup);
        tv=(TextView) findViewById(R.id.textView9);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start=0;
                if(r1.isChecked())
                {
                    ++start;
                }
                else
                {
                    --start;
                }
            }
        });
       b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q1.this,Q2.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q1.this,Three.class);
                startActivity(i);
                finish();
            }
        });
    }
}
