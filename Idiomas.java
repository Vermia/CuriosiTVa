package com.example.vermia.cosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Idiomas extends AppCompatActivity {
    private RadioButton boton_espanol, boton_aleman, boton_frances, boton_ingles, boton_italiano;
    private static String idioma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idiomas);

        boton_aleman= (RadioButton) findViewById(R.id.idioma_aleman_boton);
        boton_espanol= (RadioButton) findViewById(R.id.idioma_espanol_boton);
        boton_frances =(RadioButton) findViewById(R.id.idioma_frances_boton);
        boton_ingles =(RadioButton) findViewById(R.id.idioma_ingles_boton);
        boton_italiano =(RadioButton) findViewById(R.id.idioma_italiano_boton);




    }

    public void pulsaAleman(View v) {
        boton_aleman.setChecked(true);

        if(boton_espanol.isChecked())
            boton_espanol.setChecked(false);
        if(boton_frances.isChecked())
            boton_frances.setChecked(false);
        if(boton_ingles.isChecked())
            boton_ingles.setChecked(false);
        if(boton_italiano.isChecked())
            boton_italiano.setChecked(false);

        idioma=new String("Aleman");
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
    }

    public void pulsaIngles(View v){
        boton_ingles.setChecked(true);

        if(boton_espanol.isChecked())
            boton_espanol.setChecked(false);
        if(boton_frances.isChecked())
            boton_frances.setChecked(false);
        if(boton_aleman.isChecked())
            boton_aleman.setChecked(false);
        if(boton_italiano.isChecked())
            boton_italiano.setChecked(false);

        idioma=new String("Ingles");
    }

    public void pulsaItaliano(View v){
        boton_italiano.setChecked(true);

        if(boton_espanol.isChecked())
            boton_espanol.setChecked(false);
        if(boton_frances.isChecked())
            boton_frances.setChecked(false);
        if(boton_aleman.isChecked())
            boton_aleman.setChecked(false);
        if(boton_ingles.isChecked())
            boton_ingles.setChecked(false);

        idioma=new String("Italiano");
    }

}

