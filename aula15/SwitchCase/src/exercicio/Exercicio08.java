package exercicio;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("valor do produto 01: ");
            double pd1 = sc.nextDouble();
         System.out.print("valor do produto 02: " );
            double pd2 = sc.nextDouble();
         System.out.print("valor do produto 03: ");
            double pd3 = sc.nextDouble();
            
            if(pd1 < pd2 && pd1< pd3){
                System.out.println("o primeiro produto e o mais indicado");
            }else if(pd2< pd1 && pd2 < pd3){
                System.out.println("o segundo produto e o mais indicado");
            }else if(pd3 < pd1 && pd3<pd2){
                System.out.println("o terceiro produto e o mais indicado");
            }else{
                System.out.println("voce pode comprar qualquer um dos 3 produtos");
            }
    }
}
