
package Exercicios;

import java.util.Scanner;

public class Exercicio17 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("digite o numero: ");
            int num = sc.nextInt();
            
            System.out.println(num+ "! =");
            int fatorial = 1;
            for(int i=num; i>0; i--){
                fatorial *= i;
                System.out.println(i+ " * ");
            }
            System.out.println("Resultado: "+fatorial);
                }
}
