package exercicio;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        System.out.println("Atividade 11");
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.print("digite o segundo valor: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.println("Digite o terceiro valor: ");
        float num3 = sc.nextFloat();
        float resultadoA = ((num1*2)+(num2/2));
        System.out.println("Resposta da letra (A) e: " + resultadoA);
        
        float resultadoB = (num1 *3)+num3;
        System.out.println("Resposta da  letra (B) e: " + resultadoB);
        
        double resultadoC = Math.pow(num3, 3);
        System.out.println("Resposta da letra (C) e: "+ resultadoC);
        
    }
}
