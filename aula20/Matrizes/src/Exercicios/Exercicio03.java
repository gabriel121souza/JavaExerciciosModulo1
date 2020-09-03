package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] vet = new int [3][3];
        
        for(int i = 0; i<vet.length; ++i){
                for(int j = 0; j<vet[i].length; j++){
                        System.out.println("entre com o numero da posicao: [" + i +", " + j+"]" );
                        vet[i][j] = sc.nextInt();
            
                }
    }
        int qtdPares = 0;
        int qtdImpares =0;
        for(int i = 0; i<vet.length; i++){
            for(int j = 0; j<vet[i].length; j++){
                 if(vet[i][j] % 2 ==0 ){
                     qtdPares ++;
                 }else{
                     qtdImpares ++;
                 }
            }
        }
        for(int i = 0; i<vet.length; i++){
            for(int j = 0; j<vet[i].length; j++){
                System.out.print( vet[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("quantidade de numeros impares e: " + qtdImpares);
        System.out.println("quantidade de numeros pares e: " + qtdPares);
    }
}
