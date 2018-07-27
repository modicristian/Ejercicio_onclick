package com.example.itmaster.ejercicio_onclick;

import android.content.Intent;
import android.view.View;

public class ListenerOnClickConfirmar implements View.OnClickListener {

    private MainActivity context;

    public ListenerOnClickConfirmar(MainActivity context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View view)
    {
        Intent confirmacion = new Intent(context,Confirmacion.class);
        context.startActivity(confirmacion);

    }
}
