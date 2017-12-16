package com.example.suraj.netpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Call extends AppCompatActivity {
   Button b;
    ImageView im;
    EditText e;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        b=(Button)findViewById(R.id.button27);
        im=(ImageView)findViewById(R.id.imageView3);
        e=(EditText) findViewById(R.id.textView15);

    }
    public void b(View v)
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        s=e.getText().toString();
        if(s.trim().isEmpty()) {
            i.setData(Uri.parse("tel:7898204600"));
        }
            else
            {
                i.setData(Uri.parse("tel:"+s));
            }
            startActivity(i);
    }
}
