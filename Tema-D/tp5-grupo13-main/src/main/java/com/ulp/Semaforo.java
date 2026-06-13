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
public class Semaforo {
    private int nro;
    private String estado;
    private String ubicacion;
    private String tipoCorriente;

    private ArrayList<Luz> luces;
    private ArrayList<Denuncia> historicoDenuncias;

    public Semaforo(int nro,
                    String estado,
                    String ubicacion,
                    String tipoCorriente) {

        this.nro = nro;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.tipoCorriente = tipoCorriente;

        luces = new ArrayList<>();
        historicoDenuncias = new ArrayList<>();

        luces.add(new Luz("L1","Philips","Led","Rojo"));
        luces.add(new Luz("L2","Philips","Led","Amarillo"));
        luces.add(new Luz("L3","Philips","Led","Verde"));
    }

    public void addDenuncia(Denuncia d){
        historicoDenuncias.add(d);
    }

    public ArrayList<Luz> getLuces(){
        return luces;
    }

    public int cantidadDenuncias(){
        return historicoDenuncias.size();
    }

    public String getEstado() {
        return estado;
    }
}
