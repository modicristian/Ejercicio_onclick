package com.example.itmaster.ejercicio_onclick;

import android.app.Activity;
import android.view.View;

public class ListenerOnClickReset implements View.OnClickListener

{
    private MainActivity context;

    public ListenerOnClickReset(MainActivity context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View view)
    {
        context.getIngreseApellido().setText("");
        context.getIngreseNombre().setText("");
        context.getIngreseEmail().setText("");
    }
}
