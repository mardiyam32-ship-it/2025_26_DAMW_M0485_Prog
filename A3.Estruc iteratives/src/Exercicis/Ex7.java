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
        // declarem variables 
        int num,positius=0,negatius=0,contador=0;
        Scanner scan = new Scanner (System.in);
        do {            
            System.out.print("Introduiex num = "); 
            num=scan.nextInt();
            if(num>0){
                positius++;
            }else if (num<0){
                negatius++;
            }else {
            System.out.println("Sortint del programa...");
        }
            contador++;
        } while (num!=0);
        System.out.printf("De %d numeros introducidos, " + "%d son negativos y %d positivos\n" ,contador-1,negatius,positius);
        
        
                
    }
 
}
