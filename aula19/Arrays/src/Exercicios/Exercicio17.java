
package Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetA[] = new int[10];
        
        for(int i = 0; i < vetA.length; i++){
            System.out.println("entre com o valor da posicao: " + i);
            vetA[i] = sc.nextInt();
        }
       int maiores =0;
       for(int  i= 0; i < vetA.length; i++){
           if(vetA[i] >= 35){
               maiores ++;
           }
       }
        System.out.println("Resutado do Vetor: ");
        for(int i = 0; i < vetA.length; i++){
            System.out.print(vetA[i]+" ");
        }
        System.out.println();
        System.out.println("quantidade pessoas maiores de 35 e : " + maiores);
    }
}
