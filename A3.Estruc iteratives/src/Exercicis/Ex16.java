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
public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num,contador=0;
        do{
            System.out.println("Introduiex num enter i positiu: ");
            num=scan.nextInt();
            if (num<=0){
                System.out.println("El num no es positiu ");
            }
        }while (num<=0);
        if (num <=2) {
            System.out.println("no hi ha numeros primers entre 0 i "+ num);
        }
        for (int i = 2; i < num ;i++){
            boolean primer = true;
            for (int j = 2; j <=Math.sqrt(i);j++){
            if (i % j ==0){
                primer= false ;
            }
            if(primer==true){
                System.out.printf("%d",i);
                contador++;
        }
            }
        }
        System.out.printf("\ns'han trobat %d numeros primers\n",contador);
    }
}
