package com.example.android.p2d;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Romeo on 15-03-2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Clases> mData;

    public RecyclerViewAdapter(Context mContext, List<Clases> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInfrater = LayoutInflater.from (mContext);
        view = mInfrater.inflate (R.layout.cardview_item_clases, parent,false);
        return new MyViewHolder (view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tv_clase_title.setText (mData.get(position).getTitulo ());
        holder.tv_clase_lugar.setText (mData.get(position).getLugar () + " - "+mData.get(position).getHorario ());
        holder.img_clase_thumbnail.setImageResource (mData.get(position).getThumbnail ());

        //set Click Listener
        holder.cardView.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (mContext, Clase_Activity.class);

                //pasar los datos a la clase activity
                intent.putExtra ("Nombre", mData.get(position).getTitulo ());
                intent.putExtra ("Estilo", mData.get(position).getEstilo ());
                intent.putExtra ("Hora", mData.get(position).getHorario ());
                intent.putExtra ("Lugar", mData.get(position).getLugar ());
                intent.putExtra ("Descripcion", mData.get(position).getDescripcion ());
                intent.putExtra ("Imagen", mData.get(position).getThumbnail ());
                //lo inicio
                mContext.startActivity (intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size ();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_clase_title;
        TextView tv_clase_lugar;
        ImageView img_clase_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super (itemView);

            tv_clase_title = (TextView)itemView.findViewById (R.id.txtTituloCasillasGridClases);
            tv_clase_lugar = (TextView)itemView.findViewById (R.id.txtLugarClase);
            img_clase_thumbnail = (ImageView)itemView.findViewById (R.id.imgCasillaGridClases);
            cardView = (CardView)itemView.findViewById (R.id.cardview_clases);
        }
    }

}
