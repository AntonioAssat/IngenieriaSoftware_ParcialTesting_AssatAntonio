/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class EquipoControl {
    private int codigo;
    private String especialidad;
    private String estado;

    private ArrayList<Miembro> miembros;

    public EquipoControl(int codigo,
                         String especialidad,
                         String estado) {

        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
        miembros = new ArrayList<>();
    }

    public void addMiembro(Miembro m){
        miembros.add(m);
    }

    public ArrayList<Miembro> getMiembros(){
        return miembros;
    }

    public void liberarEquipo(){

        estado = "Libre";

        for(Miembro m : miembros){
            m.liberar();
        }
    }

    public String getEstado() {
        return estado;
    }
}
