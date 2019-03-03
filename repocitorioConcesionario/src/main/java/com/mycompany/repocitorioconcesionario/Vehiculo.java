/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repocitorioconcesionario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class Vehiculo implements VehiculoInterface
{
    //protected int kilometraje;
    /**
     * Variable que guarda la marca del vehiculo
     */
    protected String marca;
    /**
     * Variable que guarda el modelo del vehiculo
     */
    protected String modelo;
    /**
     * Variable que guarda el numéro de llantas del vehiculo
     */
    protected int llantas;
    /**
     * Variable que guarda el precio del vehiculo
     */
    protected int precio;
    /**
     * Variable que guarda los años de vida util
     */
    protected int vidaUtil;
    /**
     * Constructor de vehiculo
     * @param marca Recibe la marca del vehiculo
     * @param modelo Recibe el modelo del vehiculo
     * @param llantas Recibe el numero de lllantas
     * @param precio Recibe el precio del vehiculo
     * @param vidaUtil Recibe los años de vida util
     */
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
    /**
     * Método para mostrar informacion del vehiculo
     */
    @Override
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util"+this.vidaUtil);
    }   
    /**
     * Método para agregar un vehiculo
     */
    public void create(){
        System.out.println ("Ingrese el modelo del vehiculo: ");
        Scanner entradaEscaner = new Scanner (System.in);
        this.modelo = entradaEscaner.nextLine();
        System.out.println ("Ingrese el marca del vehiculo: ");
        this.marca = entradaEscaner.nextLine ();
        System.out.println ("Ingrese número de llantas del vehiculo: ");
        this.llantas = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("Ingrese el precio del vehiculo: ");
        this.precio = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("Ingrese años de vida útil del vehiculo: ");
        vidaUtil = Integer.parseInt(entradaEscaner.nextLine());
    }
}