
package Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int [] vetA = new int[10];
         for(int i = 0; i< vetA.length; i++){
            System.out.println("entre com o numero da posicao: " + i);
           vetA[i] =  sc.nextInt();
           
         }
         int soma =0;
         int impar = 0;
         for(int i= 0; i<vetA.length; i++){
        if(vetA[i] %5 !=0){
            soma+= vetA[i];
            impar ++;
        }
    }
         System.out.println("vetor A = ");
         for(int i = 0; i < vetA.length; i++){
             System.out.println(vetA[i] +" ");
         }
         System.out.println();
         System.out.println("soma : " + soma);
         System.out.println("media: "+ (soma/impar));
        }
}
