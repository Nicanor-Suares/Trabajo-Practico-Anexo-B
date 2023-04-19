package com.example.trabajoprcticoanexob.model;

import java.io.Serializable;

public class Actividad implements Serializable {
    private String nombre;
    private String descripcion;
    private String fecha;
    private String hora;
    private String lugar;

    public Actividad(String nombre, String descripcion, String fecha, String hora, String lugar) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

}
