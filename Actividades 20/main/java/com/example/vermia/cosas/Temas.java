package com.example.vermia.cosas;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class Temas extends AppCompatActivity {
    private RadioButton boton_claro, boton_oscuro, boton_rojo, boton_verde, boton_azul;
    private static String color;
    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);

        RadioGroup barra = (RadioGroup) findViewById(R.id.barra);

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





        boton_claro = (RadioButton) findViewById(R.id.boton_claro);
        boton_oscuro = (RadioButton) findViewById(R.id.boton_oscuro);
        boton_rojo = (RadioButton) findViewById(R.id.boton_rojo);
        boton_verde = (RadioButton) findViewById(R.id.boton_verde);
        boton_azul = (RadioButton) findViewById(R.id.boton_azul);


        //setTitle("Temas");

        /*
        if(boton_verde.isChecked()) {

            //boton_verde.setChecked(true);

            barra.setBackgroundColor(Color.parseColor("FF00FF08"));

            color="Verde";

        */





        if(color.equalsIgnoreCase("Verde")){
            boton_verde.setChecked(true);

            barra.setBackgroundColor(Color.parseColor("FF00FF08"));

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            color="Verde";
        } else if(color.equalsIgnoreCase("Azul")){
            boton_azul.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);

            color="Azul";
        } else if(color.equalsIgnoreCase("Rojo")){
            boton_rojo.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            color="Rojo";
        } else if(color.equalsIgnoreCase("Oscuro")){
            boton_oscuro.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            color="Oscuro";
        }
        if(color.equalsIgnoreCase("Claro")){
            boton_claro.setChecked(true);

            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);


            color="Claro";
        }

        setTitle("Temas");
    }
        public void temaClaro(View v){
            boton_claro.setChecked(true);

            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);


            color="Claro";
        }
        public void temaOscuro(View v){
            boton_oscuro.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            color="Oscuro";
        }
        public void temaRojo(View v){
            boton_rojo.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            color="Rojo";
        }
        public void temaVerde(View v){
            boton_verde.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            //barra.setBackgroundColor(Color.parseColor("#000000"));

            //barra.setBackgroundColor(0x00000000);

            color="Verde";
        }
        public void temaAzul(View v){
            boton_azul.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);

            color="Azul";
        }

        public static void setColor(String colorpar){
            color=colorpar;
        }
}
