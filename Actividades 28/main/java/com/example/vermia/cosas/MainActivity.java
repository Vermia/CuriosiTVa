package com.example.vermia.cosas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView ss;
    private ImageButton BusquedaImgInicio, pestanas1, pestanas2;
    private EditText BusquedaInicio;

    private static String Busq;
    private static String[] Series;
    private static String[] Peliculas;

    private ImageButton filtros, idiomas, about, menudragon, temas, home;
    private RadioGroup barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        ss=(TextView) findViewById(R.id.Serie1);

        pestanas1 = (ImageButton) findViewById(R.id.pestanas1);
        pestanas2 = (ImageButton) findViewById(R.id.pestanas2);

        BusquedaImgInicio = (ImageButton) findViewById(R.id.BusquedaImgInicio);

        BusquedaInicio = (EditText) findViewById(R.id.BusquedaInicio);



        barra = (RadioGroup) findViewById(R.id.barra);

        home = (ImageButton) findViewById(R.id.home);


        filtros = (ImageButton) findViewById(R.id.filtros);

        filtros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),Filtros.class);
                startActivity(BusquedaInicio);


            }
        });

        idiomas = (ImageButton) findViewById(R.id.idiomas);

        idiomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),Idiomas.class);
                startActivity(BusquedaInicio);


            }
        });

        about = (ImageButton) findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent BusquedaInicio= new Intent(getApplicationContext(),About.class);
                startActivity(BusquedaInicio);


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

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //toolbar.setBackgroundColor(999);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        */
        //setTitle("CuriosiTV");

        BusquedaImgInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Busq = BusquedaInicio.getText().toString();
                Intent BusquedaInicio= new Intent(getApplicationContext(),BusquedaSP.class);
                startActivity(BusquedaInicio);

            }
        });

            barra.setBackgroundColor(Temas.getCol());

    }
/*
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

*/
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_filtros) {
            Intent filtros=new Intent(getApplicationContext(),Filtros.class);
            startActivity(filtros);
        } else if (id == R.id.nav_idiomas) {
            Intent idiomas= new Intent(getApplicationContext(),Idiomas.class);
            startActivity(idiomas);
        } else if (id == R.id.nav_temas) {
            Intent temas = new Intent(getApplicationContext(),Temas.class);
            startActivity(temas);
        } else if (id == R.id.nav_about) {
            Intent about= new Intent(getApplicationContext(),About.class);
            startActivity(about);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void despliegaSeries(View v){
        LinearLayout listaSeries=(LinearLayout)findViewById(R.id.listaSeries);

        if(listaSeries.getVisibility()==GONE) {
            listaSeries.setVisibility(View.VISIBLE);
            pestanas1.setVisibility(View.GONE);
            pestanas2.setVisibility(View.VISIBLE);
        }
        else {
            listaSeries.setVisibility(GONE);
            pestanas1.setVisibility(View.VISIBLE);
            pestanas2.setVisibility(View.GONE);
        }
    }

    public void despliegaPeliculas(View v){
        LinearLayout listaPeliculas=(LinearLayout)findViewById(R.id.listaPeliculas);

        if(listaPeliculas.getVisibility()==GONE)
            listaPeliculas.setVisibility(View.VISIBLE);
        else listaPeliculas.setVisibility(GONE);
    }

    public void abrirSerie1(View v){
        startActivity(new Intent(getApplicationContext(), TheBigBangTheory.class));
    }

    public static String getBusq() {
        if(Busq==null) Busq = "";
        return Busq;
    }

    public static String[] getSeries() {
        return Series;
    }
    public static String[] getPeliculas() {
        return Peliculas;
    }

}
