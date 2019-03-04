/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repocitorioconcesionario;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class VehiculoEstandar extends Vehiculo{
/**
     * Constructor de vehiculo
     * @param marca Recibe la marca del vehiculo
     * @param modelo Recibe el modelo del vehiculo
     * @param llantas Recibe el numero de lllantas
     * @param precio Recibe el precio del vehiculo
     * @param vidaUtil Recibe los años de vida util
     */
    public VehiculoEstandar(String marca, String modelo, int llantas, int precio, int vidaUtil) {
        super(marca, modelo, llantas, precio, vidaUtil);
    }
    
}
