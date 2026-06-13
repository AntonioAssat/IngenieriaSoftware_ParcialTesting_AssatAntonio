/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.time.LocalDate;

/**
 *
 * @author X
 */
public class OrdenComposicion {
    private int nroOrden;
    private LocalDate fechaProgramada;
    private LocalDate fechaEfectiva;
    private String detalle;

    private Denuncia denuncia;
    private EquipoControl equipo;

    public OrdenComposicion(int nroOrden,
                            LocalDate fechaProgramada,
                            String detalle,
                            Denuncia denuncia) {

        this.nroOrden = nroOrden;
        this.fechaProgramada = fechaProgramada;
        this.detalle = detalle;
        this.denuncia = denuncia;
    }

    public void asignarEquipo(EquipoControl e){
        equipo = e;
    }

    public void registrarReparacion(LocalDate fecha){
        fechaEfectiva = fecha;
    }

    public boolean estaCompletada(){
        return fechaEfectiva != null;
    }

    public EquipoControl getEquipo(){
        return equipo;
    }
}
