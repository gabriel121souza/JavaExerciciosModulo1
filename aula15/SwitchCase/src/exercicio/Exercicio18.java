
package exercicio;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("entre com o valor: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("o valor e neutro");
        }else if(num % 2 ==0){
            System.out.println("o valor e par");
        }else{
            System.out.println("o valor e impar");
        }
    }
    
}
