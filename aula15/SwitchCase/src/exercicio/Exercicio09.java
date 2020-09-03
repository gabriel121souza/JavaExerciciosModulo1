
package exercicio;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){ 
        System.out.println("numero em ordem decrescente");
        Scanner sc = new Scanner(System.in);
        System.out.print("entre com o primeiro valor: ");
            int a = sc.nextInt();
        System.out.print("entre com o segundo valor: ");
            int b = sc.nextInt();
        System.out.print("entre com o terceiro valor: ");    
            int c = sc.nextInt();
            
         if(a>b && b>c){
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
         }else if(a>b && c>b){
             System.out.println(a);
             System.out.println(c);
             System.out.println(b);
         }
         else if(b>a && a>c){
             System.out.println(b);
             System.out.println(a);
             System.out.println(c);
         }else if(b>a && c>a){
             System.out.println(b);
             System.out.println(c);
             System.out.println(a);
         }
         else if(c>a && a>b){
             System.out.println(c);
             System.out.println(a);
             System.out.println(b);
         }else if(c>a && b>a ){
             System.out.println(c);
             System.out.println(b);
             System.out.println(a);
         }
    }   
}
