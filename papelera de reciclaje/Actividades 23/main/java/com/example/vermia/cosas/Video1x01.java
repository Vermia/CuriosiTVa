package com.example.vermia.cosas;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
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

    private boolean[] favs;
    private int progressStatus = 0;
    private boolean pausa;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1x01);

        ImageButton botonPausa= (ImageButton) findViewById(R.id.botonPausa);
        ImageButton botonFav1= (ImageButton) findViewById(R.id.botonFav1);
        ImageButton botonFav2= (ImageButton) findViewById(R.id.botonFav2);
        botonPausa.setImageResource(R.mipmap.imagen_play);
        botonFav1.setImageResource(R.mipmap.fav_apagado);
        botonFav2.setImageResource(R.mipmap.fav_apagado);

        favs=new boolean[30];
        for(int i=0;i<favs.length;i++)
            favs[i]=false;

        pausa=true;
        final SeekBar barra = (SeekBar) findViewById(R.id.seekBar);
        final EditText minutos = (EditText)findViewById(R.id.minutos);
        final EditText segundos = (EditText)findViewById(R.id.segundos);

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

        final Runnable runnableTimestamp=new Runnable(){
            @Override
            public void run() {
                minutos.setText(String.valueOf(barra.getProgress()/60));
                segundos.setText(String.valueOf(barra.getProgress()%60));
            }
        };

        final Runnable runnableFinal=new Runnable(){
            @Override
            public void run(){
                info1.setVisibility(GONE);
                info2.setVisibility(GONE);


                if(favs[1]){
                    info1.setVisibility(View.VISIBLE);
                }

                if(favs[2]){
                    info2.setVisibility(View.VISIBLE);
                }
            }
        };

        int delay = 0; // delay for 0 sec.
        int period = 1000;
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

                    if(barra.getProgress()== barra.getMax()){
                        h.post(runnableFinal);
                    }
                    barra.setProgress(barra.getProgress() + 1);
                    h.post(runnableTimestamp);
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

    public void pulsaFav1(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav1);
        if(favs[1]){
            favs[1]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[1]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav2(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav2);
        if(favs[2]){
            favs[2]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[2]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

}
