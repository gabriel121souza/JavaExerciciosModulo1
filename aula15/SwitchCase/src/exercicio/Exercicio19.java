
package exercicio;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("entre com o  primeiro valor ");
            double num1 = sc.nextInt();
            System.out.println("qual operacao quer fazer ");
            char op = sc.next().charAt(0);        
            System.out.println("entre com o segundo valor");
            double num2 = sc.nextInt();
  
            if(op == '+' ){
                 double resultado = num1 + num2;
                  System.out.println("resultado: " + resultado);
                      if(resultado % 2 == 0){
                      System.out.println("numero e par");
                  }else{
                      System.out.println("impar");
                  }
                  if(resultado > 0){
                      System.out.println("positivo");
                      
                  }else if(resultado == 0){
                      System.out.println("e neutro");
                  }else{
                      System.out.println("negativo");
                  }
            }
            else if(op == '-' ){
                 double resultado = num1 - num2;
                  System.out.println("resultado: " + resultado);
                      if(resultado % 2 == 0){
                      System.out.println("numero e par");
                  }else{
                      System.out.println("impar");
                  }
                  if(resultado > 0){
                      System.out.println("positivo");
                      
                  }else if(resultado == 0){
                      System.out.println("e neutro");
                  }else{
                      System.out.println("negativo");
                  }
            } else if(op == '*' ){
                 double resultado = num1 * num2;
                  System.out.println("resultado: " + resultado);
                      
                  if(resultado > 0){
                      System.out.println("positivo");
                      
                  }else if(resultado == 0){
                      System.out.println("e neutro");
                  }else{
                      System.out.println("negativo");
                  }if(resultado % 2 == 0){
                      System.out.println("numero e par");
                  }else{
                      System.out.println("impar");
                  }
            
            }else if(op == '/' ){
                 double resultado = num1 / num2;
                 System.out.println("resultado: " + resultado);
                  if(resultado > 0){
                      System.out.println("positivo");
                      
                  }else if(resultado == 0){
                      System.out.println("e neutro");
                  }else{
                      System.out.println("negativo");
                  }
                 
                 if(resultado % 2 == 0){
                      System.out.println("numero e par");
                  }else{
                      System.out.println("impar");
                  }
                 
            }
            
            
            
    }
}
