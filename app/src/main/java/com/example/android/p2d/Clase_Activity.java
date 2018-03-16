package com.example.android.p2d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class Clase_Activity extends AppCompatActivity {

    private TextView txtNombre, txtEstilo, txtHorario, txtDesc;
    private ImageView imgClase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_clase_);

        txtNombre = (TextView)findViewById (R.id.txtTituloClaseActivity);
        txtEstilo = (TextView)findViewById (R.id.txtEstiloClaseActivity);
        txtHorario = (TextView)findViewById (R.id.txtHorarioClaseActivity);
        txtDesc = (TextView)findViewById (R.id.txtDescClaseActivity);
        imgClase= (ImageView) findViewById (R.id.imgClaseActivity);

        //recibe los datos
        Intent intent = getIntent ();
        String Nombre =  intent.getExtras ().getString ("Nombre");
        String Estilo =  intent.getExtras ().getString ("Estilo");
        String Horario =  intent.getExtras ().getString ("Hora");
        String Lugar =  intent.getExtras ().getString ("Lugar");
        String Descripcion =  intent.getExtras ().getString ("Descripcion");
        int Imagen =  intent.getExtras ().getInt ("Imagen");

        //Asignando los valores
        txtNombre.setText (Nombre);
        txtEstilo.setText (Estilo);
        txtHorario.setText (Horario+" - "+Lugar);
        txtDesc.setText (Descripcion);
        imgClase.setImageResource (Imagen);






    }
}
