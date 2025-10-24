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
public class Ex13 {
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
        Random random = new Random();
        int num, opcio,intents=0,min=1,max=101;
        boolean opcio_valida= false ;
        System.out.println("Pensa un numero Secret");
        do{
            num= random.nextInt(min,max);
            System.out.printf("Num secretes el %d " ,num);
            intents++;
            do {
            System.out.println("Esull opcio  :  1-Es mes gran 2-Es mes petit 0-Has encretat");
            opcio = scan.nextInt();
            if (opcio==0||opcio==1||opcio==2){
                opcio_valida=true ;
            }else{
                System.out.println("opcio incorrecte ");
            }
            }while (opcio_valida == false);
            if (opcio ==1){
                min= num;
            }else if ( opcio == 2){
                max = num;
            }else if (opcio == 0){
                System.out.printf("Enhorabona , has trobat el numero"+ "secret amb %d intents!\n",intents);
            }else {
                System.out.printf("opcio incorrecte");
            }
        }while (opcio !=0);
        
    }
            
}
    

