
package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com a nota de  0 a 10");
        
            boolean notaValida = false;
            do{
                
            
            int nota = sc.nextInt();
            if(nota >=0 && nota<10){
                notaValida=true;
                System.out.println("voge digitou: "+ nota);
            }else{
                System.out.println("nota invalida, digite novamente. ");
            }
            }while(!notaValida);
    }
}
