/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcucaladora;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Calcucaladora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite un numero");
        
        int  numero1 = sc.nextInt();
        
        System.out.println("digite un numero");
        int  numero2 = sc.nextInt();
        
        
        int suma = numero1 + numero2 ;
        
        System.out.println("el total de la suma es " + suma);
        
                int resta = numero1 - numero2 ;
        
                
        System.out.println("el total de la resta es " + resta);
        
                int multiplicacion = numero1 * numero2 ;
        
        System.out.println("el total de la multiplicacion es " + multiplicacion);
                
                int divicion = numero1 / numero2 ;
        
        System.out.println("el total es de la divicion es " + divicion);
        
        
                
        
    }
        
    }

