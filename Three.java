package com.example.suraj.netpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.TextView;

public class Three extends AppCompatActivity {
    TextView t6;
    Button b5,b6,b7,b8,bt,bcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        bt=(Button)findViewById(R.id.button26);
        bcall=(Button)findViewById(R.id.button28);
        t6=(TextView)findViewById(R.id.textView6);
       b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Camera.class);
                startActivity(i);
                finish();
            }
        });
       bcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Call.class);
                startActivity(i);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Calculator.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Music.class);
                startActivity(i);
                finish();
            }
        });
       b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Three.this,Q1.class);
                startActivity(i);
                finish();
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:47.4925,190513"));
                Intent chooser=Intent.createChooser(i,"Lounch maps");
                startActivity(chooser);
            }
        });
    }
}
