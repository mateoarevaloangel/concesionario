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
 */
public class Deportivo extends Vehiculo{
    String descapotable;

    public Deportivo(String descapotable, String marca, String modelo, int llantas, int precio, int vidaUtil) {
        super(marca, modelo, llantas, precio, vidaUtil);
        this.descapotable = descapotable;
    }
    public void mostrarInformacion() {
        System.out.println ("numer de llantas: "+this.llantas);
        System.out.println ("modelo: "+this.modelo);
        System.out.println ("marca :"+this.marca);
        System.out.println ("precio :"+this.precio);
        System.out.println ("vida util :"+this.vidaUtil);
        System.out.println ("descapotado :"+this.descapotable);
    }
    public void Create(){
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
        System.out.println ("Ingrese 's' si es descapotable o 'n'si no lo es: ");
        this.descapotable = entradaEscaner.nextLine();
    }
}

