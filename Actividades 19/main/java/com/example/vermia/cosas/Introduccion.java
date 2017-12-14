package com.example.vermia.cosas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Introduccion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Idiomas.setIdioma("Espanol");

        Temas.setColor("Claro");

        Filtros.setActores(true);
        Filtros.setRopa(true);
        Filtros.setArticulos(true);
        Filtros.setTerminos(true);
        Filtros.setLugares(true);
        Filtros.setPersonajes(true);


        setContentView(R.layout.intro);

        Runnable r = new Runnable() {
            @Override
            public void run(){

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        };

        Handler h = new Handler();
        h.postDelayed(r, 650);


    }
}