package com.example.android.p2d;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {


    private ImageView iv_logo;
    private ImageView iv_letras;
    //pantalla que se inicia al comenzar la aplicación

    private static int splashInterval = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.splash_screen);

        //para crear la transicion en el logo
        iv_logo = (ImageView)findViewById (R.id.imgLogo);
        iv_letras = (ImageView)findViewById (R.id.imgLogoLetras);
        Animation anim = AnimationUtils.loadAnimation (this, R.anim.transicionscreen);
        iv_logo.startAnimation (anim);

        new Handler ().postDelayed (new Runnable ( ) {
            @Override
            public void run() {
                //TODO auto-generated method stub
                Intent i = new Intent (SplashScreen.this, MainActivity.class);
                startActivity(i);

                Toast.makeText (getApplicationContext (), "TODO LISTO!!, Que comience la fiesta!", Toast.LENGTH_LONG).show ();

                this.finish();
            }
            private void finish(){
                //TODO auto-generated method stub
            }
        }, splashInterval);
    };


}
