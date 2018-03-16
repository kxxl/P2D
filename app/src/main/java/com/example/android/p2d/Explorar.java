package com.example.android.p2d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Explorar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.explorar);

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
