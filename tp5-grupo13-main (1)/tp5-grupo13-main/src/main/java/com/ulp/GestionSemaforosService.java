/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author X
 */
public class GestionSemaforosService {
    public void asignarOrden(
            Denuncia denuncia,
            OrdenComposicion orden){

        if(denuncia.getOrdenAsignada() != null){
            throw new OrdenYaAsignadaException(
                    "La denuncia ya tiene una orden");
        }

        denuncia.setOrdenAsignada(orden);
    }

    public int obtenerCantidadDenuncias(
            Semaforo semaforo){

        return semaforo.cantidadDenuncias();
    }
}
