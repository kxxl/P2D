package com.example.android.p2d;

/**
 * Created by KcD on 15-03-2018.
 */

public class Clases {

    private String Titulo;
    private String Estilo;
    private String Horario;
    private String Lugar;
    private String Descripcion;
    private int Thumbnail;

    public Clases() {
    }

    public Clases(String titulo, String estilo, String horario, String lugar, String descripcion, int thumbnail) {
        Titulo = titulo;
        Estilo = estilo;
        Horario = horario;
        Lugar = lugar;
        Descripcion = descripcion;
        Thumbnail = thumbnail;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String estilo) {
        Estilo = estilo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

