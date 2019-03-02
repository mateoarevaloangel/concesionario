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
public class Vehiculo implements VehiculoInterface
{
    //protected int kilometraje;
    protected String marca;
    protected String modelo;
    protected int llantas;
    protected int precio;
    protected int vidaUtil;

    public Vehiculo(String marca, String modelo, int llantas, int precio, int vidaUtil) {
        this.marca = marca;
        this.modelo = modelo;
        this.llantas = llantas;
        this.precio = precio;
        this.vidaUtil = vidaUtil;
    }
    
    @Override
    public ArrayList<Vehiculo> comprar(ArrayList<Vehiculo> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo){             
        for(Vehiculo vehiculoComprado:listaVehiculosComprados){
            listaVehiculo.remove(vehiculoComprado);
        }
        return listaVehiculo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util"+this.vidaUtil);
    }   
}