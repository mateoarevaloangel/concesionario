/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repocitorioconcesionario;

/**
 *
 * @author daniel
 */
public class MaquinariaPesada extends Vehiculo{
    String carga;

    public MaquinariaPesada(String carga, String marca, String modelo, int llantas, int precio, int vidaUtil) {
        super(marca, modelo, llantas, precio, vidaUtil);
        this.carga = carga;
    }
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util"+this.vidaUtil);
        System.out.println ("carga :"+this.carga);
    }

    
}
