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
public class Deportivo extends Vehiculo{
    double descapotable;

    public Deportivo(double descapotable, String marca, String modelo, int llantas, int precio, int vidaUtil) {
        super(marca, modelo, llantas, precio, vidaUtil);
        this.descapotable = descapotable;
    } 
}

