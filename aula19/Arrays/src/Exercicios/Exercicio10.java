
package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[10];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetB.length];
        
        for(int i =0; i<vetA.length; i++){
            System.out.println("entre com o valor de A na posicao " + i);
             vetA[i] = sc.nextInt();
        }
        for(int i = 0; i< vetB.length; i++){
            vetB[i]= vetA[i] %2;
        }
        System.out.println("Vetor A = ");
        for(int i =0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B = ");
        for(int i =0; i<vetB.length; i++){
            System.out.print(vetB[i] +" ");
        }
    }
}
