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
public class Ex8 {
    public static void main(String[] args) {
        //declarem variable
        long num,suma=0,multiplicacio=1;
        Scanner scan = new Scanner(System.in);
        do {            
            System.out.print("Introduiex N: "); 
            num=scan.nextLong();
            if(num<=0){
                System.out.println("Torna a introduir el numero , " + "ha de ser natural positiu");
            }
        } while (num<=0);
        for(int i = 1; i <= num ;i++){
            suma+=i;
            multiplicacio*=i;  
        }
        System.out.printf("La suma dels %d primers num " + "naturals es %d\n",num,suma);
        System.out.printf("La multiplicacio dels %d primers " + "num naturals es %d\n" , num , multiplicacio);
}    
}