/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author X
 */
public class Miembro {
     private int id;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Miembro(int id,
                   String nombre,
                   String puesto,
                   boolean libre) {

        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = libre;
    }

    public void ocupar() {
        libre = false;
    }

    public void liberar() {
        libre = true;
    }

    public boolean isLibre() {
        return libre;
    }

}
