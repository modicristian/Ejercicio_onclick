package com.example.itmaster.ejercicio_onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText ingreseNombre, ingreseApellido, ingreseEmail;
    private Button confirmar, reset;
    private ListenerOnClickReset listenerOnClickReset;
    private ListenerOnClickConfirmar listenerOnClickConfirmar;

    public EditText getIngreseNombre()
    {
        return ingreseNombre;
    }

    public EditText getIngreseApellido()
    {
        return ingreseApellido;
    }

    public EditText getIngreseEmail()
    {
        return ingreseEmail;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingreseNombre = findViewById(R.id.ingreseNombre);
        ingreseApellido = findViewById(R.id.ingreseApellido);
        ingreseEmail = findViewById(R.id.ingreseEmail);
        confirmar = findViewById(R.id.confirmar);
        reset = findViewById(R.id.reset);

        listenerOnClickReset = new ListenerOnClickReset(this);
        listenerOnClickConfirmar = new ListenerOnClickConfirmar(this);

        reset.setOnClickListener(listenerOnClickReset);

        confirmar.setOnClickListener(listenerOnClickConfirmar);


    }




}
