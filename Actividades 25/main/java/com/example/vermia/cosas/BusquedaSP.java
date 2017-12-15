package com.example.vermia.cosas;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Carlos BSP on 09/12/2017.
 */

public class BusquedaSP extends AppCompatActivity {


    private TextView nombre, Serie1, Serie2, Serie3, Pelicula1, Pelicula2, Pelicula3, Resultados;


    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.busquedasp);

        nombre = (TextView) findViewById(R.id.nombre);

        Resultados = (TextView) findViewById(R.id.Resultados);

        Serie1 = (TextView) findViewById(R.id.Serie1);
        Serie1.setVisibility(GONE);
        Serie2 = (TextView) findViewById(R.id.Serie2);
        Serie2.setVisibility(GONE);
        Serie3 = (TextView) findViewById(R.id.Serie3);
        Serie3.setVisibility(GONE);

        Pelicula1 = (TextView) findViewById(R.id.Pelicula1);
        Pelicula1.setVisibility(GONE);
        Pelicula2 = (TextView) findViewById(R.id.Pelicula2);
        Pelicula2.setVisibility(GONE);
        Pelicula3 = (TextView) findViewById(R.id.Pelicula3);
        Pelicula3.setVisibility(GONE);

        Busqueda();




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

    private void Busqueda(){

        String busq = MainActivity.getBusq();
        int cont = 0;
        if(busq.length() > 0) {

            nombre.setText("Resultados de la búsqueda de '" + MainActivity.getBusq() + "'");

            if ("the big bang theory".contains(busq) || "THE BIG BANG THEORY".contains(busq)) {

                Serie1.setVisibility(VISIBLE);
                cont++;

            }

            if ("juego de tronos".contains(busq) || "JUEGO DE TRONOS".contains(busq) || "game of thrones".contains(busq) || "GAME OF THRONES".contains(busq)) {

                Serie2.setVisibility(VISIBLE);
                cont++;

            }

            if ("rick y morty".contains(busq) || "RICK Y MORTY".contains(busq) || "rick and morty".contains(busq) || "RICK AND MORTY".contains(busq)) {

                Serie3.setVisibility(VISIBLE);
                cont++;

            }

            if ("transformers".contains(busq) || "TRANSFORMERS".contains(busq)) {

                Pelicula1.setVisibility(VISIBLE);
                cont++;

            }

            if ("origen".contains(busq) || "ORIGEN".contains(busq) || "inception".contains(busq) || "INCEPTION".contains(busq)) {

                Pelicula2.setVisibility(VISIBLE);
                cont++;

            }

            if ("paranormal activity".contains(busq) || "PARANORMAL ACTIVITY".contains(busq)) {

                Pelicula3.setVisibility(VISIBLE);
                cont++;

            }


            } else nombre.setText("Resultados de la búsqueda de ' '");
            Resultados.setText("Se han encontrado " + cont + " resultados");

    }
    public void abrirSerie1(View v){
        startActivity(new Intent(getApplicationContext(), TheBigBangTheory.class));
    }

}
