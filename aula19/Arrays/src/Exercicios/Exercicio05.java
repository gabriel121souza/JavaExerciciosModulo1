
package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int vetA[] = new int[10];
       int vetB[] = new int[vetA.length];
       
       for(int i =0; i<vetA.length; i++){
           System.out.println("entre com o valor da posicao: " + i);
           vetA[i] = sc.nextInt();
           vetB[i] = vetA[i]*i;
           
       }
       System.out.println("Vetor A = ");
       for(int i =0; i<vetA.length; i++){
           System.out.println(vetA[i] + " ");
           
       }
       System.out.println();
       
   }
}
