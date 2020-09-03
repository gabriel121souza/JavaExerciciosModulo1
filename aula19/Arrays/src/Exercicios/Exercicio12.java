
package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       int[] vetA = new int[10];
       
       for(int i = 0; i<vetA.length; i++){
           System.out.println("entre com o valor: na posicao : " + i);
           vetA[i] = sc.nextInt();
       }
        int soma = 0;
        for(int i =0; i<vetA.length; i++){
        soma += vetA[i];
    }
        System.out.println();
        
        System.out.println("o vetor A = ");
        for(int i=0; i<vetA.length; i++){
            System.out.println(vetA[i] + " ");
        }
        System.out.println();
        System.out.println("a soma de todos os valores e: "+soma);
    }
}
