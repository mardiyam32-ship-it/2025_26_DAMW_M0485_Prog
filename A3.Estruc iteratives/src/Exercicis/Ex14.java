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
public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int valor,bit500=0,bit200=0,bit100=0,bit50=0,bit20=0,bit10=0,bit5=0;
        do{
            System.out.print("Introdueix un num multiple de 5 :  ");
            valor=scan.nextInt();
            if  (valor<0){
                System.out.println("La quantitat no pot ser negatiu ");
            }
            else if(valor%5!=0){
                System.out.println("Valor introduit no multile de 5!");
            }
        } while (valor%5!=0 || valor >=0);
        while(valor>=500){
            valor-=500;
            bit500++;
        }
        while(valor>=200){
            valor-=200;
            bit200++;
        }
        while(valor>=100){
            valor-=100;
            bit100++;
        }
        while(valor>=50){
            valor-=50;
            bit50++;
        }
        while(valor>=20){
            valor-=20;
            bit20++;
        }
        while(valor>=10){
            valor-=10;
            bit10++;
        }
        while(valor>=5){
            valor-=5;
            bit5++;
        }
        System.out.printf("La quantitat de billets per" + "aconseguir %d€ es de :\n",valor);
        System.out.printf("%d billets de 500\n",bit500);
        System.out.printf("%d billets de 200\n",bit200);
        System.out.printf("%d billets de 100\n",bit100);
        System.out.printf("%d billets de 50\n",bit50);
        System.out.printf("%d billets de 20\n",bit20);
        System.out.printf("%d billets de 10\n",bit10);
        System.out.printf("%d billets de 5\n",bit5);
            
    }
}
