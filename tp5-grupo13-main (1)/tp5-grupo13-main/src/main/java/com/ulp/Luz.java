/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author X
 */
public class Luz {
    private String numeroSerie;
    private String empresaFabricadora;
    private String tipo;
    private String color;

    public Luz(String numeroSerie,
               String empresaFabricadora,
               String tipo,
               String color) {

        this.numeroSerie = numeroSerie;
        this.empresaFabricadora = empresaFabricadora;
        this.tipo = tipo;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }
}
