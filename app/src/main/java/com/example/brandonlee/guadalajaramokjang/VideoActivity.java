package com.example.brandonlee.guadalajaramokjang;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends Activity {
    /** Called when the activity is first created. */
    Context context;
    MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //FIXME 
        mp = MediaPlayer.create(context, R.raw.test_01);
        mp.start(); // no need to call prepare(); create() does that for you

        //MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sound_file_1);
        //    mediaPlayer.start(); // no need to call prepare(); create() does that for you

        mp.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);

        //VideoView videoView = (VideoView)findViewById(R.id.VideoView);
        //MediaController mediaController = new MediaController(this);
        // mediaController.setAnchorView(videoView);
        //videoView.setMediaController(mediaController);




    }


}