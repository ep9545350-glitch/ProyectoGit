/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author LAB-USR-TRUJILLO
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner ingreso= new Scanner(System.in);
        
        System.out.println("ingresa el primer numero");
        int a=ingreso.nextInt();
        System.out.println("ingresa el segundo numero");
        int b=ingreso.nextInt();
       
        System.out.println("el numero es" + a+b);
    }
}
