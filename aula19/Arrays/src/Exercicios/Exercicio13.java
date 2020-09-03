package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int [] vetA = new int[10];
            for(int i = 0; i<vetA.length; i++){
                System.out.println("entre com o numero: ");
               vetA[i] = sc.nextInt();
            }
            int soma = 0;
            for(int i= 0; i<vetA.length; i++){
                if(vetA[i] %5 == 0){
                    soma += vetA[i];
                }
            }
                System.out.println("Vetor A = "); 
                for(int i = 0; i<vetA.length; i++){
                    System.out.print( vetA[i]+" ");
                }
                System.out.println();
                System.out.println("soma " + soma);
            }
}
