
package exercicio;

import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[]  args){
           Scanner sc = new Scanner(System.in);
           
           System.out.print("entre com o primeiro valor: ");
           int num1 = sc.nextInt();
           
           System.out.print("entre com o segundo valor: " );
           int num2 = sc.nextInt();
           
           if(num1 > num2){
               System.out.println("o maior numero:  " + num1);
           }
           else if(num2 > num1){
               System.out.println("o maior numero : " + num2);
           }
           else if(num1 == num2){
               System.out.println("Ambos tem o mesmo valor");
           }
        }
}
