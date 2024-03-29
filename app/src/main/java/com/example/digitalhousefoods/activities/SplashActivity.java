package com.example.digitalhousefoods.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalhousefoods.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                irParaLogin();
            }
        }, 3000);



    }

    private void irParaLogin() {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
