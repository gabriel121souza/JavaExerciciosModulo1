
package Exercicios;

import java.util.Scanner;


public class Exercicio11 {
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;
        int soma = 0;
        for(int i =0; i<=2; i++){
            System.out.println("digite o primeiro valor: ");
            num1= sc.nextInt();
            System.out.println("digite o segundo valor: ");
            num2 = sc.nextInt();
            num1+=1;
            for(i  = num1; i<num2; i++){
                System.out.println("o intevalor é: " + i);
                 soma += i;
                 
            }
        
      }
           System.out.println("a soma dos valores é:" + soma);
}
}
