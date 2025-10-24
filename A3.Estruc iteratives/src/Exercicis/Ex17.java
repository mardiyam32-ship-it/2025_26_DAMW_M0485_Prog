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
public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int min=9999,max=-99999,opcio, num,contador=0;
        double media=0;
        do {            
            System.out.println("Introduiex num");
            num=entrada.nextInt();
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
            media+=num;
            contador++;
            System.out.println("Vols seguir introduint numeros? 1-si,0-no");
            opcio=entrada.nextInt();
        } while (opcio!=0);
        System.out.println("");
    }
}
