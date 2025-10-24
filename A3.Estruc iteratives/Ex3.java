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
        // declarem variables 
        int N;
        int num=2;
        Scanner in = new Scanner (System.in);
        // demanem  el num 
        System.out.println("Introduiex un numero natural: ");
        N=in.nextInt();
        for (int i = 2; i < num; i++) {
            if (i%1==0){
                System.out.println(i+"");
            } 
        }
        System.out.printf("\b\n");
    }
   
}
     