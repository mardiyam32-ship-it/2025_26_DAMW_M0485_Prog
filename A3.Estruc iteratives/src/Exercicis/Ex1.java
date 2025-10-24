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
        //declarem variables 
        int num;
        Scanner in = new Scanner(System.in);
        //demanem num 
        System.out.print("Introdueix un numero natural : ");
        num = in.nextInt();
        if (num>0){
            for (int i = 1 ; i <=num; i++){
                System.out.println(i+"");
            }
            System.out.printf("\b\n");
        }else{
            System.out.println(" El numero ha de ser positiu!");
        }
    }
         
}
