package com.example.suraj.netpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q2 extends AppCompatActivity {

    TextView t;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4;
    Button b1,b2,b3;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        b1=(Button)findViewById(R.id.button14);
        b2=(Button)findViewById(R.id.button15);
        b3=(Button)findViewById(R.id.button16);
        r1=(RadioButton) findViewById(R.id.radioButton7);
        r2=(RadioButton)findViewById(R.id.radioButton8);
        r3=(RadioButton)findViewById(R.id.radioButton9);
        r4=(RadioButton)findViewById(R.id.radioButton10);
        rg=(RadioGroup) findViewById(R.id.radioGroup2);
        tv=(TextView) findViewById(R.id.textView10);
        //previos button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q2.this,Q1.class);
                startActivity(i);
                finish();
            }
        });
        //submit button
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Q1.start=0;
                if(r3.isChecked())
                {
                    ++Q1.start;
                }
                else
                {
                    --Q1.start;
                }
            }
        });
        //next question button
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q2.this,Q3.class);
                startActivity(i);
                finish();
            }
        });
    }
}
