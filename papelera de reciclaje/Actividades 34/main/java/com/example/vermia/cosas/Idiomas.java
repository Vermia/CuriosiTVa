package com.example.vermia.cosas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class Idiomas extends AppCompatActivity {
    private RadioButton boton_espanol, boton_aleman, boton_frances, boton_ingles, boton_italiano;
    private static String idioma;

    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idiomas);

        boton_aleman= (RadioButton) findViewById(R.id.idioma_aleman_boton);
        boton_espanol= (RadioButton) findViewById(R.id.idioma_espanol_boton);
        boton_frances =(RadioButton) findViewById(R.id.idioma_frances_boton);
        boton_ingles =(RadioButton) findViewById(R.id.idioma_ingles_boton);
        boton_italiano =(RadioButton) findViewById(R.id.idioma_italiano_boton);
        if(idioma.equalsIgnoreCase("Espanol"))
            boton_espanol.setChecked(true);
        if(idioma.equalsIgnoreCase("Aleman"))
            boton_aleman.setChecked(true);
        if(idioma.equalsIgnoreCase("Ingles"))
            boton_ingles.setChecked(true);
        if(idioma.equalsIgnoreCase("Frances"))
            boton_frances.setChecked(true);
        if(idioma.equalsIgnoreCase("Italiano"))
            boton_italiano.setChecked(true);



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

                Toast.makeText(getApplicationContext(), "Ya estás en Idiomas", Toast.LENGTH_SHORT).show();

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

    public void pulsaAleman(View v) {

        boton_aleman.setChecked(false);

        Toast.makeText(getApplicationContext(), "Idioma no disponible", Toast.LENGTH_SHORT).show();
    }

    public void pulsaEspanol(View v){
        boton_espanol.setChecked(true);

        if(boton_aleman.isChecked())
            boton_aleman.setChecked(false);
        if(boton_frances.isChecked())
            boton_frances.setChecked(false);
        if(boton_ingles.isChecked())
            boton_ingles.setChecked(false);
        if(boton_italiano.isChecked())
            boton_italiano.setChecked(false);

        idioma=new String("Espanol");
    }

    public void pulsaFrances(View v) {

        boton_frances.setChecked(false);

        Toast.makeText(getApplicationContext(), "Idioma no disponible", Toast.LENGTH_SHORT).show();


        /*
        boton_frances.setChecked(true);

        if(boton_espanol.isChecked())
            boton_espanol.setChecked(false);
        if(boton_aleman.isChecked())
            boton_aleman.setChecked(false);
        if(boton_ingles.isChecked())
            boton_ingles.setChecked(false);
        if(boton_italiano.isChecked())
            boton_italiano.setChecked(false);

        idioma=new String("Frances");

        */
    }

    public void pulsaIngles(View v){

        boton_ingles.setChecked(false);

        Toast.makeText(getApplicationContext(), "Idioma no disponible", Toast.LENGTH_SHORT).show();
    }

    public void pulsaItaliano(View v){

        boton_italiano.setChecked(false);

        Toast.makeText(getApplicationContext(), "Idioma no disponible", Toast.LENGTH_SHORT).show();

    }

    public static void setIdioma(String idioma_parametro){
        idioma=idioma_parametro;
    }

    public static String getIdioma(){
        return idioma;
    }

}

