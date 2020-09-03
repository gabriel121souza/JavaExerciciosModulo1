 
package Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int num = 0;
       int par = 0;
       int impar= 0;
      for(int i = 0; i <10; i++){
          System.out.println("entre com um numero");
          num= sc.nextInt();
             if(num%2 == 0){
                 par++;
             }else{
                 impar ++;
             }
      }
        System.out.println("numeros pares: "+ par);
        System.out.println("numeros impares: "+ impar);
    }
}
