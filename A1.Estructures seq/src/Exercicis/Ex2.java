/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicis;

import java.util.Scanner;

/**
 *
 * @author mmo1100
 */
public class Ex2 {
    public static void main(String[] args) {
         //declaraem les variables
        Scanner entrada = new Scanner(System.in);
        // funcionament del main
        System.out.print("Introdueix el valor del costat del quadrat: ");
        double costat =entrada.nextDouble();
        double Area = costat*costat;
        //sortida del programa
        System.out.print("Area"+Area );  
    }
}
