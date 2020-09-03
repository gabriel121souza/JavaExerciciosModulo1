
package lendodadosdoteclado;

import java.util.Scanner;


public class LendoDadosDoTeclado {

  
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
              
            /*
                //lendo nome completo
                System.out.println("Digite seu nome Completo: ");
                String nomeCompleto  = sc.nextLine();
                System .out.println("Seu nome completo e: " + nomeCompleto);
                
                //lendo o primeiro nome
                System.out.println("Digite seu primeiro nome: " );
                String primeiroNome = sc.next();
                System.out.println("seu primeiro nome e "+ primeiroNome);
        
                // lendo um valor inteiro
                System.out.println("Digite a sua idade: ");
                int idade = sc.nextInt();
                System.out.println("sua idade e: " + idade);
                    //altura
                System.out.println("digite sua altura: ");
                double altura = sc.nextDouble();
                System.out.println("sua altura e: " + altura); 
                */

                // exemplo final
                
                System.out.println("Digite seu Nome: idade, quantidade de filhos, altura,  possui peth ");
                String nome = sc.next();
                int idade = sc.nextInt();
                byte filhos = sc.nextByte();
                float altura = sc.nextFloat();
                boolean temPet = sc.nextBoolean();
                
                System.out.println("Voce digitou os seguintes valores:");
                System.out.println("Nome: " + nome);
                System.out.println("idade: " + idade);
                System.out.println("altura: " + altura);
                System.out.println("filhos: " + filhos);
                System.out.println("possui algum pett" + temPet);
                
                
                
                
                
    }
    
}
