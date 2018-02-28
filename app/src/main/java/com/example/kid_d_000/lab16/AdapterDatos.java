package com.example.kid_d_000.lab16;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kid_d_000 on 27/02/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{
    ArrayList<Contenido> listDatos;

    public AdapterDatos(ArrayList<Contenido> listDatos) {
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.genero.setText(listDatos.get(position).getGenero());
        holder.titulo.setText(listDatos.get(position).getTitulo());
        holder.imagen.setImageResource(listDatos.get(position).getImagen());
        holder.linearLayout.setBackgroundColor(listDatos.get(position).getColor());
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView genero,titulo;
        ImageView imagen;
        LinearLayout linearLayout;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            genero=itemView.findViewById(R.id.idGenero);
            titulo=itemView.findViewById(R.id.idTitulo);
            imagen=itemView.findViewById(R.id.idImagen);
            linearLayout=itemView.findViewById(R.id.card);
        }
    }
}
