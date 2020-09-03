
package Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("entre com um numero: ");
        int num = sc.nextInt();
        boolean primo = true;
        for(int i=2; i<=num; i++){
            if(num% i == 0){
                System.out.println("nao e primo");
                primo = false;
            }
        }
        if(primo){
            System.out.println("e numero primo");
        }
        
    }
}
