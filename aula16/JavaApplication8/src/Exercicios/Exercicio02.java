
package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        String senha;
      
        boolean valida = false;
        do{
                 System.out.print("Login entre com seu nome: ");
                  nome = sc.next();
                  System.out.print("Senha entre com sua senha: ");
                  senha = sc.next();
                  if(!(nome.equalsIgnoreCase(senha))){
                      valida = true;
                      System.out.println("usuario logado com sucesso");
                  }else{
                      System.out.println("falha em logar o usuario tente novamente: ");
                  }
          }while(!valida);
    }
}
