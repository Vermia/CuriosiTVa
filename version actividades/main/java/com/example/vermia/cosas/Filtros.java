package com.example.vermia.cosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtros);

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
