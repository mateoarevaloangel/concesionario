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
 * @author MateoG
 * @version 1.0
 */
public interface VehiculoInterface {
     
    //public static final String marca="";
    //public static final String modelo="";
    //public static final int llantas=0;
    //public static final int precio=0;
    //public static final int vidaUtil=0;
    /**
     * Método abstracto para comprar un vehículo
     * @param listaVehiculosComprados Recibe los vehiculos comprados
     * @param listaVehiculo Recibe el listado en inventario
     */
    public ArrayList<Vehiculo> comprar(ArrayList<Vehiculo> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo);
    /**
     * Método abstracto para mostrar la informacion de un vehiculo
     */
    public void mostrarInformacion();
    
}