
package com.mycompany.bank;

import java.util.Scanner;


public class Caja {
    
    int saldo = 20000;
    int deposito;
    int extraccion;
    int datosCuenta;
    int envioDinero;
    int salir;
    
     Scanner Entrada = new Scanner(System.in);
    
    public void depositar(){
        System.out.print("cuanto dinero desea depositar?: ");
         deposito = Entrada.nextInt();
        if (deposito <= 100){
            System.out.println("El deposito tiene que ser mayor a 100");
         }else{
        System.out.println("EL deposito que hiciste es de: "+deposito);
            System.out.println("");
            System.out.println("");
        }
        
    }

    public void extraer(){
        System.out.print("Cuanto dinero desea extraer?: ");
        extraccion = Entrada.nextInt();
        if(extraccion > saldo){
            System.out.println("No posee el monto requerido");
            }else{
            System.out.println("Usted extrajo: "+extraccion);
            System.out.println("");
            System.out.println("su saldo es: "+(saldo-extraccion));
        }
    }
    
    String nombre; // datosCuenta
    String apellido; //datoscuenta
    float dni;
    

    public int datosCuenta(){
        System.out.println("Datos de la cuenta: ");
    nombre = "Manuel";
    apellido = "Navarro";
    dni = 39374852;
    
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Dni: "+dni);
        return datosCuenta;
    }


}
       
        
        
    
    
    
    
    
   
    
    
    
    
    
    
    
    

