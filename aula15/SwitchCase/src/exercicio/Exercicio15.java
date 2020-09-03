
package exercicio;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Faca as medidas do triangulo");
        System.out.print("Entre com o valor do Lado A: " );
        float ladoa = sc.nextFloat();
        System.out.print("Entre com o valor do Lado B: ");
        float ladob= sc.nextFloat();
        System.out.print("Entre com o valor da base: ");
        float base = sc.nextFloat();
        
        if(ladoa == ladob && ladob ==base){
                System.out.println("seu TRIANGULO E UM EQUILATERO");
        }else if(ladoa==ladob && ladob!=base){
             System.out.println("seu TRIANGULO E UM ISOSCELES");
        }else if(ladoa != ladob && ladob!=base && ladoa!=base){
             System.out.println("seu TRIANGULO E UM Escaleno");
        }else{
            System.out.println("Seu Triangulo e um Retangulo");
        }
            
    }
}
