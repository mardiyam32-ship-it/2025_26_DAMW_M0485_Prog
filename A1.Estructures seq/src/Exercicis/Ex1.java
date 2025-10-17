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
public class Ex1 {
    public static void main(String[] args) {
        //declararem les variables
        String nom = new String ();
        Scanner entrada = new Scanner (System.in);
        // funcionament del main
        System.out.println("introdueix el teu nom");
        nom = entrada.nextLine();
        // sortida del programa
        System.out.println("Hola"+ nom);
        
        
    }
}
