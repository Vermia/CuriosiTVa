package com.example.vermia.cosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView t2=(TextView) findViewById(R.id.text2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t1=(TextView) findViewById(R.id.intro);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3=(TextView) findViewById(R.id.textA);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4=(TextView) findViewById(R.id.textC);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5=(TextView) findViewById(R.id.textM);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6=(TextView) findViewById(R.id.textP);
        t6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
