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
public class Personalizado extends Vehiculo{
    /**
     * Variable que determina el tipo de luces de un vehiculo personalizado
     */
    String luces;
    /**
     * Variable que determina el tipo de aleron de un vehiculo personalizado
     */
    String alerones;
    /**
     * Constructor de vehiculo personalizado
     * @param luces Recibe el tipo de luces del vehiculo
     * @param alerones Recibe el tipo de aleron del vehiculo
     * @param marca Recibe la marca del vehiculo
     * @param modelo Recibe el modelo del vehiculo
     * @param llantas Recibe el numero de lllantas
     * @param precio Recibe el precio del vehiculo
     * @param vidaUtil Recibe los años de vida util
     */
    public Personalizado(String marca, String modelo, int llantas, int precio, int vidaUtil, String luces, String alerones) {
        super(marca, modelo, llantas, precio, vidaUtil);
        this.luces=luces;
        this.alerones=alerones;
    }
    /**
     * Método para mostrar informacion del vehiculo
     */
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util :"+this.vidaUtil);
        System.out.println ("luces :"+this.luces);
        System.out.println ("alerones :"+this.alerones);
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
        System.out.println ("Ingrese tipo de luces ");
        this.luces= entradaEscaner.nextLine();
        System.out.println ("Ingrese tipo de alerones ");
        this.alerones= entradaEscaner.nextLine();
    }
}
