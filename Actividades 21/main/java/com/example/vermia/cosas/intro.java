package com.example.vermia.cosas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class intro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Temas.setCol(getResources().getColor(R.color.colorPrimary));

        Idiomas.setIdioma("Espanol");
        Temas.setColor("Azul");
        setContentView(R.layout.intro);

        Runnable r = new Runnable() {
            @Override
            public void run(){

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        };

        Handler h = new Handler();
        h.postDelayed(r, 1500); // <-- the "1000" is the delay time in miliseconds.


    }
}