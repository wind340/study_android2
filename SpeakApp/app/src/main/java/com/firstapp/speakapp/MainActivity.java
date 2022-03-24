package com.firstapp.speakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    private void getVoice(){
        Intent intent = new Intent();   //f
        intent.setAction(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

    }
}