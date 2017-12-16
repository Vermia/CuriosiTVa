package com.example.vermia.cosas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Carlos BSP on 09/12/2017.
 */

public class BusquedaTBBT extends AppCompatActivity {


    private TextView nombre, cap1x01, cap1x02, cap1x03, cap1x04, cap2x01, cap2x02, cap2x03, cap2x04,
            cap3x01, cap3x02, cap3x03, cap4x01, cap4x02, cap4x03, cap5x01, cap5x02, cap5x03, Resultados;

    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;


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

        cap3x01 = (TextView) findViewById(R.id.cap3x01);
        cap3x01.setVisibility(GONE);
        cap3x02 = (TextView) findViewById(R.id.cap3x02);
        cap3x02.setVisibility(GONE);
        cap3x03 = (TextView) findViewById(R.id.cap3x03);
        cap3x03.setVisibility(GONE);

        cap4x01 = (TextView) findViewById(R.id.cap4x01);
        cap4x01.setVisibility(GONE);
        cap4x02 = (TextView) findViewById(R.id.cap4x02);
        cap4x02.setVisibility(GONE);
        cap4x03 = (TextView) findViewById(R.id.cap4x03);
        cap4x03.setVisibility(GONE);

        cap5x01 = (TextView) findViewById(R.id.cap5x01);
        cap5x01.setVisibility(GONE);
        cap5x02 = (TextView) findViewById(R.id.cap5x02);
        cap5x02.setVisibility(GONE);
        cap5x03 = (TextView) findViewById(R.id.cap5x03);
        cap5x03.setVisibility(GONE);



        busqTBBTueda();


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

    private void busqTBBTueda(){

        String busqTBBT = TheBigBangTheory.getbusqTBBT();
        int cont = 0;
        if(busqTBBT.length() > 0) {

            nombre.setText("Resultados de la búsqueda de '" + TheBigBangTheory.getbusqTBBT() + "'");

            if ("01 piloto".contains(busqTBBT) || "01 PILOTO".contains(busqTBBT) || "01 pilot".contains(busqTBBT) || "01 PILOT".contains(busqTBBT)) {

                cap1x01.setVisibility(VISIBLE);
                cont++;

            }

            if ("02 la hipótesis del gran cerebro".contains(busqTBBT) || "02 LA HIPÓTESIS DEL GRAN CEREBRO".contains(busqTBBT) || "02 THE BIG BRAN HYPOTHESIS".contains(busqTBBT) || "02 the big bran hypothesis".contains(busqTBBT)) {

                cap1x02.setVisibility(VISIBLE);
                cont++;

            }

            if ("03 el corolario de botas peludas".contains(busqTBBT) || "03 EL COROLARIO DE BOTAS PELUDAS".contains(busqTBBT) || "03 the fuzzy boots corollary".contains(busqTBBT) || "03 THE FUZZY BOOTS COROLLARY".contains(busqTBBT)) {

                cap1x03.setVisibility(VISIBLE);
                cont++;

            }

            if ("04 el efecto del pez luminoso".contains(busqTBBT) || "04 EL EFECTO DEL PEZ LUMINOSO".contains(busqTBBT) || "04 the luminous fish effect".contains(busqTBBT) || "04 THE LUMINOUS FISH EFFECT".contains(busqTBBT)) {

                cap1x04.setVisibility(VISIBLE);
                cont++;

            }
            //TEMPORADA 2
            if ("01 el paradigma del pescado malo".contains(busqTBBT) || "01 EL PARADIGMA DEL PESCADO MALO".contains(busqTBBT) || "01 the bad fish paradigm".contains(busqTBBT) || "01 THE BAD FISH PARADIGM".contains(busqTBBT)) {

                cap2x01.setVisibility(VISIBLE);
                cont++;

            }

            if ("02 the codpiece topology".contains(busqTBBT) || "02 THE CODPIECE TOPOLOGY".contains(busqTBBT) || "02 la topología codpiece".contains(busqTBBT) || "02 LA TOPOLOGÍA CODPIECE".contains(busqTBBT)) {

                cap2x02.setVisibility(VISIBLE);
                cont++;

            }

            if ("03 the barbarian sublimation".contains(busqTBBT) || "03 THE BARBARIAN SUBLIMATION".contains(busqTBBT) || "03 la sublimación bárbara".contains(busqTBBT) || "03 LA SUBLIMACIÓN BÁRBARA".contains(busqTBBT)) {

                cap2x03.setVisibility(VISIBLE);
                cont++;

            }

            if ("04 la equivalencia del grifo".contains(busqTBBT) || "04 LA EQUIVALENCIA DEL GRIFO".contains(busqTBBT) || "04 the griffin equivalency".contains(busqTBBT) || "04 THE GRIFFIN EQUIVALENCY".contains(busqTBBT)) {

                cap2x04.setVisibility(VISIBLE);
                cont++;

            }

            //temporada 3

            if ("01 la fluctuación del abrelatas eléctrico".contains(busqTBBT) || "01 LA FLUCTUACIÓN DEL ABRELATAS ELÉCTRICO".contains(busqTBBT) || "01 the electric can opener fluctuation".contains(busqTBBT) || "01 THE ELECTRIC CAN OPENER FLUCTUATION".contains(busqTBBT)) {

                cap3x01.setVisibility(VISIBLE);
                cont++;

            }

            if ("02 las conjeturas de jiminy".contains(busqTBBT) || "02 LAS CONJETURAS DE JIMINY".contains(busqTBBT) || "02 the jiminy conjeture".contains(busqTBBT) || "02 THE JIMINY CONJETURE".contains(busqTBBT)) {

                cap3x02.setVisibility(VISIBLE);
                cont++;

            }

            if ("03 la variante gothowitz".contains(busqTBBT) || "03 LA VARIANTE GOTHOWITZ".contains(busqTBBT) || "03 the gothowitz variation".contains(busqTBBT) || "03 THE GOTHOWITZ VARIATION".contains(busqTBBT)) {

                cap3x03.setVisibility(VISIBLE);
                cont++;

            }

            //temporada4

            if ("01 manipulación robótica".contains(busqTBBT) || "01 MANIPULACIÓN ROBÓTICA".contains(busqTBBT) || "01 the robotic manipulation".contains(busqTBBT) || "01 THE ROBOTIC MANIPULATION".contains(busqTBBT)) {

                cap4x01.setVisibility(VISIBLE);
                cont++;

            }

            if ("02 la amplificación de verduras".contains(busqTBBT) || "02 LA AMPLIFICACIÓN DE VERDURAS".contains(busqTBBT) || "02 THE CRUCIFEROUS VEGETABLE AMPLIFICATION".contains(busqTBBT) || "02 the cruciferous vegetable amplification".contains(busqTBBT)) {

                cap4x02.setVisibility(VISIBLE);
                cont++;

            }

            if ("03 una sustitucion brillante".contains(busqTBBT) || "03 UNA SUSTITUCION BRILLANTE".contains(busqTBBT) || "03 the zazzy substitution".contains(busqTBBT) || "03 THE ZAZZY SUBSTITUTION".contains(busqTBBT)) {

                cap4x03.setVisibility(VISIBLE);
                cont++;

            }

            //TEMPORADA 5


            if ("01 analisis del reflejo de golfa".contains(busqTBBT) || "01 ANALISIS DEL REFLEJO DE GOLFA".contains(busqTBBT) || "01 the skank reflex analysis".contains(busqTBBT) || "01 THE SKANS REFLEX ANALISYS".contains(busqTBBT)) {

                cap5x01.setVisibility(VISIBLE);
                cont++;

            }

            if ("02 la teoría de la plaga".contains(busqTBBT) || "02 LA TEORÍA DE LA PLAGA".contains(busqTBBT) || "02 the infestation hypothesis".contains(busqTBBT) || "02 THE INFESTATION HYPOTHESIS".contains(busqTBBT)) {

                cap5x02.setVisibility(VISIBLE);
                cont++;

            }

            if ("03 la extrapolación del tirón de ingle".contains(busqTBBT) || "03 LA EXTRAPOLACIÓN DEL TIRÓN DE INGLE".contains(busqTBBT) || "03 the pulled groin extrapolation".contains(busqTBBT) || "03 THE PULLED GROIN EXTRAPOLATION".contains(busqTBBT)) {

                cap5x03.setVisibility(VISIBLE);
                cont++;

            }

        } else nombre.setText("Resultados de la búsqueda de ' '");
        Resultados.setText("Se han encontrado " + cont + " resultados");

    }

    public void abrirCap1x01(View v){

        startActivity(new Intent(getApplicationContext(), Video1x01.class));
        TheBigBangTheory.setPiloto(true);
    }


}
