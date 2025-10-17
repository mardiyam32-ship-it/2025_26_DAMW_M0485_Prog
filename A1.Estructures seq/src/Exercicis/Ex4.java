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
        // definir les variable
        final double PI=3.14;
        double radi, longitus, area, volum;
        Scanner scan = new Scanner (System.in);
        //funcionament del main
        System.out.print("Introdueix radi: ");
        radi = scan.nextDouble();
        double longitud = 2*PI*radi;
        area=PI*radi*radi;
        volum=(4/3)*PI*radi*radi*radi;
        System.out.printf("Longitud de circuferencia de radi %.2f = %.2f\n"radi,longitud);
        System.out.printf("area de circuferencia de radi %.2f = %.2f\n"radi,area);
        System.out.printf("volum de circuferencia de radi %.2f = %.2f\n"radi,volum);
    }
}
