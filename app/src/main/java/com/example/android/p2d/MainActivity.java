package com.example.android.p2d;

import  android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //home principal
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        //para activar el Toolbar superior
        toolbar =(Toolbar)findViewById (R.id.tool_bar_sup);
        setSupportActionBar (toolbar);
        getSupportActionBar ().setDisplayShowTitleEnabled (false);

        //para activar el Toolbar inferior
        toolbar =(Toolbar)findViewById (R.id.tool_bar);
        setSupportActionBar (toolbar);
        //No muestra el titulo en la aplicación
        getSupportActionBar ().setDisplayShowTitleEnabled (false);


        //para el listView de la comunidad
        ListView lista = (ListView) findViewById (R.id.lstlviewComunidad);
        ArrayList<DatosItem> arraydatos = new ArrayList<DatosItem> ();
        DatosItem datos;

        //Ingreso los datos a la lista, en un futuro serán acciones de otras personas
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinan),"Curso de Bachata", "Claudio se a integrado al curso");
        arraydatos.add (datos);
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinar),"Curso de Salsa Cubana", "Lindsay a publicado un video");
        arraydatos.add (datos);
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinan),"popping al mundial", "Cambio de horario");
        arraydatos.add (datos);

        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinar),"Coreográfico Para la competencia Magia de Cuba", "3 nuevas personas se ha unido");
        arraydatos.add (datos);
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinan),"Salsa Todos los Martes", "Video publicado de la clase pasada, note lo pierdas");
        arraydatos.add (datos);

        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinar),"Salsa Todos los Martes", "Video publicado de la clase pasada, note lo pierdas");
        arraydatos.add (datos);
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinan),"AX2 coreografico Viernes", "Se suspende la clase para este viernes");
        arraydatos.add (datos);
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinar),"Rumba de Calle", "7 personas confirmadas para este Sábado ");
        arraydatos.add (datos);
        datos = new DatosItem (getResources ().getDrawable (R.drawable.bailarinar),"BreakDance PowerPeralta 18:00", "Mensaje del Profesor");
        arraydatos.add (datos);



        //creo el adapter personalizado y lo aplico
        AdapterDatos adapter = new AdapterDatos (this,arraydatos);
        lista.setAdapter (adapter);
    }



    //opciones del menu
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_en_activity, mimenu);

        return  true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id = opcion_menu.getItemId ();

        if(id==R.id.clases){
            ejecutar_mis_clases (null);
            return true;
        }
        if(id==R.id.explorar){
            ejecutar_explorar (null);
            return true;
        }
        if(id==R.id.preferencias){
            ejecutar_preferencias (null);
            return true;
        }

        if(id==R.id.perfil){
            ejecutar_perfil (null);
            return true;
        }

        if(id==R.id.informacion){
            ejecutar_info(null);
            return true;
        }



        return super.onOptionsItemSelected (opcion_menu);

    }

    //metodos que nos cambian de Activity
    public void ejecutar_mis_clases(View view){

        Intent i = new Intent (this,MisClases.class);
        startActivity (i);

    }

    public void ejecutar_explorar(View view){
             Intent i = new Intent (this,Explorar.class);
        startActivity (i);

    }

    public void ejecutar_info(View view){
        Intent i = new Intent (this,Informacion.class);
        startActivity (i);

    }

    public void ejecutar_preferencias(View view){
        Intent i = new Intent (this,Preferencias.class);
        startActivity (i);

    }
    public void goBackMain(View view){
       Toast.makeText (this,"Ya te encuentras en la Sala principal", Toast.LENGTH_SHORT).show ();

    }

    public void ejecutar_perfil(View view){
        Intent i = new Intent (this,Perfil.class);
        startActivity (i);

    }

}
