package com.example.vermia.cosas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import static android.view.View.GONE;

public class TheBigBangTheory extends AppCompatActivity {


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

    public void abrirCap1x01(View v){
        startActivity(new Intent(getApplicationContext(), Video1x01.class));
    }

    public static String getbusqTBBT() {
        if(busqTBBT==null) busqTBBT = "";
        return busqTBBT;
    }
}
