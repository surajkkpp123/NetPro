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

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText3);
        t1=(TextView)findViewById(R.id.textView2);
        t2=(TextView)findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Fill Entity", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("net",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists camp(name varchar,password varchar,email varchar)");
                    String s="select * from camp where name ='"+s1+"' and password='"+s2+"'";
                    Cursor cursor=data.rawQuery(s,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(MainActivity.this, "Log In Successful", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(MainActivity.this,Three.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Log In Failed", Toast.LENGTH_SHORT).show();
                        e1.setText("");
                        e2.setText("");
                    }
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Le lo", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
