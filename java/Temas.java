package com.example.pacop.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Temas extends AppCompatActivity {
    private RadioButton boton_claro, boton_oscuro, boton_rojo, boton_verde, boton_azul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);

        boton_claro = (RadioButton) findViewById(R.id.boton_claro);
        boton_oscuro = (RadioButton) findViewById(R.id.boton_oscuro);
        boton_rojo = (RadioButton) findViewById(R.id.boton_rojo);
        boton_verde = (RadioButton) findViewById(R.id.boton_verde);
        boton_azul = (RadioButton) findViewById(R.id.boton_azul);

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
        }
}
