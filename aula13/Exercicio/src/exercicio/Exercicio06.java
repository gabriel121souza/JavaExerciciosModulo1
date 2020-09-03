
package exercicio;

import java.util.Scanner;


public class Exercicio06 {
    public static void main(String[] args){
        System.out.println("Area de um Ciculo");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do Raio");
        double raio = sc.nextDouble();
        double pi = 3.14;
        double area = pi*(raio*raio);
        
        System.out.println("o valor da area é: " + area);
    }
}
