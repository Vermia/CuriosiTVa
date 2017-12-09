package com.example.vermia.cosas;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import static android.view.View.GONE;

public class SerieEjemplo extends AppCompatActivity implements SearchView.OnQueryTextListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_ejemplo);
    }


    public void pulsaTemp1(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp1.setVisibility(View.VISIBLE);

        if(temp2.getVisibility()==View.VISIBLE)
            temp2.setVisibility(GONE);
        if(temp3.getVisibility()==View.VISIBLE)
            temp3.setVisibility(GONE);
        if(temp4.getVisibility()==View.VISIBLE)
            temp4.setVisibility(GONE);
        if(temp5.getVisibility()==View.VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp2(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp2.setVisibility(View.VISIBLE);

        if(temp1.getVisibility()==View.VISIBLE)
            temp1.setVisibility(GONE);
        if(temp3.getVisibility()==View.VISIBLE)
            temp3.setVisibility(GONE);
        if(temp4.getVisibility()==View.VISIBLE)
            temp4.setVisibility(GONE);
        if(temp5.getVisibility()==View.VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp3(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp3.setVisibility(View.VISIBLE);

        if(temp2.getVisibility()==View.VISIBLE)
            temp2.setVisibility(GONE);
        if(temp1.getVisibility()==View.VISIBLE)
            temp1.setVisibility(GONE);
        if(temp4.getVisibility()==View.VISIBLE)
            temp4.setVisibility(GONE);
        if(temp5.getVisibility()==View.VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp4(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp4.setVisibility(View.VISIBLE);

        if(temp2.getVisibility()==View.VISIBLE)
            temp2.setVisibility(GONE);
        if(temp1.getVisibility()==View.VISIBLE)
            temp1.setVisibility(GONE);
        if(temp3.getVisibility()==View.VISIBLE)
            temp3.setVisibility(GONE);
        if(temp5.getVisibility()==View.VISIBLE)
            temp5.setVisibility(GONE);

    }

    public void pulsaTemp5(View v){
        LinearLayout temp1=(LinearLayout) findViewById(R.id.temp1);
        LinearLayout temp2=(LinearLayout) findViewById(R.id.temp2);
        LinearLayout temp3=(LinearLayout) findViewById(R.id.temp3);
        LinearLayout temp4=(LinearLayout) findViewById(R.id.temp4);
        LinearLayout temp5=(LinearLayout) findViewById(R.id.temp5);

        temp5.setVisibility(View.VISIBLE);

        if(temp2.getVisibility()==View.VISIBLE)
            temp2.setVisibility(GONE);
        if(temp1.getVisibility()==View.VISIBLE)
            temp1.setVisibility(GONE);
        if(temp4.getVisibility()==View.VISIBLE)
            temp4.setVisibility(GONE);
        if(temp3.getVisibility()==View.VISIBLE)
            temp3.setVisibility(GONE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        // User pressed the search button
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // User changed the text
        return false;
    }
}

