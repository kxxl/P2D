package com.example.android.p2d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MisClases extends AppCompatActivity {

    private Toolbar toolbar;

    //para generar el listado de las clases
    List<Clases> lstClases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.mis_clases);

        /* ------------- Opciones del ToolBar -------------------*/
        //activar el Toolbar superior
        toolbar =(Toolbar)findViewById (R.id.tool_bar_sup);
        setSupportActionBar (toolbar);
        getSupportActionBar ().setDisplayShowTitleEnabled (false);

        //activar el Toolbar inferior
        toolbar =(Toolbar)findViewById (R.id.tool_bar);
        setSupportActionBar (toolbar);
        //No muestra el titulo en la aplicación
        getSupportActionBar ().setDisplayShowTitleEnabled (false);

        /* ------------- Para Generar el GridView con las clases -------------------*/
        lstClases =new ArrayList<> ();
        //los siguientes datos deberan provenir de la base de datos segun las clases que tiene el usuario
        lstClases.add(new Clases ("Bachata ASYOUWISH","Clases, Bachata","Martes y Jueves 18:00","Bellavista","",R.drawable.bailarinan));
        lstClases.add(new Clases ("Salsa On2 Ax2","clases semanales, Bachata","Martes 18:00","Academia Ax2","Lo mejor del On2",R.drawable.bailarinar));
        lstClases.add(new Clases ("Coreografico Claudio","Salsa cubana, Coreografico","Lunes 18:00","Gam","solo si te la puedes",R.drawable.bailarinan));
        lstClases.add(new Clases ("Ladys Fusion Crew","Bachata","Sabados 20:00","Estacionamiento USS","afirmate que viene bueno",R.drawable.bailarinar));
        lstClases.add(new Clases ("Coreografico Competencia la Magia","Coreografico, Salsa Cubana","Miercoles 15:00","Solar","Esperamos a los mejores",R.drawable.bailarinan));
        lstClases.add(new Clases ("Zumba 18:30","Clases Normal, zumba","Domingo 9:00","Estadio MM","Ven a bajar los kilitos",R.drawable.bailarinar));
        lstClases.add(new Clases ("Camino al Mundial","Breakdance, Coregráfico","Jueves 19:30","Estadio Renca","Breakedancer aquii!",R.drawable.bailarinan));
        lstClases.add(new Clases ("Twerk - leona","Bachata","Viernes 21:00","GAM","A moverl el Buty",R.drawable.bailarinar));
        lstClases.add(new Clases ("Popping PowerPeralta","Popping, Por semana","Sabado 13:00","Academia PP","Caro pero bueno",R.drawable.bailarinan));

        RecyclerView myrv = (RecyclerView)findViewById (R.id.recicle_grid_clases);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter (this,lstClases);
        myrv.setLayoutManager (new GridLayoutManager (this,3));
        myrv.setAdapter (myAdapter);

    }

    //opciones del menu
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_en_clases, mimenu);
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
    public void goBackMain(View view){
        Intent i = new Intent (this,MainActivity.class);
        startActivity (i);
        this.finish ();
    }

}
