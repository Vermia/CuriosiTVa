package com.example.vermia.cosas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.view.View.GONE;

/**
 * Created by Carlos BSP on 09/12/2017.
 */

public class BusquedaTBBT extends AppCompatActivity {


    private TextView nombre, cap1x01, cap1x02, cap1x03, cap1x04, cap2x01, cap2x02, cap2x03, cap2x04, Resultados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.busquedatbbt);


        nombre = (TextView) findViewById(R.id.nombre);

        Resultados = (TextView) findViewById(R.id.Resultados);

        cap1x01 = (TextView) findViewById(R.id.cap1x01);
        cap1x01.setVisibility(GONE);
        cap1x02 = (TextView) findViewById(R.id.cap1x02);
        cap1x02.setVisibility(GONE);
        cap1x03 = (TextView) findViewById(R.id.cap1x03);
        cap1x03.setVisibility(GONE);
        cap1x04 = (TextView) findViewById(R.id.cap1x04);
        cap1x04.setVisibility(GONE);

        cap2x01 = (TextView) findViewById(R.id.cap2x01);
        cap2x01.setVisibility(GONE);
        cap2x02 = (TextView) findViewById(R.id.cap2x02);
        cap2x02.setVisibility(GONE);
        cap2x03 = (TextView) findViewById(R.id.cap2x03);
        cap2x03.setVisibility(GONE);
        cap2x04 = (TextView) findViewById(R.id.cap2x04);
        cap2x04.setVisibility(GONE);

        busqTBBTueda();

    }

    private void busqTBBTueda(){

        String busqTBBT = TheBigBangTheory.getbusqTBBT();
        int cont = 0;
        if(busqTBBT.length() > 0) {

            nombre.setText("Resultados de la búsqueda de '" + MainActivity.getBusq() + "'");

            if ("01 piloto".contains(busqTBBT) || "01 PILOTO".contains(busqTBBT) || "01 pilot".contains(busqTBBT) || "01 PILOT".contains(busqTBBT)) {

                cap1x01.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("02 la hipótesis del gran cerebro".contains(busqTBBT) || "02 LA HIPÓTESIS DEL GRAN CEREBRO".contains(busqTBBT) || "02 THE BIG BRAN HYPOTHESIS".contains(busqTBBT) || "02 the big bran hypothesis".contains(busqTBBT)) {

                cap1x02.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("03 el corolario de botas peludas".contains(busqTBBT) || "03 EL COROLARIO DE BOTAS PELUDAS".contains(busqTBBT) || "03 the fuzzy boots corollary".contains(busqTBBT) || "03 THE FUZZY BOOTS COROLLARY".contains(busqTBBT)) {

                cap1x03.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("04 el efecto del pez luminoso".contains(busqTBBT) || "04 EL EFECTO DEL PEZ LUMINOSO".contains(busqTBBT) || "04 the luminous fish effect".contains(busqTBBT) || "04 THE LUMINOUS FISH EFFECT".contains(busqTBBT)) {

                cap1x04.setVisibility(View.VISIBLE);
                cont++;

            }
            //TEMPORADA 2
            if ("01 el paradigma del pescado malo".contains(busqTBBT) || "01 EL PARADIGMA DEL PESCADO MALO".contains(busqTBBT) || "01 the bad fish paradigm".contains(busqTBBT) || "01 THE BAD FISH PARADIGM".contains(busqTBBT)) {

                cap2x01.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("02 the codpiece topology".contains(busqTBBT) || "02 THE CODPIECE TOPOLOGY".contains(busqTBBT) || "02 la topología codpiece".contains(busqTBBT) || "02 LA TOPOLOGÍA CODPIECE".contains(busqTBBT)) {

                cap2x02.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("03 the barbarian sublimation".contains(busqTBBT) || "03 THE BARBARIAN SUBLIMATION".contains(busqTBBT) || "03 la sublimación bárbara".contains(busqTBBT) || "03 LA SUBLIMACIÓN BÁRBARA".contains(busqTBBT)) {

                cap2x03.setVisibility(View.VISIBLE);
                cont++;

            }

            if ("04 la equivalencia del grifo".contains(busqTBBT) || "04 LA EQUIVALENCIA DEL GRIFO".contains(busqTBBT) || "04 the griffin equivalency".contains(busqTBBT) || "04 THE GRIFFIN EQUIVALENCY".contains(busqTBBT)) {

                cap2x04.setVisibility(View.VISIBLE);
                cont++;

            }



        } else nombre.setText("Resultados de la búsqueda de ' '");
        Resultados.setText("Se han encontrado " + cont + " resultados");

    }


}
