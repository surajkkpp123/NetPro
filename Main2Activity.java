package com.example.suraj.netpro;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3;
    Button b1,b2;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        e1=(EditText)findViewById(R.id.editText4);
        e2=(EditText)findViewById(R.id.editText5);
        e3=(EditText)findViewById(R.id.editText6);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView4);
        t3=(TextView)findViewById(R.id.textView5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();
                String s3= e3.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals(""))
                {
                    Toast.makeText(Main2Activity.this, "Enter Other Entity", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("net",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists camp(name varchar,password varchar,email varchar)");
                    String s4="select * from camp where name ='"+s1+"' and password ='"+s2+"'";
                    Cursor cursor =data.rawQuery(s4,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Main2Activity.this, "User Already Exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into camp values('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Main2Activity.this, "Sign up successful", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
