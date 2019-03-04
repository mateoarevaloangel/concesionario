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
public class MetodoPrincipal {
    /**
     * Método para llenar un ArrayList con los vehiculos para la venta
     * @return Devuelve la lista con vehiculos precargados
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
     * Método para mostrar en consola un menú de opciones
     */
    public void opciones(){        
        ArrayList<String> listaVehiculosComprados = new ArrayList<String>();
        ArrayList<Vehiculo> listaVehiculo = llenar();
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        int facturaN=0;
        while(1==1){            
            if(listaVehiculo.size()<3){
                System.out.println ("Inventario bajo");
            }
            String entradaTexto= "";
            System.out.println ("\nConcesionario - Escriba '1' para compra de una vehiculo, '2'para el ingreso de un vehiculo, '3' para inventario, '4' para salir, '5'ver facturas: ");
            Scanner entradaEscaner = new Scanner (System.in); 
            entradaTexto = entradaEscaner.nextLine();
            int valor = Integer.parseInt(entradaTexto);
            if (valor == 1){        
                facturaN++;
                listaVehiculosComprados=opcionComprar(listaVehiculo);
                System.out.println ("Ingrese su nombre: ");
                entradaTexto = entradaEscaner.nextLine();
                facturas.add(new Factura(facturaN,entradaTexto,facturacion(listaVehiculosComprados,listaVehiculo)));                
                listaVehiculo=comprarVehiculo(listaVehiculosComprados,listaVehiculo);                
            }else if(valor == 2){
                listaVehiculo.add(agregarVehiculo());
            }else if(valor==3){
                mostrarInventario(listaVehiculo);
            }else if(valor==4){
                System.exit(0);
            }else{if(valor==5){
                inventario(facturas);
            }else{
                System.out.println ("Opcion no válida.\n");
            }
            }
        }
    }
    /**
     * Método para la compra de vehículos, se descuenta del inventario
     * @param listaVehiculosComprados Recibe la lista de vehiculos comprados
     * @param listaVehiculo Recibe la lista de vehiculos en inventario 
     * @return Devuelve la lista de vehículos comprados
     */
    public static ArrayList<Vehiculo> comprar(ArrayList<Vehiculo> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo){             
        for(Vehiculo vehiculoComprado:listaVehiculosComprados){
            listaVehiculo.remove(vehiculoComprado);
        }
        return listaVehiculo;
    }
    /**
     * Método para la compra de vehículos, se descuenta del inventario
     * @param listaVehiculosComprados Recibe la lista de vehiculos comprados
     * @param listaVehiculo Recibe la lista de vehiculos en inventario 
     * @return Devuelve la lista de vehículos comprados
     */
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
     /**
      * retorna un arraylist con loss vehiculos comprados
      * @param listaVehiculosComprados
      * @param listaVehiculo
      * @return 
      */
     public static ArrayList<Vehiculo> facturacion(ArrayList<String> listaVehiculosComprados ,ArrayList<Vehiculo> listaVehiculo){             
         ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();         
         for(String vehiculoComprado:listaVehiculosComprados){
             for(int i=0; i<listaVehiculo.size();i++ ){
                Vehiculo vehiculo = listaVehiculo.get(i);
                if(vehiculo.modelo.equals(vehiculoComprado)){
                    listaVehiculos.add(listaVehiculo.get(i));
                }
            }             
        }                    
        return listaVehiculos;
    }
     /**
     * Método para buscar un vehículo en el inventario por el tipo de mpdelo
     * @param auto 
     * @param listaVehiculo Recibe la lista de vehiculos en inventario
     * @return Devuelve la información del vehículo, en caso de no encontrar el modelo no retorna
     */
     public static Vehiculo buscarVehiculo(String auto,ArrayList<Vehiculo> listaVehiculo){             
        for(Vehiculo vehiculo:listaVehiculo){
            if(vehiculo.modelo.equals(auto)){
                return vehiculo;
            }
        }
        return null;
    }
     /**
     * Método para la comprar más de un vehículo
     * @param listaVehiculo Recibe la lista de vehiculos en inventario
     * @return Devuelve la lista de vehículos comprados
     */
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
    /**
     * Método para agregar vehículos (estándar, personalizado, maquinaria o deportivo)
     * @return Devuelve el vehículo añadido
     */
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
    /**
     * Método para mostrar el inventario de vehículos
     * @param listaVehiculo Recibe la lista de vehiculos en inventario
     */
    public static void mostrarInventario(ArrayList<Vehiculo> listaVehiculo){
        for(Vehiculo vehiculo:listaVehiculo){
             vehiculo.mostrarInformacion();
         }       
    }
    /**
     * Método para imprimir datos de las facturas
     * @param facturas Recibe la lista de compras realizadas con su factura
     */
    public static void inventario(ArrayList<Factura> facturas){
        if(facturas.size()>0){
                for(Factura factura:facturas){
                    factura.mostrarInformacion();
                }}else{
                    System.out.println ("sin facturas");
                }
    }
}


