package com.example.vermia.cosas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class Filtros extends AppCompatActivity {

    private CheckBox botonActores;
    private CheckBox botonRopa;
    private CheckBox botonLugares;
    private CheckBox botonArticulos;
    private CheckBox botonTerminos;
    private CheckBox botonPersonajes;
    private static boolean actores;
    private static boolean ropa;
    private static boolean lugares;
    private static boolean articulos;
    private static boolean terminos;
    private static boolean personajes;
    private ImageButton filtros, idiomas, about, menudragon, temas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtros);


        filtros = (ImageButton) findViewById(R.id.filtros);

        temas = (ImageButton) findViewById(R.id.temas);

        temas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
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
            }
        });

        botonActores= (CheckBox) findViewById(R.id.BotonActores);
        botonRopa= (CheckBox) findViewById(R.id.BotonRopa);
        botonLugares= (CheckBox) findViewById(R.id.BotonLugares);
        botonArticulos= (CheckBox) findViewById(R.id.BotonArticulos);
        botonTerminos= (CheckBox) findViewById(R.id.BotonTerminos);
        botonPersonajes= (CheckBox) findViewById(R.id.BotonPersonajes);

        if(actores) botonActores.setChecked(true);
        if(ropa) botonRopa.setChecked(true);
        if(lugares) botonLugares.setChecked(true);
        if(articulos) botonArticulos.setChecked(true);
        if(terminos) botonTerminos.setChecked(true);
        if(personajes) botonPersonajes.setChecked(true);
    }

    public void pulsaActores(View v){
        botonActores= (CheckBox) findViewById(R.id.BotonActores);
        if(botonActores.isChecked()){
            botonActores.setChecked(true);
            actores=true;
        } else {
            botonActores.setChecked(false);
            actores=false;
        }
    }

    public void pulsaRopa(View v){
        botonRopa= (CheckBox) findViewById(R.id.BotonRopa);
        if(botonRopa.isChecked()==false){
            botonRopa.setChecked(false);
            ropa=false;
        } else {
            botonRopa.setChecked(true);
            ropa=true;
        }
    }

    public void pulsaLugares(View v){
        botonLugares= (CheckBox) findViewById(R.id.BotonLugares);
        if(botonLugares.isChecked()==false){
            botonLugares.setChecked(false);
            lugares=false;
        } else {
            botonLugares.setChecked(true);
            lugares=true;
        }
    }

    public void pulsaArticulos(View v){
        botonArticulos= (CheckBox) findViewById(R.id.BotonArticulos);
        if(botonArticulos.isChecked()==false){
            botonArticulos.setChecked(false);
            articulos=false;
        } else {
            botonArticulos.setChecked(true);
            articulos=true;
        }
    }

    public void pulsaTerminos(View v){
        botonTerminos= (CheckBox) findViewById(R.id.BotonTerminos);
        if(botonTerminos.isChecked()==false){
            botonTerminos.setChecked(false);
            terminos=false;
        } else {
            botonTerminos.setChecked(true);
           terminos=true;
        }
    }

    public void pulsaPersonajes(View v){
        botonPersonajes= (CheckBox) findViewById(R.id.BotonPersonajes);
        if(botonPersonajes.isChecked()==false){
            botonPersonajes.setChecked(false);
            personajes=false;
        } else {
            botonPersonajes.setChecked(true);
            personajes=true;
        }
    }

    public static void setActores(boolean estado){    actores=estado;    }

    public static void setRopa(boolean estado){    ropa=estado;    }

    public static void setLugares(boolean estado){    lugares=estado;    }

    public static void setArticulos(boolean estado){    articulos=estado;    }

    public static void setTerminos(boolean estado){    terminos=estado;    }

    public static void setPersonajes(boolean estado){    personajes=estado;    }

    public static boolean getActores(){
        return actores;
    }

    public static boolean getRopa(){
        return ropa;
    }

    public static boolean getLugares(){
        return lugares;
    }

    public static boolean getArticulos(){
        return articulos;
    }

    public static boolean getTerminos(){
        return terminos;
    }

    public static boolean getPersonajes(){
        return personajes;
    }
}
