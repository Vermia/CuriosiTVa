package com.example.vermia.cosas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class TheBigBangTheory extends AppCompatActivity {

    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;

    private ImageButton BusquedaImgTBBT;
    private EditText BusquedaTBBT;

    private static String busqTBBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thebigbangtheory);

        BusquedaImgTBBT = (ImageButton) findViewById(R.id.BusquedaImgTBBT);

        BusquedaTBBT = (EditText) findViewById(R.id.BusquedaTBBT);

        HorizontalScrollView scrollTemporadas= (HorizontalScrollView)findViewById(R.id.horizontalScrollView);

        BusquedaImgTBBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                busqTBBT = BusquedaTBBT.getText().toString();
                Intent BusquedaTBBT= new Intent(getApplicationContext(),BusquedaTBBT.class);
                startActivity(BusquedaTBBT);

            }
        });


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


    public void pulsaTemp1(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp1.setVisibility(VISIBLE);

        if(temp2.getVisibility()== VISIBLE)
            temp2.setVisibility(GONE);
        if(temp3.getVisibility()== VISIBLE)
            temp3.setVisibility(GONE);
        if(temp4.getVisibility()== VISIBLE)
            temp4.setVisibility(GONE);
        if(temp5.getVisibility()== VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp2(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp2.setVisibility(VISIBLE);

        if(temp1.getVisibility()== VISIBLE)
            temp1.setVisibility(GONE);
        if(temp3.getVisibility()== VISIBLE)
            temp3.setVisibility(GONE);
        if(temp4.getVisibility()== VISIBLE)
            temp4.setVisibility(GONE);
        if(temp5.getVisibility()== VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp3(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp3.setVisibility(VISIBLE);

        if(temp2.getVisibility()== VISIBLE)
            temp2.setVisibility(GONE);
        if(temp1.getVisibility()== VISIBLE)
            temp1.setVisibility(GONE);
        if(temp4.getVisibility()== VISIBLE)
            temp4.setVisibility(GONE);
        if(temp5.getVisibility()== VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp4(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp4.setVisibility(VISIBLE);

        if(temp2.getVisibility()== VISIBLE)
            temp2.setVisibility(GONE);
        if(temp1.getVisibility()== VISIBLE)
            temp1.setVisibility(GONE);
        if(temp3.getVisibility()== VISIBLE)
            temp3.setVisibility(GONE);
        if(temp5.getVisibility()== VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp5(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp5.setVisibility(VISIBLE);

        if(temp2.getVisibility()== VISIBLE)
            temp2.setVisibility(GONE);
        if(temp1.getVisibility()== VISIBLE)
            temp1.setVisibility(GONE);
        if(temp4.getVisibility()== VISIBLE)
            temp4.setVisibility(GONE);
        if(temp3.getVisibility()== VISIBLE)
            temp3.setVisibility(GONE);

    }

    public void abrirCap1x01(View v){
        startActivity(new Intent(getApplicationContext(), Video1x01.class));
    }

    public static String getbusqTBBT() {
        if(busqTBBT==null) busqTBBT = "";
        return busqTBBT;
    }
}
