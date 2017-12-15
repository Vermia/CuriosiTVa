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
    private static int col;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);

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





        if(color.compareToIgnoreCase("Verde")==0){
            boton_verde.setChecked(true);

            //barra.setBackgroundColor(Color.parseColor("FF00FF08")); PUTOOOOOOOOOO

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            color="Verde";
        } else if(color.compareToIgnoreCase("Azul")==0){
            boton_azul.setChecked(true);

            if(boton_claro.isChecked())
                boton_claro.setChecked(false);
            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);

            col = getResources().getColor(R.color.colorPrimary);
            color="Azul";
        } else if(color.compareToIgnoreCase("Rojo")==0){
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
        } else if(color.compareToIgnoreCase("Oscuro")==0){
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
        }else if(color.compareToIgnoreCase("Claro")==0){
            boton_claro.setChecked(true);

            if(boton_oscuro.isChecked())
                boton_oscuro.setChecked(false);
            if(boton_rojo.isChecked())
                boton_rojo.setChecked(false);
            if(boton_verde.isChecked())
                boton_verde.setChecked(false);
            if(boton_azul.isChecked())
                boton_azul.setChecked(false);

            col = getResources().getColor(R.color.claro);
            color="Claro";
        }

        //setTitle("Temas");

        //if(color.compareToIgnoreCase("Verde")!=0) barra.setBackgroundColor(Color.parseColor("#000000"));
        //else barra.setBackgroundColor(Color.parseColor("#00ff00"));

        //if(boton_verde.isChecked()) {
        //col = getResources().getColor(R.color.colorPrimary);
        //}  else col = getResources().getColor(R.color.colorPrimary);

        barra.setBackgroundColor(col);

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
            col = getResources().getColor(R.color.claro);

            Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
            startActivity(BusquedaInicio);
            finish();

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

            col = getResources().getColor(R.color.oscuro);

            Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
            startActivity(BusquedaInicio);
            finish();

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
            col = getResources().getColor(R.color.rojo);

            Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
            startActivity(BusquedaInicio);
            finish();

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

            //barra.setBackgroundColor(9688);

            color="Verde";
            col = getResources().getColor(R.color.verde);

            Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
            startActivity(BusquedaInicio);
            finish();

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
            col = getResources().getColor(R.color.colorPrimary);

            Intent BusquedaInicio= new Intent(getApplicationContext(),Temas.class);
            startActivity(BusquedaInicio);
            finish();

        }

        public static void setColor(String colorpar){
            color=colorpar;
        }

        public static void setCol(int i) { col = i;}
}
