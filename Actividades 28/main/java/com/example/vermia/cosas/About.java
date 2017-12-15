package com.example.vermia.cosas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class About extends AppCompatActivity {

    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView t2=(TextView) findViewById(R.id.text2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t1=(TextView) findViewById(R.id.intro);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3=(TextView) findViewById(R.id.textA);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4=(TextView) findViewById(R.id.textC);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5=(TextView) findViewById(R.id.textM);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6=(TextView) findViewById(R.id.textP);
        t6.setMovementMethod(LinkMovementMethod.getInstance());



        barra = (RadioGroup) findViewById(R.id.barra);

        home = (ImageButton) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(BusquedaInicio);
                finish();

            }
        });

        filtros = (ImageButton) findViewById(R.id.filtros);

        filtros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),Filtros.class);
                startActivity(BusquedaInicio);
                finish();

            }
        });

        idiomas = (ImageButton) findViewById(R.id.idiomas);

        idiomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),Idiomas.class);
                startActivity(BusquedaInicio);
                finish();

            }
        });

        about = (ImageButton) findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),About.class);
                startActivity(BusquedaInicio);
                finish();

            }
        });

        temas = (ImageButton) findViewById(R.id.temas);

        temas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
                startActivity(BusquedaInicio);
                finish();

            }
        });

        menudragon = (ImageButton) findViewById(R.id.imagindragon);

        menudragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(about.getVisibility()==GONE){
                    about.setVisibility(VISIBLE);
                }
                else{
                    about.setVisibility(GONE);
                }

                if(filtros.getVisibility()==GONE){
                    filtros.setVisibility(VISIBLE);
                }
                else{
                    filtros.setVisibility(GONE);
                }

                if(idiomas.getVisibility()==GONE){
                    idiomas.setVisibility(VISIBLE);
                }
                else{
                    idiomas.setVisibility(GONE);
                }

                if(temas.getVisibility()==GONE){
                    temas.setVisibility(VISIBLE);
                }
                else{
                    temas.setVisibility(GONE);
                }

                if(home.getVisibility()==GONE){
                    home.setVisibility(VISIBLE);
                }
                else{
                    home.setVisibility(GONE);
                }
            }
        });



        barra.setBackgroundColor(Temas.getCol());

    }
}
