package com.example.kid_d_000.lab16;

/**
 * Created by kid_d_000 on 27/02/2018.
 */

public class Contenido {
    String genero;
    String titulo;
    int imagen;
    int color;

    public Contenido(String genero, String titulo, int imagen, int color) {
        this.genero = genero;
        this.titulo = titulo;
        this.imagen = imagen;
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public int getColor() {
        return color;
    }
}
