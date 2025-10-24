package Exercicis;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mmo1100
 */
public class Ex2bis {
     public static void main(String[] args) {
        // declarem variables
        int num,print =2 ;
        Scanner in = new Scanner (System.in);
        //demanem el num
        System.out.print("Introduiex un numero natural : ");
        num= in.nextInt();
        for (int i = 2; i < num; i++) {
            if (i%2==0){
                System.out.println(i+"");
            } 
        }
         System.out.printf("\b\n");
}
}
