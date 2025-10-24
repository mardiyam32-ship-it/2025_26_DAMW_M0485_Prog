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
public class Ex9 {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner (System.in);
        int contador= 0, aprovats;
        boolean excelent= false , nota_valida  ;
        double nota ;
        //programa 
        do { 
            do { //demanem i validem entrada de nota 
                nota_valida = false;
                System.out.print("Introduiex la nota : ");
                nota =scan.nextDouble();
                if (nota==-1){
                    System.out.println("Fi del programa ");
                    nota_valida = true ;
                }else if (nota <0 ||nota >10){
                 System.out.println("La nota ha de ser entre 0 i 10 ");
                }else{
                    nota_valida =true ;
                while (nota_valida ==false );
                contador ++;
                if (nota ==10) { // mirem si hi ha alguna nota quie sigui un 10 
                    excelent =true;
                }
                if (nota >=5){ // contabilitzem els aprovats
                    aprovats++;
                }
            }while (nota!=-1);//sortim del programa 
            if (excelent == true ){
                
            }
                        
            }
        }
    }
}

