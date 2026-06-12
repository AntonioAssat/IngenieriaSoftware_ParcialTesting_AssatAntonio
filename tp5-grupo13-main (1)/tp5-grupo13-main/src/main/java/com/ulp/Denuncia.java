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
public class Denuncia {
    private int codD;
    private LocalDate fechaDenuncia;

    private String calleX;
    private String calleY;

    private String problema;
    private String prioridadReparacion;

    private Denunciante denunciante;
    private Semaforo semaforo;

    private OrdenComposicion ordenAsignada;

    public Denuncia(int codD,
                    LocalDate fechaDenuncia,
                    String calleX,
                    String calleY,
                    String problema,
                    String prioridadReparacion,
                    Denunciante denunciante,
                    Semaforo semaforo) {

        this.codD = codD;
        this.fechaDenuncia = fechaDenuncia;
        this.calleX = calleX;
        this.calleY = calleY;
        this.problema = problema;
        this.prioridadReparacion = prioridadReparacion;
        this.denunciante = denunciante;
        this.semaforo = semaforo;
    }

    public boolean esPrioridadValida() {

        return prioridadReparacion.equalsIgnoreCase("Alta")
                || prioridadReparacion.equalsIgnoreCase("Media")
                || prioridadReparacion.equalsIgnoreCase("Baja");
    }

    public OrdenComposicion getOrdenAsignada() {
        return ordenAsignada;
    }

    public void setOrdenAsignada(OrdenComposicion ordenAsignada) {
        this.ordenAsignada = ordenAsignada;
    }
}
