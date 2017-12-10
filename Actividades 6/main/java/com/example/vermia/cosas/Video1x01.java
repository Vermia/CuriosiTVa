package com.example.vermia.cosas;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.drawable.ic_media_play;

public class Video1x01 extends AppCompatActivity {

    private int progressStatus = 0;
    private boolean pausa;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1x01);

        ImageButton botonPausa= (ImageButton) findViewById(R.id.botonPausa);
        botonPausa.setImageResource(R.mipmap.imagen_play);

        pausa=true;
        play();
    }

    public void pulsaPausa(View v){
        ImageButton botonPausa= (ImageButton) findViewById(R.id.botonPausa);
        if(pausa){
            pausa=false;
            botonPausa.setImageResource(R.mipmap.imagen_pausa);
        }else{
            pausa=true;
            botonPausa.setImageResource(R.mipmap.imagen_play);
        }
    }

    public void play(){
        final SeekBar barra=(SeekBar) findViewById(R.id.seekBar);
        barra.setMax(60*22);
        int delay = 0; // delay for 0 sec.
        int period = 10;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            {
                if(!pausa){
                    barra.setProgress(barra.getProgress()+1);
                }
            }
        }, delay, period);
    }

}
