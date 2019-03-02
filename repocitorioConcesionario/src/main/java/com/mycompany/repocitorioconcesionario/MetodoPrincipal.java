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
 */
public class MetodoPrincipal {
    public static ArrayList<Vehiculo> llenar(){
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
        Vehiculo vehiculo1 = new Vehiculo("Mercedez","A3", 4, 45000000,3);
        listaVehiculo.add(vehiculo1);
        vehiculo1=new Vehiculo("chevrolet","4x4", 4, 20000000,3);
        listaVehiculo.add(vehiculo1);
        return listaVehiculo;
    }        
    //Personalizado personalizado = (Personalizado) new Vehiculo("Mercedez","A3", 4, 30000000,3);
    
    public void opciones(){
        ArrayList<String> listaVehiculosComprados = new ArrayList<String>();
        ArrayList<Vehiculo> listaVehiculo = llenar();
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        String entradaTexto= "";
        System.out.println ("Escriba una '1' para la comprar un vehiculo y '2' para la venta '3' para inventario");
        Scanner entradaEscaner = new Scanner (System.in); 
        entradaTexto = entradaEscaner.nextLine();
        int valor = Integer.parseInt(entradaTexto);
        if (valor == 1){            
            listaVehiculosComprados=opcionComprar(listaVehiculo);
            System.out.println ("ingrese su nombre");
            entradaTexto = entradaEscaner.nextLine();
            facturas.add(new Factura(1,entradaTexto,comprarVehiculo(listaVehiculosComprados,listaVehiculo)));
        }else{
            if(valor == 2){
                listaVehiculo.add(agregarVehiculo());
            }else{
                if(valor==3){
                    
                }else{
                    System.out.println ("Opcion no valida");
                    //System.out.println (entradaTexto);
                }
            }
        }
    }
    public static ArrayList<Vehiculo> comprar(ArrayList<Vehiculo> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo){             
        for(Vehiculo vehiculoComprado:listaVehiculosComprados){
            listaVehiculo.remove(vehiculoComprado);
        }
        return listaVehiculo;
    }
     public static ArrayList<Vehiculo> comprarVehiculo(ArrayList<String> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo){             
         ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();
         for(String vehiculoComprado:listaVehiculosComprados){
            //listaVehiculo.remove(vehiculoComprado);
             for(Vehiculo vehiculo:listaVehiculo){
                 if(vehiculoComprado.equals(vehiculo.modelo)){
                     listaVehiculos.add(vehiculo);
                 }
               }
             }            
        return listaVehiculo;
    }
     public static Vehiculo buscarVehiculo(String auto,ArrayList<Vehiculo> listaVehiculo){             
        for(Vehiculo vehiculo:listaVehiculo){
            if(vehiculo.modelo.equals(auto)){
                return vehiculo;
            }
        }
        return null;
    }
    public static ArrayList<String> opcionComprar(ArrayList<Vehiculo> listaVehiculo){
        //ArrayList<Vehiculo> listaVehiculosComprados = new ArrayList<Vehiculo>();
        ArrayList<String> listaVehiculosComprados = new ArrayList<String>();
        mostrarInventario(listaVehiculo);
        String modelo= "";
        System.out.println ("ingrese el modelo del vehiculo que desea comprar");
        Scanner entradaEscaner = new Scanner (System.in);
        modelo = entradaEscaner.nextLine ();
        listaVehiculosComprados.add(modelo);
        String entradaTexto= "";
        System.out.println ("desea comprar otro vehiculo s/n");
        entradaTexto = entradaEscaner.nextLine ();
        while(entradaTexto.equals("s")){
            System.out.println ("ingrese el modelo del vehiculo que desea comprar");
            modelo = entradaEscaner.nextLine ();
            listaVehiculosComprados.add(modelo);
            System.out.println ("desea comprar otro vehiculo s/n");
            entradaTexto = entradaEscaner.nextLine ();
            listaVehiculosComprados.add(modelo);
        }
        
        return listaVehiculosComprados;
    }
    public static Vehiculo agregarVehiculo (){
        String modelo= "";
        String marca= "";
        int llantas=0;
        int precio=0;
        int vidaUtil=0;
        System.out.println ("ingrese el modelo del vehiculo ");
        Scanner entradaEscaner = new Scanner (System.in);
        modelo = entradaEscaner.nextLine();
        System.out.println ("ingrese el marca del vehiculo ");
        marca = entradaEscaner.nextLine ();
        System.out.println ("ingrese el marca del vehiculo ");
        llantas = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("ingrese el marca del vehiculo ");
        precio = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println ("ingrese el marca del vehiculo ");
        vidaUtil = Integer.parseInt(entradaEscaner.nextLine());
        Vehiculo vehiculo=new Vehiculo(marca,modelo,llantas,precio,vidaUtil);
        return vehiculo;
    }
    public static void mostrarInventario(ArrayList<Vehiculo> listaVehiculo){
        for(int i =0 ;i<listaVehiculo.size();i++){
             System.out.println(listaVehiculo.get(i).modelo);
             //System.out.println (cadenaNumerica[i]);
         }       
    }
    public static void inventario(ArrayList<Factura> facturas){
        for(Factura factura:facturas){
            factura.mostrarInformacion();
        }
    }
    
    public static void venta(){
        
    }
}


