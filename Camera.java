package com.example.suraj.netpro;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Camera extends AppCompatActivity {
    TextView t7;
    Button b9,b10;
    ImageView img;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap b=(Bitmap)data.getExtras().get("data");
        img.setImageBitmap(b);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        t7=(TextView)findViewById(R.id.textView7);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        img=(ImageView)findViewById(R.id.imageView);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Camera.this,Three.class);
                startActivity(i);
                finish();
            }
        });

    }
}
