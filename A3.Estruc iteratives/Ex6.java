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
public class Ex6 {
    public static void main(String[] args) {
        // declarem variables 
        int N,positivo=0, negativo=0, num;
        Scanner scan = new Scanner (System.in);
        System.out.println("Cuantos numeros quieres pedir? ");
        N = scan.nextInt();
        //Inicio del programa
        for (int i =1 ; i <=N ; i++){
            System.out.printf("Introduce el %d: ",i);
            num = scan.nextInt();
            if (num==0){
                System.out.println("Has introducido un numero nulo(0),vuelve a ingresar otro ");
                i--;
            }
            if (num<0){
                negativo++;
            }else {
                positivo++;
            }
       
        System.out.printf("De %d numero introducidos ,%d son negativos y %d positivos\n",num,negativo,positivo);         
    }
}
}