package com.example.itmaster.ejercicio_onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity
{
    private TextView nombApe, mail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        nombApe = findViewById(R.id.nombApe);
        mail = findViewById(R.id.mail);

        Bundle b = new Bundle();
        b = getIntent().getExtras();

        String dato1 = b.getString("NOMBRE");
        String dato2 = b.getString("APELLIDO");
        String dato3 = b.getString("MAIL");

        nombApe.setText(dato1 + "" + dato2);
        mail.setText(dato3);

    }

}
