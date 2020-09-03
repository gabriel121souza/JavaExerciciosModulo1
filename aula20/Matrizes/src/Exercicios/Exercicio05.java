package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [][][] compromissos = new String[12][31] [8];
        boolean sair = false;
        int opcao;
        while(!sair){
            System.out.println("digite 1 para adicionar compromisso. ");
            System.out.println("digite 2 para verificar compromisso. ");
            System.out.println("digite 0 para sair. ");
            
            opcao = sc.nextByte();
            if(opcao ==1){ //adcionar 
               
                 boolean mesValido = false;
                int mes =0;
                while(!mesValido){
                
                    System.out.println("entre com o mes: ");
                 mes = sc.nextInt();
                 if(mes>0 && mes <=12){
                     mesValido= true;
                 }else{
                     System.out.println("mes Invalido, digite novamente ");
                 }
                }
              
                
                
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
                    if(hora >=0 && hora<=8){
                        horaValida= true;
                    }else{
                        System.out.println("hora invalida, digite novamente: ");
                    }
                }
                mes--;
                dia--;
                System.out.println("digite o compromisso: ");
                compromissos[mes][dia][hora] =  sc.next();
            
            
            
            } else if(opcao==2) {//verificar compromisso
                
                   boolean mesValido = false;
                int mes =0;
                while(!mesValido){
                
                    System.out.println("entre com o mes: ");
                 mes = sc.nextInt();
                 if(mes>0 && mes <=12){
                     mesValido= true;
                 }else{
                     System.out.println("mes Invalido, digite novamente ");
                 }
                }
              
                
                
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
                mes--;
                dia--;
                System.out.println("o compromisso agendado e: ");
                System.out.println(compromissos[mes][dia][hora]);
                
                
                
            }else if(opcao ==0){ //sair
                sair = true;
            }else{
                System.out.println("opcao invalida, digite novamente: ");
                      
            }
    }
    }
}
