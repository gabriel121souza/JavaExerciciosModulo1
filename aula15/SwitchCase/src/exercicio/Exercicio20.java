
package exercicio;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Interrogacao de pessoas: responda com 1(sim) ou 0(nao) ");
        System.out.print("voce telefonou para vitima? :");
         int resp1 = sc.nextInt();
        System.out.print("Esteve no local do crime ?:");
        int resp2 = sc.nextInt();
        System.out.print("mora perto da vitima ? :");
        int resp3 = sc.nextInt();
        System.out.print("Devia a vitima ? :");
        int resp4 = sc.nextInt();
        System.out.print("ja trabalhou com a vitima:");
        int resp5 = sc.nextInt();
        
        int  result = resp1 + resp2+ resp3 + resp4 + resp5;
        if(result==5){
            System.out.println("Assasino");
        }else if(result >=3 && result <=4){
            System.out.println("cumplice");
        }else if(result >0 && result <=2){
            System.out.println("suspeito");
        }else if( result == 0){
            System.out.println("inocente");
        }else{
            System.out.println("respostas invalidas pergunte novamente");
        }
    }
}
