package com.example.vermia.cosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Temas extends AppCompatActivity {
    private RadioButton boton_claro, boton_oscuro, boton_rojo, boton_verde, boton_azul;
    private static String color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);

        boton_claro = (RadioButton) findViewById(R.id.boton_claro);
        boton_oscuro = (RadioButton) findViewById(R.id.boton_oscuro);
        boton_rojo = (RadioButton) findViewById(R.id.boton_rojo);
        boton_verde = (RadioButton) findViewById(R.id.boton_verde);
        boton_azul = (RadioButton) findViewById(R.id.boton_azul);

        if(color.equalsIgnoreCase("Verde")){
            boton_verde.setChecked(true);

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
