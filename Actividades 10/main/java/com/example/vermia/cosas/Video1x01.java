package com.example.vermia.cosas;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.drawable.ic_media_play;
import static android.view.View.GONE;
import static android.view.View.INVISIBLE;

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
        final SeekBar barra = (SeekBar) findViewById(R.id.seekBar);

        final LinearLayout infon = (LinearLayout) findViewById(R.id.InfoNull);
        final Runnable r=new Runnable(){
            @Override
            public void run(){
                infon.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info1 = (LinearLayout) findViewById(R.id.Info1);
        final Runnable runnableInfo1=new Runnable(){
            @Override
            public void run(){
                info1.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info2 = (LinearLayout) findViewById(R.id.Info2);
        final Runnable runnableInfo2=new Runnable(){
            @Override
            public void run(){
                info2.setVisibility(View.VISIBLE);
            }
        };

        final Handler h=new Handler();



        barra.setMax(60 * 22);
        int delay = 0; // delay for 0 sec.
        int period = 10;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
            int contador=0;
                if (!pausa) {
                   contador=contador+1;
                    if(barra.getProgress()==60 && Filtros.getActores()){
                        h.post(runnableInfo1);
                    }
                    if(barra.getProgress()==280 && Filtros.getArticulos()){
                        h.post(runnableInfo2);
                    }
                    barra.setProgress(barra.getProgress() + 1);

                }
            }


        }, delay, period);

        /*Runnable r=new Runnable(){
            @Override
            public void run() {
                if(!pausa){
                    if(barra.getProgress()==50){
                        infon.setVisibility(View.GONE);
                    }
                    barra.setProgress(barra.getProgress()+1);

                }
            }
        };
        Handler h=new Handler();
        for(int i=0;i<30;i++){
            h.postDelayed(r,10);
        }
    }*/
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


}
