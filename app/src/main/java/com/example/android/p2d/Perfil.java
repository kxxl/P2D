package com.example.android.p2d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Perfil extends AppCompatActivity {


    private  Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.perfil);

        //para activar el Toolbar superior
        toolbar =(Toolbar)findViewById (R.id.tool_bar_sup);
        setSupportActionBar (toolbar);
        getSupportActionBar ().setDisplayShowTitleEnabled (false);

        //para activar el Toolbar inferior
        toolbar =(Toolbar)findViewById (R.id.tool_bar);
        setSupportActionBar (toolbar);
        //No muestra el titulo en la aplicación
        getSupportActionBar ().setDisplayShowTitleEnabled (false);


    }

    //opciones del menu
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_en_perfil, mimenu);

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
        this.finish ();
    }

    public void ejecutar_explorar(View view){
        Intent i = new Intent (this,Explorar.class);
        startActivity (i);
        this.finish ();
    }

    public void ejecutar_info(View view){
        Intent i = new Intent (this,Informacion.class);
        startActivity (i);
        this.finish ();
    }

    public void ejecutar_preferencias(View view){
        Intent i = new Intent (this,Preferencias.class);
        startActivity (i);
        this.finish ();
    }

    public void ejecutar_perfil(View view){
        Intent i = new Intent (this,Perfil.class);
        startActivity (i);
        this.finish ();
    }

    public void goBackMain(View view) {
        Intent i = new Intent (this, MainActivity.class);
        startActivity (i);
        this.finish ( );
    }

}
