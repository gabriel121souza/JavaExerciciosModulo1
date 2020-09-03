
package exercicio;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entre com M ou F: ");
        char sexo = sc.next().charAt(0);
        
        if((sexo == 'M') || (sexo=='m')){
            System.out.println(" A pessoa e masculino");
        }
        else if((sexo == 'F') || (sexo=='f')){
            System.out.println("A pessoa e feminina");
    }else{
            System.out.println("genero invalido");
        }
        
    }
}
