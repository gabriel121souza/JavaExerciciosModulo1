
package exercicio;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o ano: ");
        int ano = sc.nextInt();
        if((ano % 400 == 0) || (ano%4==0 && ano % 100 !=0)){
            System.out.println("o ano e bisexto");
        }else{
            System.out.println("o ano nao e bisexto");
        }
    }
}
