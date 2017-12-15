package com.example.vermia.cosas;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Carlos BSP on 09/12/2017.
 */

public class BusquedaSP extends AppCompatActivity {


    private TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.busquedasp);

        nombre = (TextView) findViewById(R.id.nombre);

        nombre.setText(MainActivity.getBusq());

    }

    private void Busqueda(){



    }


}
