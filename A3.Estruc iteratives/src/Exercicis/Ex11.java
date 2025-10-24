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
public class Ex11 {
    public static void main(String[] args) {
        // declarem variables
        Scanner scan=new Scanner (System.in);
        int A,B;
        double result=1;
        System.out.print("Introdueix A: ");
        A=scan.nextInt();
        System.out.print("Introdueix B : ");
        B=scan.nextInt();
        for (int i = 0 ; i < Math.abs(B); i++){
            result*=A;
        }
        if (B<0){
            result=1/result;
        }
        System.out.printf("%d^%d=%.4f\n",A,B,result);
    }
}
