package com.ssuet.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class VideoScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_screen);
        Intent intent = getIntent();
    }
}
