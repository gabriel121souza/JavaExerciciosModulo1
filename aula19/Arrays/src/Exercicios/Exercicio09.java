package Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       float [] vetA  = new float[10];
       float [] vetB = new float[vetA.length];
       float [] vetC = new float[vetB.length];
       
       for(int i = 0; i< vetA.length; i++){
           System.out.println("entre com o valor de A na posicao " + i);
           vetA[i] = sc.nextFloat();
       }
       for(int i = 0; i< vetB.length; i++){
           System.out.println("entre com o valor de B na posicao " + i);
           vetB[i] = sc.nextFloat();
       }
       for(int i = 0; i<vetC.length; i++){
           vetC[i] = vetA[i] / vetB[i];
       }
       
        System.out.println("Vetor A = ");
       for(int i = 0; i<vetA.length; i++){
           System.out.print( vetA[i]+" ");
       } 
        System.out.println();
        System.out.println("Vetor B = ");
        for(int i = 0; i<vetB.length; i++){
            System.out.print(vetB[i]+ " ");
        }
        System.out.println();
        System.out.print("Vetor C =");
       for(int i = 0; i< vetC.length; i++){
           System.out.print(vetC[i]+ " ");
       }
    }
}
