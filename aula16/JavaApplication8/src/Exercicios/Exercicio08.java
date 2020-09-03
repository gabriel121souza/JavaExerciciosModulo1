
package Exercicios;

import java.util.Scanner;


public class Exercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double media;
        int num;
        int soma = 0;
        for(int i = 0; i<5; i++){
            System.out.println("Digite um numero: ");
            num = sc.nextInt();
            soma += num;
          
        }
        media = soma /5;
        System.out.println("Somar : " + soma);
        System.out.println("MEdia: " + media);
    }
}
