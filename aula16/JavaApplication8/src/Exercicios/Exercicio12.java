
package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int num = 0;
          boolean valida = false;
            
          do{
              System.out.println("digite um valor da tabuada de 1 a 10");
              num = sc.nextInt();
              if(num>=0 && num<=10){
                  valida = true;
                  for(int i = 0; i<=10; i++){
                      int resultado = num * i;
                      System.out.println(num+ " x "+ i+" = "+ resultado);
                  }

              }else{
                  valida=false;
                  System.out.println("digite o numero de 0 a 10");
              }
          }while(!valida);
        
    }
}
