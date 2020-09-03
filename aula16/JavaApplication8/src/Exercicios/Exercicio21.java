
package Exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com um numero classe; ");
        int numTurmas = sc.nextInt();
        
        int numAlunos;
        int soma = 0;
        double media = 0;
        boolean invalido = false;
        for(int i =1; i<=numTurmas; i++){
            invalido = true;
            do{
            System.out.println("Entre com o numero de alunos da turma "+ i);
            numAlunos = sc.nextInt();
            if(numAlunos < 40){
                invalido = false;
                }else{
                System.out.println("numero de alunos tente novamente");
            }
            }while(!invalido);
            soma+=numAlunos;
        }
        media = soma/numTurmas;
        System.out.println("media: " + media);
    }
}
