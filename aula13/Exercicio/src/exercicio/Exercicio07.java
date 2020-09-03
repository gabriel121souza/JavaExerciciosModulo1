
package exercicio;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        System.out.println("area de um quadrado vezes 2 ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do Quadrado");
        
        double quadrado = sc.nextDouble();
        double resultado = quadrado * 4;
        double resultadox2 = resultado * 2;
        System.out.println("valor do quadrado é: " + resultado);
        System.out.println("valor do quadrado multiplicado por 2 é: " + resultadox2);
    }
}
