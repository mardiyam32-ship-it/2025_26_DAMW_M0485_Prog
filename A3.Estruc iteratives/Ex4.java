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
public class Ex4 {
    public static void main(String[] args) {
        // declarem variables
        int num,result = 1;
        // demanem num
        Scanner in = new Scanner (System.in);
        System.out.println("Introduiex num¡ numero positiu: ");
        num=in.nextInt();
        System.out.print(num+"!=");
        for (int i = num; i > 0; i--) {
            result*=i;
            System.out.print(i+"*");
        }
         System.out.printf("\b=%d\n",result);       
    }
}
