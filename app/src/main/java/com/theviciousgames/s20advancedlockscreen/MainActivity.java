package com.theviciousgames.s20advancedlockscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton lowRefreshRateToggleButton;
    private Boolean lowRefreshRateLockscreenStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        declareObjects();
        getData();
        initializeToggles();
        buttonFunctions();
    }

    protected void declareObjects()
    {
        lowRefreshRateToggleButton=findViewById(R.id.lowRefreshRateToggleButton);

    }
    protected void getData()
    {
        askForRootPermission();
        lowRefreshRateLockscreenStatus=getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE).getBoolean("lowRefreshRateLockScreen",false);
        System.out.println(lowRefreshRateLockscreenStatus);
    }
    protected void initializeToggles()
    {
        if(lowRefreshRateLockscreenStatus)
        {
            lowRefreshRateToggleButton.setChecked(false);
            Intent serviceIntent=new Intent(MainActivity.this,ScreenStatusService.class);
            startForegroundService(serviceIntent);
        }
        else
        {
            lowRefreshRateToggleButton.setChecked(true);
            Intent serviceIntent=new Intent(MainActivity.this,ScreenStatusService.class);
            stopService(serviceIntent);
        }
    }
    protected void buttonFunctions()
    {
        lowRefreshRateToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(lowRefreshRateToggleButton.isChecked())
                {
                    getApplicationContext().getSharedPreferences("Settings", android.content.Context.MODE_PRIVATE).edit().putBoolean("lowRefreshRateLockScreen",false).apply();
                    lowRefreshRateLockscreenStatus=getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE).getBoolean("lowRefreshRateLockScreen",false);
                    System.out.println(lowRefreshRateLockscreenStatus);
                }
                else
                {
                    getApplicationContext().getSharedPreferences("Settings", android.content.Context.MODE_PRIVATE).edit().putBoolean("lowRefreshRateLockScreen",true).apply();
                    lowRefreshRateLockscreenStatus=getApplicationContext().getSharedPreferences("Settings", Context.MODE_PRIVATE).getBoolean("lowRefreshRateLockScreen",false);
                    System.out.println(lowRefreshRateLockscreenStatus);
                }
            }
        });}

    protected void askForRootPermission()
    {
        Tools.askForRootPermission();
    }
}