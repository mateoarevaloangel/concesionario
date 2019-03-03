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
public class Personalizado extends Vehiculo{
    String luces;
    String alerones;

    public Personalizado(String marca, String modelo, int llantas, int precio, int vidaUtil, String luces, String alerones) {
        super(marca, modelo, llantas, precio, vidaUtil);
        this.luces=luces;
        this.alerones=alerones;
    }
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util :"+this.vidaUtil);
        System.out.println ("luces :"+this.luces);
        System.out.println ("alerones :"+this.alerones);
    }
}
