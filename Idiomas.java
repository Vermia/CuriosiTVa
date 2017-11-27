package com.example.vermia.cosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Idiomas extends AppCompatActivity {
    private RadioButton boton_espanol, boton_aleman, boton_frances, boton_ingles, boton_italiano;



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

    }

    public void pulsaEspanol(View v){

    }

    public void pulsaFrances(View v) {

    }

    public void pulsaIngles(View v){

    }

    public void pulsaItaliano(View v){

    }

}

