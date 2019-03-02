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

    
}
