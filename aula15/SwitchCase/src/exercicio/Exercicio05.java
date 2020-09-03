
package exercicio;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args){
        System.out.println("Calculando a media");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a sua nota no primeiro semestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a sua nota do segundo semestre: ");
        double nota2 = sc.nextDouble();
        
        double media  = (nota1 + nota2)/2;
        if(media >= 7 && media<=9){
            System.out.println("parabens voce foi aprovado " + media);
        }else if(media==10){
            System.out.println("Aprovado com distinçao "+ media);
        }
        else if(media<7){
            System.out.println("Reprovado "+ media);
        }else{
            System.out.println("notas invalidas "+ media);
        }
    }
}
