 
package com.mycompany.bank;

import java.util.Scanner;

 
public class Bank {

    public static void main(String[] args) {
        
            
        System.out.println("Bienvenidos a RED EVA");
        System.out.println("Tu cajero de confianza");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.println("1.Depositos");
        System.out.println("2.Extracciones");
        System.out.println("3.Datos de la cuenta");
        System.out.println("4.Enviar Dinero");
        System.out.println("5.salir");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("Digite la opcion correcta: ");
        
            Scanner Entrada = new Scanner(System.in); // creacion de metodo scanner
                Caja caja = new Caja(); //creacion de objeto 
            
                     int opc;
                     int deposito;
                     int extraccion;
                     opc = Entrada.nextInt();
            
            
        switch(opc){ //creacion de metodo switch 
            case 1 -> caja.depositar();
           
            
             case 2 -> caja.extraer();
             
             case 3 -> caja.datosCuenta();
                 
            default -> System.out.println("Presiono una opcion incorrecta"); //mensaje default. 
        
        
        }
        //creacion de metodo switch
                //creacion de metodo switch
                //creacion de metodo switch
                
        }
        
        
    }


