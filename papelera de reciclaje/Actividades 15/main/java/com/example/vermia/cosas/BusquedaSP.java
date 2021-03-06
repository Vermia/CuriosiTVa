package com.example.vermia.cosas;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.view.View.GONE;

/**
 * Created by Carlos BSP on 09/12/2017.
 */

public class BusquedaSP extends AppCompatActivity {


    private TextView nombre, Serie1, Serie2, Serie3, Pelicula1, Pelicula2, Pelicula3, Resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.busquedasp);

        nombre = (TextView) findViewById(R.id.nombre);

        Resultados = (TextView) findViewById(R.id.Resultados);

        Serie1 = (TextView) findViewById(R.id.Serie1);
        Serie1.setVisibility(GONE);
        Serie2 = (TextView) findViewById(R.id.Serie2);
        Serie2.setVisibility(GONE);
        Serie3 = (TextView) findViewById(R.id.Serie3);
        Serie3.setVisibility(GONE);

        Pelicula1 = (TextView) findViewById(R.id.Pelicula1);
        Pelicula1.setVisibility(GONE);
        Pelicula2 = (TextView) findViewById(R.id.Pelicula2);
        Pelicula2.setVisibility(GONE);
        Pelicula3 = (TextView) findViewById(R.id.Pelicula3);
        Pelicula3.setVisibility(GONE);

        Busqueda();




    }

    private void Busqueda(){

        String busq = MainActivity.getBusq();
        int cont = 0;
        if(busq.length() > 0) {

            nombre.setText("Resultados de la búsqueda de '" + MainActivity.getBusq() + "'");

            if ("the big bang theory".contains(busq) || "THE BIG BANG THEORY".contains(busq)) {

                Serie1.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("juego de tronos".contains(busq) || "JUEGO DE TRONOS".contains(busq) || "game of thrones".contains(busq) || "GAME OF THRONES".contains(busq)) {

                Serie2.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("rick y morty".contains(busq) || "RICK Y MORTY".contains(busq) || "rick and morty".contains(busq) || "RICK AND MORTY".contains(busq)) {

                Serie3.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("transformers".contains(busq) || "TRANSFORMERS".contains(busq)) {

                Pelicula1.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("origen".contains(busq) || "ORIGEN".contains(busq) || "inception".contains(busq) || "INCEPTION".contains(busq)) {

                Pelicula2.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("paranormal activity".contains(busq) || "PARANORMAL ACTIVITY".contains(busq)) {

                Pelicula3.setVisibility(View.VISIBLE);
                cont++;

            }


            } else nombre.setText("Resultados de la búsqueda de ' '");
            Resultados.setText("Se han encontrado " + cont + " resultados");

    }
    public void abrirSerie1(View v){
        startActivity(new Intent(getApplicationContext(), TheBigBangTheory.class));
    }

}
