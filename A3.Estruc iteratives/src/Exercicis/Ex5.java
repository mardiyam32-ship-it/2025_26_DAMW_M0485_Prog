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
public class Ex5 {
    public static void main(String[] args) {
        // declarem variables
        int num;
        boolean  negatiu = false ;
        Scanner in = new Scanner (System.in);
        // demanem num
        for (int i =1 ; i<6; i++){
        System.out.print("Introduiex un numero no nulo: ");
        num=in.nextInt();
        if (num < 0){
            negatiu = true;
        }
        if (num == 0){
            System.out.println("Has introducido un numero nulo (o) , vuelve a ingresar otro");
            i--;
        } 
    }
    if (negatiu = false ){
        System.out.println("Nose ha introducido numeros negatius");
    }else{
        System.out.println("si se ha introducido algun numero negativo");
    }
    }
}
