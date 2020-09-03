
package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean valida = false;
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;
        do{
                System.out.print("Digite o nome: ");
                nome = sc.next();
                if(nome.length()>3){
                     valida = true;
                }
                else{
                    System.out.print("nome precisa de 3 caracteres: ");
                }
        }while(!valida);
        valida = false;
        do{
            System.out.print("digite sua idade: ");
            idade = sc.nextInt();
            if(idade > 0 && idade <150){
                valida = true;
            }else{
                System.out.print("a idade precisa ter entre 0 a 150 anos: ");
            }
        }while(!valida);
        
        valida = false;
        do{
        System.out.print("digite seu salario: ");
        salario = sc.nextDouble();
        if(salario>0){
            valida = true;
        }else{
            System.out.println("o salario tem que ser maior que zero");
        }
    }while(!valida);
        valida = false;
        do{
            System.out.print("qual sexo m(masculino) f(feminino):  ");
            sexo = sc.next().charAt(0);
            if(sexo == 'm' || sexo == 'M'){
                valida = true;
            }else if(sexo == 'f' || sexo =='F'){
                valida = true;
            }else{
                System.out.println("entre apenas com m ou f");
            }
        }while(!valida);
        
        valida = false;
        do{
            System.out.println("estado civil s(solteiro), c(casado), v(viuvo), d(divorciado) ");
            estadoCivil =  sc.next().charAt(0);
            switch(estadoCivil){
                case 's': valida = true;break;
                case 'c': valida = true;break;
                case 'v': valida = true;break;
                case 'd': valida = true;break;
                default: System.out.print("entre com apenas as iniciais: ");
            }
            
        }while(!valida);
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Genero: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
}
}
