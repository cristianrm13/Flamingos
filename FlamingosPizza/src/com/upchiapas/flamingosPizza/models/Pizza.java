package com.upchiapas.flamingosPizza.models;

public class Pizza {
   public int id;
   public String especialidad;
   public float precio;

    public Pizza() {
    }

    public Pizza(int id, String especialidad, float precio) {
        this.id = id;
        this.especialidad = especialidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", especialidad='" + especialidad + '\'' +
                ", precio=" + precio +
                '}';
    }
}
