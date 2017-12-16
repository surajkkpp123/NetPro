package com.example.suraj.netpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q5 extends AppCompatActivity {

    TextView t;
    RadioGroup rg;
    RadioButton r1,r2,r3,r4;
    Button b1,b2,b3;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        b1=(Button)findViewById(R.id.button23);
        b2=(Button)findViewById(R.id.button24);
        b3=(Button)findViewById(R.id.button25);
        r1=(RadioButton) findViewById(R.id.radioButton19);
        r2=(RadioButton)findViewById(R.id.radioButton20);
        r3=(RadioButton)findViewById(R.id.radioButton21);
        r4=(RadioButton)findViewById(R.id.radioButton22);
        rg=(RadioGroup) findViewById(R.id.radioGroup5);
        tv=(TextView) findViewById(R.id.textView13);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Q1.start=0;
                if(r1.isChecked())
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
                Intent i=new Intent(Q5.this,Q4.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Q5.this,Result.class);
                startActivity(i);
                finish();
            }
        });
    }
}
