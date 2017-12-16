package com.example.suraj.netpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q3 extends AppCompatActivity {

    TextView t;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4;
    Button b1,b2,b3;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        b1=(Button)findViewById(R.id.button17);
        b2=(Button)findViewById(R.id.button18);
        b3=(Button)findViewById(R.id.button19);
        r1=(RadioButton) findViewById(R.id.radioButton11);
        r2=(RadioButton)findViewById(R.id.radioButton12);
        r3=(RadioButton)findViewById(R.id.radioButton13);
        r4=(RadioButton)findViewById(R.id.radioButton14);
        rg=(RadioGroup) findViewById(R.id.radioGroup);
        tv=(TextView) findViewById(R.id.textView11);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Q1.start=0;
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
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q3.this,Q2.class);
                startActivity(i);
                finish();
            }
        });
       b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q3.this,Q4.class);
                startActivity(i);
                finish();
            }
        });
    }
}
