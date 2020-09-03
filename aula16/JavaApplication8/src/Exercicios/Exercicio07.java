
package Exercicios;

import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int maior =0;
        
        for(int i=0; i<5; i++){
            System.out.println("digite o valor do numero: ");
            a[i] = sc.nextInt();
            
            if(a[i]>maior){
                maior = a[i];
            }
        }
        System.out.println("o maior numero e: " + maior);
        
    }
}
