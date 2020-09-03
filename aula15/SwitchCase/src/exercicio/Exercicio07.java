package exercicio;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("entre com o primeiro valor: ");
            int a = sc.nextInt();
        System.out.print("entre com o segundo  valor: ");
             int b = sc.nextInt();
        System.out.print("entre com o terceiro valor: ");
            int c = sc.nextInt();
            
            if(a > b && a > c) {
                System.out.println("o primeiro valor e o maior " + a);
            }else if(b>a && b>c){
                System.out.println("o segundo valor e o maior "+ b);
            }
            else if(c>a && c>b){
                System.out.println("o terceiro valor e o maior "+ c);
            }
            else {
                System.out.println("os tres valores sao iguais");
            }
            if(a < b && a < c) {
                System.out.println("o primeiro valor e o menor" + a);
            }else if(b<a && b<c){
                System.out.println("o segundo valor e o menor "+ b);
            }
            else if(c<a && c<b){
                System.out.println("o terceiro valor e o menor "+ c);
            }
            
            
    }
}