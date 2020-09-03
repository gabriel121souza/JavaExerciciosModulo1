
package exercicio;

import java.util.Scanner;


public class Exercicio02 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor: ");
        int num = sc.nextInt();
        
        if(num>= 1){
            System.out.println("o valor e positivo");
        }else if( num <= -1){
            System.out.println("o valor e negativo");
    }else{
            System.out.println("o valor e neutro");
        }
}
}
