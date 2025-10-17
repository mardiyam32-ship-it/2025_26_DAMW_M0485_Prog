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
public class Ex7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduiex tres valors");
        double num1= lector.nextDouble();
        double num2= lector.nextDouble();
        double num3= lector.nextDouble();
        if (num1 == num2 && num1 == num3){
            System.out.println("Els numeros son iguals ");
        } else {
            if (num1 > num2) {
                if (num1 > num3){
                    System.out.printf("Els %.2f es mes gran\n",num1);
                } else {
                    System.out.printf("El %.2f es mes gran\n",num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.printf("El %2.f es mes gran\n",num2);
                }
            }
        }
                
    }
}
