
package exercicio;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite A primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("digite a Segunda nota: ");
        double nota2 = sc.nextDouble();
        
        double media = (nota1 + nota2)/2;
        if(media>=9 && media<=10){
            System.out.println("Aprovado");
            System.out.println("Nota (A)"); 
                    
        }else if(media>=7.5 && media < 9){
             System.out.println("Aprovado");
            System.out.println("Nota (B)"); 
        }
        else if(media>=6 && media <7.5 ){
             System.out.println("Aprovado");
            System.out.println("Nota (C)"); 
        }
        else if(media>=4 && media<6){
             System.out.println("Reprovado");
            System.out.println("Nota (D)"); 
        }
        else if(media >=0 && media<4){
             System.out.println("Reprovado");
            System.out.println("Nota (E)"); 
        }else{
            System.out.println("valor da notas erradas");
        }
        
        System.out.println("sua media e: " + media);
        
    }
}
