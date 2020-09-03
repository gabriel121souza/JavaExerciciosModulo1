
package Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int[] vetA = new int[10];
       int[] vetB = new int[vetA.length];
       int[] vetC = new int[vetB.length];
       for(int i = 0; i < vetA.length; i++){
           System.out.println("entre com o valor de A na posicao: " + i);
           vetA[i] = sc.nextInt();
       }
       for(int i = 0; i<vetB.length; i++){
           System.out.println("entre com o valor de B na posicao: " + i );
           vetB[i] = sc.nextInt();
           
       }
       for(int i = 0; i<vetC.length; i++){
           vetC[i] = vetA[i] * vetB[i];
    }
       
        System.out.println("valor de A = ");
        for(int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        System.out.println("Valor de B = ");
        for(int i = 0; i<vetB.length; i++){
            System.out.print(vetB[i]+" ");
        }
        System.out.println();
        System.out.println("valor de C =");
        for(int i = 0; i<vetC.length; i++){
            System.out.print( vetC[i] +" ");
        }
}
}