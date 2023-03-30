package com.example.demo;

public class Persona {

    String nombre;
    String edad;
    String localidad;

    public Persona(String nombre, String edad, String localidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Persona() {
    }
}
