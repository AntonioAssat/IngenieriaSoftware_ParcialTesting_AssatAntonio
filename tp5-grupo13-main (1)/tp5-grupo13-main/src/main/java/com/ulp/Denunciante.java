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
public class Denunciante {
    private String nombre;
    private String mail;

    private ArrayList<Denuncia> denuncias;

    public Denunciante(String nombre,
                       String mail) {

        this.nombre = nombre;
        this.mail = mail;
        denuncias = new ArrayList<>();
    }

    public void realizarDenuncia(Denuncia d){
        denuncias.add(d);
    }

    public void addDenuncia(Denuncia d){
        denuncias.add(d);
    }

    public int denunciasRealizadas(){
        return denuncias.size();
    }

    public String getMail(){
        return mail;
    }
}
