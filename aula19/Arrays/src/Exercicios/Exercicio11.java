package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int [] vetA = new int[10];
        int cont =0;
        
        for(int i =0; i < vetA.length; i++){
            System.out.println("entre com o numero: ");
            vetA[i] = sc.nextInt();
            if(vetA[i]%2==0){
                cont ++;
            }
            System.out.println("a quantidade de numeros pares sao: " + cont);
        }
       
        
        
    }
}
