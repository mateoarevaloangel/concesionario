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
public class Principal {
    MetodoPrincipal llenar1 = new MetodoPrincipal();

    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args){
        inicio();
        // TODO code application logic here
    }
    public static void inicio(){
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
        listaVehiculo=llenar1.llenar();
        llenar1.opciones();
    }
    
}
