/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repocitorioconcesionario;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public interface VehiculoInterface {
     
    //public static final String marca="";
    //public static final String modelo="";
    //public static final int llantas=0;
    //public static final int precio=0;
    //public static final int vidaUtil=0;
    
    public ArrayList<Vehiculo> comprar(ArrayList<Vehiculo> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo);
    public void mostrarInformacion();
    
}