package com.example.vermia.cosas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class Filtros extends AppCompatActivity {

    private CheckBox botonActores;
    private CheckBox botonRopa;
    private CheckBox botonLugares;
    private CheckBox botonArticulos;
    private CheckBox botonTerminos;
    private CheckBox botonPersonajes;
    private CheckBox botonMusica;
    private static boolean actores;
    private static boolean ropa;
    private static boolean lugares;
    private static boolean articulos;
    private static boolean terminos;
    private static boolean personajes;
    private static boolean musica;
    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtros);



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

                Toast.makeText(getApplicationContext(), "Ya estás en Filtros", Toast.LENGTH_SHORT).show();

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

        botonActores= (CheckBox) findViewById(R.id.BotonActores);
        botonRopa= (CheckBox) findViewById(R.id.BotonRopa);
        botonLugares= (CheckBox) findViewById(R.id.BotonLugares);
        botonArticulos= (CheckBox) findViewById(R.id.BotonArticulos);
        botonTerminos= (CheckBox) findViewById(R.id.BotonTerminos);
        botonPersonajes= (CheckBox) findViewById(R.id.BotonPersonajes);
        botonMusica = (CheckBox) findViewById(R.id.BotonMusica);

        if(actores) botonActores.setChecked(true);
        if(ropa) botonRopa.setChecked(true);
        if(lugares) botonLugares.setChecked(true);
        if(articulos) botonArticulos.setChecked(true);
        if(terminos) botonTerminos.setChecked(true);
        if(personajes) botonPersonajes.setChecked(true);
        if(musica) botonMusica.setChecked(true);

        barra.setBackgroundColor(Temas.getCol());

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

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

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

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();
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
        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

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

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();
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

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

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

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }

    public void pulsaMusica(View v){
        botonMusica= (CheckBox) findViewById(R.id.BotonMusica);
        if(botonMusica.isChecked()==false){
            botonMusica.setChecked(false);
            musica=false;
        } else {
            botonMusica.setChecked(true);
            musica=true;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }


    //TextView

    public void pulsaActores2(View v){
        botonActores= (CheckBox) findViewById(R.id.BotonActores);
        if(!botonActores.isChecked()){
            botonActores.setChecked(true);
            actores=true;
        } else {
            botonActores.setChecked(false);
            actores=false;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }

    public void pulsaRopa2(View v){
        botonRopa= (CheckBox) findViewById(R.id.BotonRopa);
        if(botonRopa.isChecked()!=false){
            botonRopa.setChecked(false);
            ropa=false;
        } else {
            botonRopa.setChecked(true);
            ropa=true;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();
    }

    public void pulsaLugares2(View v){
        botonLugares= (CheckBox) findViewById(R.id.BotonLugares);
        if(botonLugares.isChecked()!=false){
            botonLugares.setChecked(false);
            lugares=false;
        } else {
            botonLugares.setChecked(true);
            lugares=true;
        }
        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }

    public void pulsaArticulos2(View v){
        botonArticulos= (CheckBox) findViewById(R.id.BotonArticulos);
        if(botonArticulos.isChecked()!=false){
            botonArticulos.setChecked(false);
            articulos=false;
        } else {
            botonArticulos.setChecked(true);
            articulos=true;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();
    }

    public void pulsaTerminos2(View v){
        botonTerminos= (CheckBox) findViewById(R.id.BotonTerminos);
        if(botonTerminos.isChecked()!=false){
            botonTerminos.setChecked(false);
            terminos=false;
        } else {
            botonTerminos.setChecked(true);
            terminos=true;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }

    public void pulsaPersonajes2(View v){
        botonPersonajes= (CheckBox) findViewById(R.id.BotonPersonajes);
        if(botonPersonajes.isChecked()!=false){
            botonPersonajes.setChecked(false);
            personajes=false;
        } else {
            botonPersonajes.setChecked(true);
            personajes=true;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }

    public void pulsaMusica2(View v){
        botonMusica= (CheckBox) findViewById(R.id.BotonMusica);
        if(botonMusica.isChecked()!=false){
            botonMusica.setChecked(false);
            musica=false;
        } else {
            botonMusica.setChecked(true);
            musica=true;
        }

        if(!actores && !ropa && !lugares && !articulos && !terminos && !personajes && !musica) Toast.makeText(getApplicationContext(), "Marque alguna casilla para visualizar algún contenido", Toast.LENGTH_SHORT).show();

    }


    public static void setActores(boolean estado){    actores=estado;    }

    public static void setRopa(boolean estado){    ropa=estado;    }

    public static void setLugares(boolean estado){    lugares=estado;    }

    public static void setArticulos(boolean estado){    articulos=estado;    }

    public static void setTerminos(boolean estado){    terminos=estado;    }

    public static void setPersonajes(boolean estado){    personajes=estado;    }

    public static void setMusica(boolean estado){    musica=estado;    }

    public static boolean getActores(){
        return actores;
    }

    public static boolean getRopa(){
        return ropa;
    }

    public static boolean getLugares(){
        return lugares;
    }
    public static boolean getMusica(){
        return musica;
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
