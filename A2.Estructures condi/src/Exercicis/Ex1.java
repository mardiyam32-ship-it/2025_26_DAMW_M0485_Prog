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
            //declarem variable
       int Edat;
       Scanner entrada = new Scanner(System.in);
       //funcionalitat del programa
       System.out.print("Introdueix l'edat: ");
        int edat = entrada.nextInt();
       if(edat>=18){
           System.out.println("Ets major d'edat!!!");
       }else{
           System.out.println("Encara ets menos d'edat!");
    }
}
    
