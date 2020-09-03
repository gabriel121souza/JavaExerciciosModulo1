
package exercicio;

import java.util.Scanner;

public class Exercicio03 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Soma de Dois valores");
            System.out.println("Digite o primeiro valor");
            int num1 = sc.nextInt();
            
            System.out.println("Digite o Segundo valor");
            int num2 = sc.nextInt();
            
            int resultado = num1 + num2;
            System.out.println("O valor da somas dos dois valores é: " + resultado);
            
        }
}
