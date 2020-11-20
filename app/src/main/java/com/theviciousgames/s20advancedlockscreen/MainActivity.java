package com.theviciousgames.s20advancedlockscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import com.theviciousgames.s20advancedlockscreen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding viewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(declareObjects());
        Intent serviceIntent=new Intent(MainActivity.this,ScreenStatusService.class);
        ContextCompat.startForegroundService(MainActivity.this,serviceIntent);
    }

    protected View declareObjects()
    {
        viewBinding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=viewBinding.getRoot();
        buttonFunctions();
        return view;
    }

    protected void buttonFunctions()
    {
        viewBinding.goToWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent goToWebsiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://theviciousgames.com"));
                startActivity(goToWebsiteIntent);
            }
        });}


}