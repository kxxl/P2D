package com.example.android.p2d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Preferencias extends AppCompatActivity {

    Toolbar toolbarPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.preferencias);

        toolbarPref= (Toolbar)findViewById (R.id.tool_barPref);


        setSupportActionBar (toolbarPref);

        //toolbarPref.setNavigationIcon (R.drawable.ic_mini);

        //No muestra el titulo en la aplicación
        getSupportActionBar ().setDisplayShowTitleEnabled (false);
    }

    //opciones del menu
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_en_preferencias, mimenu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id = opcion_menu.getItemId ();

        if(id==R.id.clases){
            ejecutar_mis_clases (null);
            this.finish ();
            return true;

        }
        if(id==R.id.explorar){
            ejecutar_explorar (null);
            this.finish ();
            return true;
        }

        if(id==R.id.perfil){
            ejecutar_perfil (null);
            this.finish ();
            return true;

        }

        if(id==R.id.informacion){
            ejecutar_info(null);
            return true;
        }


        return super.onOptionsItemSelected (opcion_menu);

    }

    //metodos que nos cambian de Activity

    public void ejecutar_info(View view){
        Intent i = new Intent (this,Informacion.class);
        startActivity (i);
    }

    public void goBackMain(View view){
        Intent i = new Intent (this,MainActivity.class);
        startActivity (i);
        this.finish ();
    }

    public void ejecutar_mis_clases(View view){

        Intent i = new Intent (this,MisClases.class);
        startActivity (i);
    }

    public void ejecutar_explorar(View view){
        Intent i = new Intent (this,Explorar.class);
        startActivity (i);
    }
    public void ejecutar_perfil(View view){
        Intent i = new Intent (this,Perfil.class);
        startActivity (i);
    }


}
