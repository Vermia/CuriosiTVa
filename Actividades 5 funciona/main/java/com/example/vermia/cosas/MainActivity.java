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
import android.widget.TextView;

import static android.view.View.GONE;




public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView ss;
    private ImageButton BusquedaImgInicio;
    private EditText BusquedaInicio;

    private static String Busq;
    private static String[] Series;
    private static String[] Peliculas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(999);


        ss=(TextView) findViewById(R.id.Serie1);

        BusquedaImgInicio = (ImageButton) findViewById(R.id.BusquedaImgInicio);

        BusquedaInicio = (EditText) findViewById(R.id.BusquedaInicio);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setTitle("CuriosiTV");

        BusquedaImgInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Busq = BusquedaInicio.getText().toString();
                Intent BusquedaInicio= new Intent(getApplicationContext(),BusquedaSP.class);
                startActivity(BusquedaInicio);

            }
        });



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


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

        if(listaSeries.getVisibility()==GONE)
            listaSeries.setVisibility(View.VISIBLE);
        else listaSeries.setVisibility(GONE);
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
