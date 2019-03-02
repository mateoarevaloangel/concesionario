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
public class Factura {
    protected int id;
    //protected String nit;
    public String comprador;
    public int total;
    protected ArrayList<Vehiculo> venta;

    public Factura(int id, String comprador, ArrayList<Vehiculo> venta) {
        this.id = id;
        this.comprador = comprador;
        this.venta = venta;
        int contador=0;
        for(int i =0 ;i<venta.size();i++){
            contador=venta.get(i).precio+contador;
        }
        this.total=contador;
    }
    public void mostrarInformacion(){
        System.out.println ("numer de la factura: "+this.id);
        System.out.println ("precio :"+this.total);
        for(Vehiculo vehiculo:this.venta){
            for(int i =0 ;i<venta.size();i++){
                System.out.println ("Vehiculo");
                System.out.println ("modelo: "+vehiculo.modelo);
                System.out.println ("marca: "+vehiculo.marca);
                System.out.println ("precio: "+vehiculo.precio);
                
            }
        }
    }
}

