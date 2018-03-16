package com.example.android.p2d;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Romeo on 14-03-2018.
 */

public class AdapterDatos extends BaseAdapter {

    //se declaran
    protected Activity activity;
    //coloco dentro del arraylist la clase DatosItem
    protected ArrayList<DatosItem> items;

    public AdapterDatos(Activity activity, ArrayList<DatosItem> items){
        this.activity = activity;
        this.items = items;
    }

    //se importan de BaseAdapter
    @Override
    public int getCount() {
        //obtenemos el tamaño del items
        return items.size ();
    }

    @Override
    public Object getItem(int position) {
        //otebenemos lo que esta almacenado en la posicion requerida
        return items.get (position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId ();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        //asociamos el laouyut de la lista a esta pestaña
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate (R.layout.itemlista, null);
        }
        //objeto de la clase DatosItem
        DatosItem datos = items.get(position);
        DatosItem dir = items.get(position);

        //rellenamos la fotografia
        ImageView foto = (ImageView) v.findViewById (R.id.img_foto);
        foto.setImageDrawable (datos.getFoto ());

        //rellenamos el nombre
        TextView nombre = (TextView)v.findViewById (R.id.txtNombre);
        nombre.setText (datos.getNombre ());

        //rellenamos la información
        TextView info = (TextView)v.findViewById (R.id.txtInfo);
        info.setText (datos.getInfo ());

        //retornamos la vista
        return v;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
