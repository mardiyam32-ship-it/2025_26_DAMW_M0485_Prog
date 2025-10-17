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
public class Ex3 {
    public static void main(String[] args) {
        //declararem variables 
        double num1,num2,suma,resta,multiplicacio,divisio;
        Scanner Scan = new Scanner (System.in); 
        //funcionament del main
        System.out.print("introduce num1: ");
        num1 = Scan.nextDouble();
        System.out.print("Introduce num2: ");
        num2 = Scan.nextDouble();
        suma= num1 + num2;
        resta= num1 - num2;
        multiplicacio= num1 * num2;
        divisio= num1 / num2;
        System.out.printf("%.2f +%.2f = %.2f\n",num1,num2,suma);
        System.out.printf("%.2f -%.2f = %.2f\n",num1,num2,resta);
        System.out.printf("%.2f *%.2f = %.2f\n",num1,num2,multiplicacio);
        System.out.printf("%.2f /%.2f = %.2f\n",num1,num2,divisio);
    }
}
