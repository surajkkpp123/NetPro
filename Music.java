package com.example.suraj.netpro;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Music extends AppCompatActivity implements SensorEventListener{

    MediaPlayer mp;
    SensorManager sm;
    Sensor s;

    @Override
    public  void onSensorChanged(SensorEvent sensorEvent){
        if(sensorEvent.values[0]>5)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        mp=MediaPlayer.create(this, R.raw.song);
        sm=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this, s, SensorManager.SENSOR_DELAY_NORMAL);

    }
}
