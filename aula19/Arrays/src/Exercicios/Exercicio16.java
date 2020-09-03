
package Exercicios;

import java.util.Scanner;


public class Exercicio16 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[10];
        for(int i =0; i < vetA.length; i ++){
            System.out.println("entre com o valor da posicao " + i);
            vetA[i] =sc.nextInt();
        }
        int maiores =0;
        int soma = 0;
        int menores =0;
        int igual  =0;
        for(int i =0; i< vetA.length; i++){
            if(vetA[i] >15){
                maiores++;
                soma +=  vetA[i];
            } else if(vetA[i] < 15){
                menores ++;
            }else{
                igual ++;
            }
        }
        
        System.out.println("Vetor A = ");
        for(int i = 0; i < vetA.length; i++){
            System.out.print( vetA[i]+" ");
        }
        System.out.println();
        System.out.println("valores menores que 15: " + menores);
        System.out.println("valores igual a 15: " + igual);
        System.out.println("valores maiores que 15: " + maiores);
        System.out.println(" soma dos valores maiores que 15: " + soma);
        
    }
}
