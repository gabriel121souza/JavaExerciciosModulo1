
package exercicio;

import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args){
        System.out.println("Calculando a media");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o valores com espaco ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();
        
        float resultado = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("Sua media é: " + resultado);
    }
}
