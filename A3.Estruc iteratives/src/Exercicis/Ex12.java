/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicis;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mmo1100
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        int secret,num, intents=0;
        secret=random.nextInt(1,100);
        do{
            System.out.println("Introdueix un num: ");
            num=scan.nextInt();
            intents++;
            if (num>secret){
                System.out.println("El numero a adivinar es mes petit ! ");
            }else if ( num<secret){
                System.out.println("El numero a adivinar es mes gran!");
            }else {
                System.out.printf("Enhorabona , has trobat el numero " + "secret amb %d intents!\n",intents);
            }
        }while (num!=secret);
        
    }
            
}
