package com.DispositivosUNPA.Parcial.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dispositivos")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String Descripcion;
    private boolean Estado;

    public Persona(int id, String nombre, String descripcion, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        Descripcion = descripcion;
        Estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

}
