
package Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] vetA = new int[10];
        for(int i = 0; i < vetA.length; i++){
            System.out.println("entre com o valor da posicao : " + i);
            vetA[i] = sc.nextInt();
        }
        
        int menor =  vetA[0];
        int indexMenor =  0;
        int maior =  vetA[0];
        int indexMaior =  0;
        
        for( int  i =1; i < vetA.length; i++){
            if(vetA[i] > maior){
                maior = vetA[i];
                indexMaior = i;
            }else if(vetA[i]< menor){
                menor = vetA[i];
                indexMenor = i;
            }
        }
        System.out.println("vetor de idades: ");
        for(int i=0; i <vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        System.out.println("menor idade : " + menor);
        System.out.println("indice menor idade : " + indexMenor);
        System.out.println(" maior  idade : " + maior);
        System.out.println("indice maior idade : " + indexMaior);
    }
}
