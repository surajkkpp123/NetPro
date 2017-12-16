package com.example.suraj.netpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView t1,t2;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1=(TextView)findViewById(R.id.textView8);
        i=(ImageView)findViewById(R.id.imageView2);
        t2=(TextView)findViewById(R.id.textView14);
        String s=Integer.toString(Q1.start);
        t2.setText(s);

    }
}
