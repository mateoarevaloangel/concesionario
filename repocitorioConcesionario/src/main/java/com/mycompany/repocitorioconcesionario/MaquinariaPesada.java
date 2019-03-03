/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repocitorioconcesionario;

import java.util.Scanner;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */
public class MaquinariaPesada extends Vehiculo{
    /**
     * Variable que guarda la capacidad de carga de un vehiculo de maquinaria
     */
    String carga;
    /**
     * Constructor de vehiculo de maquinaria
     * @param carga Recibe la capacidad de carga del vehiculo
     * @param marca Recibe la marca del vehiculo
     * @param modelo Recibe el modelo del vehiculo
     * @param llantas Recibe el numero de lllantas
     * @param precio Recibe el precio del vehiculo
     * @param vidaUtil Recibe los años de vida util
     */
    public MaquinariaPesada(String carga, String marca, String modelo, int llantas, int precio, int vidaUtil) {
        super(marca, modelo, llantas, precio, vidaUtil);
        this.carga = carga;
    }
    /**
     * Método para mostrar informacion del vehiculo
     */
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util"+this.vidaUtil);
        System.out.println ("carga :"+this.carga);
    }
    /**
     * Método para agregar un vehiculo
     */
    public void create(){
        System.out.println ("Ingrese el modelo del vehiculo: ");
        Scanner entradaEscaner = new Scanner (System.in);
        super.modelo = entradaEscaner.nextLine();
        System.out.println ("Ingrese el marca del vehiculo: ");
        super.marca = entradaEscaner.nextLine ();
        System.out.println ("Ingrese número de llantas del vehiculo: ");
        super.llantas = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("Ingrese el precio del vehiculo: ");
        super.precio = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("Ingrese años de vida útil del vehiculo: ");
        vidaUtil = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("Ingrese tipo de carga ");
        this.carga = entradaEscaner.nextLine();
    }    
}
