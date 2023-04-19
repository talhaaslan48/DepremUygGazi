package com.talha.depremuyggazi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer play;
    ImageButton imgbtn;
    ImageView imaj;
    VideoView videoView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.deprem;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        button = findViewById(R.id.btn_112);
        Button btn = (Button) findViewById(R.id.btn_112);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "112 Aranıyor", Toast.LENGTH_SHORT).show();
            }
        });
        imaj = findViewById(R.id.imageView3);
        ImageButton baran = (ImageButton) findViewById(R.id.imageButton);
        ImageButton dilan = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton yido = (ImageButton) findViewById(R.id.imageButton2);

        baran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Baran Aranıyor", Toast.LENGTH_SHORT).show();
            }
        });

        dilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Dilan Aranıyor", Toast.LENGTH_SHORT).show();
            }
        });

        yido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Yiğit Aranıyor", Toast.LENGTH_SHORT).show();
            }
        });
        };

    public void play(View view) {
        play=MediaPlayer.create(MainActivity.this,R.raw.song);
        play.start();
    }




}