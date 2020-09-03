package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [][] compromissos = new String[31] [24];
        boolean sair = false;
        int opcao;
        while(!sair){
            System.out.println("digite 1 para adicionar compromisso. ");
            System.out.println("digite 2 para verificar compromisso. ");
            System.out.println("digite 0 para sair. ");
            
            opcao = sc.nextByte();
            if(opcao ==1){ //adcionar 
               
                boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                
                    System.out.println("entre com o dia do mes: ");
                 dia = sc.nextInt();
                 if(dia>0 && dia <=31){
                     diaValido= true;
                 }else{
                     System.out.println("dia Invalido, digite novamente ");
                 }
                }
                boolean horaValida = false;
                int hora= 0;
                while(!horaValida){
                    System.out.println("entre com a hora do compromisso: ");
                    hora = sc.nextInt();
                    if(hora >=0 && hora<=24){
                        horaValida= true;
                    }else{
                        System.out.println("hora invalida, digite novamente: ");
                    }
                }
                dia--;
                System.out.println("digite o compromisso: ");
                compromissos[dia][hora] =  sc.next();
            
            
            
            } else if(opcao==2) {//verificar compromisso
                 boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                
                    System.out.println("entre com o dia do mes: ");
                 dia = sc.nextInt();
                 if(dia>0 && dia <=31){
                     diaValido= true;
                 }else{
                     System.out.println("dia Invalido, digite novamente ");
                 }
                }
                boolean horaValida = false;
                int hora= 0;
                while(!horaValida){
                    System.out.println("entre com a hora do compromisso: ");
                    hora = sc.nextInt();
                    if(hora >=0 && hora<=24){
                        horaValida= true;
                    }else{
                        System.out.println("hora invalida, digite novamente: ");
                    }
                }
                dia--;
                System.out.println("o compromisso agendado e: ");
                System.out.println(compromissos[dia][hora]);
                
                
                
            }else if(opcao ==0){ //sair
                sair = true;
            }else{
                System.out.println("opcao invalida, digite novamente: ");
                      
            }
    }
}
}