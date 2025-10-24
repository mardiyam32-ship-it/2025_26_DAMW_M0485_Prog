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
        // declarem variables
        int num,print =2 ;
        Scanner in = new Scanner (System.in);
        //demanem el num
        System.out.print("Introduiex un numero natural : ");
        num= in.nextInt();
        while (print<num){
            System.out.println(print +" ");
            print+=2;
        }
        System.out.print("\b\n");
    }
}
