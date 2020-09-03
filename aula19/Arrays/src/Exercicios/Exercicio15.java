
package Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] vetA = new int[10];
                
                for(int i = 0; i < vetA.length; i++){
                    System.out.println("entre com o valor da posicao   "+ i);
                    vetA[i] = sc.nextInt();
                }
                int impar = 0;
                
                for(int i = 0; i<vetA.length; i++){
                    if(vetA[i]%2 != 0){
                        impar ++;
                    }
                }
                int par = vetA.length - impar;
                
                double porcPar = (par * 100)/vetA.length;
                double porcImpar = 100 - porcPar;
                
                System.out.println("Vetor A = ");
                for(int i = 0; i < vetA.length; i ++){
                    System.out.print(vetA[i] +  " ");
                }
                System.out.println();
                
              System.out.println("porcentagem pares " + porcPar);          
              System.out.println("porcentagem impares " + porcImpar);          
    }
}
