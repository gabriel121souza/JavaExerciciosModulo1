
package exercicio;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                System.out.println("Entre com o valor de A: ");
                double a = sc.nextDouble();
                if(a ==  0){
                    System.out.println("nao e equacao de segundo grau");
                            
                }else{
            
                System.out.println("entre com o valor do b: ");
                double b = sc.nextDouble();
                
                System.out.println("entre com op valor de c: ");
               double c = sc.nextDouble();
                
                  double delta = (b*b) - (4*a*c);
                  if(delta<0){
                      System.out.println("delta negativo");
                  }else{
                      System.out.println("delta: " + delta);
                      double x1 = ((-b) +Math.sqrt(delta)) / ( 2*a);
                       double x2 = ((-b) -Math.sqrt(delta)) / ( 2*a);
                       
                       System.out.println("x1 = "+x1);
                       System.out.println("x2 = "+x2);
                  }
       
                }
                }   
}
