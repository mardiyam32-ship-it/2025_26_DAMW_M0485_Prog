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
          double num1,num2,suma,resta,mult,div;
        Scanner in = new Scanner (System.in);
        System.out.print("Introdueix num1: ");
        num1=in.nextDouble();
        System.out.println("introdueix num2 ");
        num2=in.nextDouble();
        suma = num1+num2;
        System.out.printf("%.2f+%.2f=%.2f\n",num1,num2,suma);
        resta=num1-num2;
        System.out.printf("%.2f-%.2f=%.2f\n",num1,num2,resta);
        mult=num1*num2;
        System.out.printf("%.2f*%.2f=%.2f\n",num1,num2,mult);
        if (num2==0) {
            System.out.println("La divisio per 0 no es possible!");
        } else {
            div=num1/num2;
            System.out.printf("%.2f/%.2f=%.2f\n", num1,num2,div);
        }
    }
}
