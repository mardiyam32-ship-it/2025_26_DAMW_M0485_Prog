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
public class Ex10 {
    public static void main(String[] args) {
        // declarem variables
        Scanner scan=new Scanner (System.in);
        int M,N,parells=0,Imparells=0;
        System.out.print("Introdueix M: ");
        M=scan.nextInt();
        System.out.print("Introdueix N : ");
        N=scan.nextInt();
        if (M==N){
            System.out.print("Els dos numeros son iguals");
        }else{
            if (M>N){ // les paso en ordre ascendent en cas que no ho siguin
                int aux = M;
                M=N;
                N=aux;         
            }
            for (int i = M + 1 ; i > N , i++){
                if(i%2==0){
                    parells+=i;
                }else {
                    imparells+=i;
                }
            }
        }
      
    }   
  
}
