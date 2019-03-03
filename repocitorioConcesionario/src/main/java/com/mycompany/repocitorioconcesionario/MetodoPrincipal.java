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
    /**
     * 
     * @return 
     */
    public static ArrayList<Vehiculo> llenar(){
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<Vehiculo>();
        Vehiculo vehiculo1 = new Vehiculo("Mercedez","A3", 4, 45000000,3);
        listaVehiculo.add(vehiculo1);
        vehiculo1=new Vehiculo("chevrolet","4x4", 4, 20000000,3);
        listaVehiculo.add(vehiculo1);
        vehiculo1=new Personalizado("chevrolet","lx", 4, 150000000,3,"neon","jet");
        listaVehiculo.add(vehiculo1);
        vehiculo1=new Personalizado("viper","GT", 4, 150000000,3,"estrovoscopicas","xion");
        listaVehiculo.add(vehiculo1);
        vehiculo1=new MaquinariaPesada("container","Foton","GTX", 4, 150000000,3);
        listaVehiculo.add(vehiculo1);
        return listaVehiculo;
    }        
    
    /**
     * 
     */
    public void opciones(){        
        ArrayList<String> listaVehiculosComprados = new ArrayList<String>();
        ArrayList<Vehiculo> listaVehiculo = llenar();
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        while(1==1){
            if(listaVehiculo.size()<3){
                System.out.println ("Inventario bajo");
            }
            String entradaTexto= "";
            System.out.println ("\nConcesionario - Escriba '1' para la comprar un vehiculo, '2' para la venta, '3' para inventario, '4' para salir: ");
            Scanner entradaEscaner = new Scanner (System.in); 
            entradaTexto = entradaEscaner.nextLine();
            int valor = Integer.parseInt(entradaTexto);
            if (valor == 1){            
                listaVehiculosComprados=opcionComprar(listaVehiculo);
                System.out.println ("Ingrese su nombre: ");
                entradaTexto = entradaEscaner.nextLine();
                facturas.add(new Factura(1,entradaTexto,comprarVehiculo(listaVehiculosComprados,listaVehiculo)));                
                listaVehiculo=comprarVehiculo(listaVehiculosComprados,listaVehiculo);
                System.out.println ("falla");
                
            }else if(valor == 2){
                listaVehiculo.add(agregarVehiculo());
            }else if(valor==3){
                mostrarInventario(listaVehiculo);
            }else if(valor==4){
                System.exit(0);
            }else{
                System.out.println ("Opcion no válida.\n");
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
             for(int i=0; i<listaVehiculo.size();i++ ){
                Vehiculo vehiculo = listaVehiculo.get(i);
                if(vehiculo.modelo.equals(vehiculoComprado)){
                    listaVehiculo.remove(i);
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
        ArrayList<String> listaVehiculosComprados = new ArrayList<String>();
        mostrarInventario(listaVehiculo);
        String modelo= "";
        System.out.println ("Ingrese el modelo del vehiculo que desea comprar: ");
        Scanner entradaEscaner = new Scanner (System.in);
        modelo = entradaEscaner.nextLine ();
        listaVehiculosComprados.add(modelo);
        String entradaTexto= "";
        System.out.println ("Desea comprar otro vehiculo s/n: ");
        entradaTexto = entradaEscaner.nextLine ();
        while(entradaTexto.equals("s")){
            System.out.println ("Ingrese el modelo del vehiculo que desea comprar: ");
            modelo = entradaEscaner.nextLine ();
            listaVehiculosComprados.add(modelo);
            System.out.println ("Desea comprar otro vehiculo s/n: ");
            entradaTexto = entradaEscaner.nextLine ();
            listaVehiculosComprados.add(modelo);
        }
        return listaVehiculosComprados;
    }
    public static Vehiculo agregarVehiculo (){
        System.out.println ("Ingrese 'e' para vehiculo estandar");
        System.out.println ("Ingrese 'p' para vehiculo personalizado");
        System.out.println ("Ingrese 'm' para maquinaria pesada");
        System.out.println ("Ingrese 'd' para vehiculo desportivo");
        Scanner entradaEscaner = new Scanner (System.in);
        String valor = entradaEscaner.nextLine();
        if(valor.equals("e")){
            Vehiculo vehiculo=new Vehiculo("chevrolet","4x4", 4, 20000000,3);
            vehiculo.create();
            return vehiculo;
        }else{
            if(valor.equals("p")){
                Vehiculo vehiculo=new Personalizado("chevrolet","4x4", 4, 20000000,3,"neon","cohete");
                vehiculo.create();
                return vehiculo;
            }else{
                if(valor.equals("m")){
                    Vehiculo vehiculo=new MaquinariaPesada("carga","chevrolet","4x4", 4, 20000000,3);
                    vehiculo.create();
                    return vehiculo;
                }else{
                    if(valor.equals("d")){
                        Vehiculo vehiculo=new Deportivo("no","chevrolet","4x4", 4, 20000000,3);
                        vehiculo.create();
                        return vehiculo;
                    }
                }
            }
        }        
        return null;
    }
    public static void mostrarInventario(ArrayList<Vehiculo> listaVehiculo){
        for(Vehiculo vehiculo:listaVehiculo){
             vehiculo.mostrarInformacion();
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


