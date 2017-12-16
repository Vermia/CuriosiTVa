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

import java.text.Format;
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
        ImageButton botonFav3= (ImageButton) findViewById(R.id.botonFav3);
        ImageButton botonFav4= (ImageButton) findViewById(R.id.botonFav4);
        ImageButton botonFav5= (ImageButton) findViewById(R.id.botonFav5);
        ImageButton botonFav6= (ImageButton) findViewById(R.id.botonFav6);
        ImageButton botonFav7= (ImageButton) findViewById(R.id.botonFav7);
        ImageButton botonFav8= (ImageButton) findViewById(R.id.botonFav8);
        ImageButton botonFav9= (ImageButton) findViewById(R.id.botonFav9);
        ImageButton botonFav10= (ImageButton) findViewById(R.id.botonFav10);
        ImageButton botonFav11= (ImageButton) findViewById(R.id.botonFav11);

        final TextView linea1= (TextView)findViewById(R.id.linea1);
        final TextView linea2= (TextView)findViewById(R.id.linea2);
        final TextView linea3= (TextView)findViewById(R.id.linea3);
        final TextView linea4= (TextView)findViewById(R.id.linea4);
        final TextView linea5= (TextView)findViewById(R.id.linea5);
        final TextView linea6= (TextView)findViewById(R.id.linea6);
        final TextView linea7= (TextView)findViewById(R.id.linea7);
        final TextView linea8= (TextView)findViewById(R.id.linea8);
        final TextView linea9= (TextView)findViewById(R.id.linea9);
        final TextView linea10= (TextView)findViewById(R.id.linea10);
        final TextView linea11= (TextView)findViewById(R.id.linea11);


        botonPausa.setImageResource(R.mipmap.imagen_play);
        botonFav1.setImageResource(R.mipmap.fav_apagado);
        botonFav2.setImageResource(R.mipmap.fav_apagado);
        botonFav3.setImageResource(R.mipmap.fav_apagado);
        botonFav4.setImageResource(R.mipmap.fav_apagado);
        botonFav5.setImageResource(R.mipmap.fav_apagado);
        botonFav6.setImageResource(R.mipmap.fav_apagado);
        botonFav7.setImageResource(R.mipmap.fav_apagado);
        botonFav8.setImageResource(R.mipmap.fav_apagado);
        botonFav9.setImageResource(R.mipmap.fav_apagado);
        botonFav10.setImageResource(R.mipmap.fav_apagado);
        botonFav11.setImageResource(R.mipmap.fav_apagado);


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
                linea1.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info2 = (LinearLayout) findViewById(R.id.Info2);
        final Runnable runnableInfo2=new Runnable(){
            @Override
            public void run(){
                info2.setVisibility(View.VISIBLE);
                linea2.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info3 = (LinearLayout) findViewById(R.id.Info3);
        final Runnable runnableInfo3=new Runnable(){
            @Override
            public void run(){
                info3.setVisibility(View.VISIBLE);
                linea3.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info4 = (LinearLayout) findViewById(R.id.Info4);
        final Runnable runnableInfo4=new Runnable(){
            @Override
            public void run(){
                info4.setVisibility(View.VISIBLE);
                linea4.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info5 = (LinearLayout) findViewById(R.id.Info5);
        final Runnable runnableInfo5=new Runnable(){
            @Override
            public void run(){
                info5.setVisibility(View.VISIBLE);
                linea5.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info6 = (LinearLayout) findViewById(R.id.Info6);
        final Runnable runnableInfo6=new Runnable(){
            @Override
            public void run(){
                info6.setVisibility(View.VISIBLE);
                linea6.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info7 = (LinearLayout) findViewById(R.id.Info7);
        final Runnable runnableInfo7=new Runnable(){
            @Override
            public void run(){
                info7.setVisibility(View.VISIBLE);
                linea7.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info8 = (LinearLayout) findViewById(R.id.Info8);
        final Runnable runnableInfo8=new Runnable(){
            @Override
            public void run(){
                info8.setVisibility(View.VISIBLE);
                linea8.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info9= (LinearLayout) findViewById(R.id.Info9);
        final Runnable runnableInfo9=new Runnable(){
            @Override
            public void run(){
                info9.setVisibility(View.VISIBLE);
                linea9.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info10= (LinearLayout) findViewById(R.id.Info10);
        final Runnable runnableInfo10=new Runnable(){
            @Override
            public void run(){
                info10.setVisibility(View.VISIBLE);
                linea10.setVisibility(View.VISIBLE);
            }
        };

        final LinearLayout info11= (LinearLayout) findViewById(R.id.Info11);
        final Runnable runnableInfo11=new Runnable(){
            @Override
            public void run(){
                info11.setVisibility(View.VISIBLE);
                linea11.setVisibility(View.VISIBLE);
            }
        };

        final Handler h=new Handler();
        barra.setMax(60 * 3 + 30);

        final Runnable runnableTimestamp=new Runnable(){
            @Override
            public void run() {
                minutos.setText(String.format("%02d",barra.getProgress()/60));
                segundos.setText(String.format("%02d", barra.getProgress()%60));
            }
        };

        final Runnable runnableFinal=new Runnable(){
            @Override
            public void run(){
                info1.setVisibility(GONE);
                info2.setVisibility(GONE);
                info3.setVisibility(GONE);
                info4.setVisibility(GONE);
                info5.setVisibility(GONE);
                info6.setVisibility(GONE);
                info7.setVisibility(GONE);
                info8.setVisibility(GONE);
                info9.setVisibility(GONE);
                info10.setVisibility(GONE);
                info11.setVisibility(GONE);

                linea1.setVisibility(GONE);
                linea2.setVisibility(GONE);
                linea3.setVisibility(GONE);
                linea4.setVisibility(GONE);
                linea5.setVisibility(GONE);
                linea6.setVisibility(GONE);
                linea7.setVisibility(GONE);
                linea8.setVisibility(GONE);
                linea9.setVisibility(GONE);
                linea10.setVisibility(GONE);
                linea11.setVisibility(GONE);


                if(favs[1]){
                    info1.setVisibility(View.VISIBLE);
                    linea1.setVisibility(View.VISIBLE);
                }

                if(favs[2]){
                    info2.setVisibility(View.VISIBLE);
                    linea2.setVisibility(View.VISIBLE);
                }

                if(favs[3]){
                    info3.setVisibility(View.VISIBLE);
                    linea3.setVisibility(View.VISIBLE);
                }

                if(favs[4]){
                    info4.setVisibility(View.VISIBLE);
                    linea4.setVisibility(View.VISIBLE);
                }
                if(favs[5]){
                    info5.setVisibility(View.VISIBLE);
                    linea5.setVisibility(View.VISIBLE);
                }
                if(favs[6]){
                    info6.setVisibility(View.VISIBLE);
                    linea6.setVisibility(View.VISIBLE);
                }
                if(favs[7]){
                    info7.setVisibility(View.VISIBLE);
                    linea7.setVisibility(View.VISIBLE);
                }
                if(favs[8]){
                    info8.setVisibility(View.VISIBLE);
                    linea8.setVisibility(View.VISIBLE);
                }
                if(favs[9]){
                    info9.setVisibility(View.VISIBLE);
                    linea9.setVisibility(View.VISIBLE);
                }
                if(favs[10]){
                    info10.setVisibility(View.VISIBLE);
                    linea10.setVisibility(View.VISIBLE);
                }
                if(favs[11]){
                    info11.setVisibility(View.VISIBLE);
                    linea11.setVisibility(View.VISIBLE);
                }
            }
        };

        int delay = 0;
        int period = 1000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
            int contador=0;
                if (!pausa) {
                   contador=contador+1;
                    if(barra.getProgress()==1 && Filtros.getTerminos()){
                        h.post(runnableInfo1);
                    }
                    if(barra.getProgress()==5 && Filtros.getActores()){
                        h.post(runnableInfo2);
                    }

                    if(barra.getProgress()==6 && Filtros.getActores()){
                        h.post(runnableInfo3);
                    }

                    if(barra.getProgress()==24 && Filtros.getActores()){
                        h.post(runnableInfo4);
                    }

                    if(barra.getProgress()==40 && Filtros.getTerminos()){
                        h.post(runnableInfo5);
                    }

                    if(barra.getProgress()==60*1+10 && Filtros.getTerminos()){
                        h.post(runnableInfo6);
                    }

                    if(barra.getProgress()==60*1+26 && Filtros.getRopa()){
                        h.post(runnableInfo7);
                    }

                    if(barra.getProgress()==60*1+58 && Filtros.getTerminos()){
                        h.post(runnableInfo8);
                    }

                    if(barra.getProgress()==60*2+59 && Filtros.getTerminos()){
                        h.post(runnableInfo9);
                    }

                    if(barra.getProgress()==60*3+3 && Filtros.getActores()){
                        h.post(runnableInfo10);
                    }

                    if(barra.getProgress()==60*3+7 && Filtros.getMusica()){
                        h.post(runnableInfo11);
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

    public void pulsaFav3(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav3);
        if(favs[3]){
            favs[3]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[3]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav4(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav4);
        if(favs[4]){
            favs[4]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[4]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav5(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav5);
        if(favs[5]){
            favs[5]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[5]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav6(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav6);
        if(favs[6]){
            favs[6]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[6]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav7(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav7);
        if(favs[7]){
            favs[7]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[7]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav8(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav8);
        if(favs[8]){
            favs[8]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[8]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav9(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav9);
        if(favs[9]){
            favs[9]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[9]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav10(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav10);
        if(favs[10]){
            favs[10]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[10]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

    public void pulsaFav11(View v){
        ImageButton boton=(ImageButton)findViewById(R.id.botonFav11);
        if(favs[11]){
            favs[11]=false;
            boton.setImageResource(R.mipmap.fav_apagado);
        } else{
            favs[11]=true;
            boton.setImageResource(R.mipmap.fav_encendido);
        }
    }

}
