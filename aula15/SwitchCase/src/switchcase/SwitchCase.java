
package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
            System.out.println("entre com um dia da semana");
            Scanner sc = new Scanner(System.in);
            
            int diaSemana = sc.nextInt();
            if(diaSemana== 1){
                System.out.println("Hoje e domingo");
            }else if (diaSemana == 2){
                System.out.println("Segunda");
            }else if (diaSemana == 3){
                System.out.println("terca");
            }else if (diaSemana == 4){
                System.out.println("quarta");
            }else if (diaSemana == 5){
                System.out.println("quinta");
            }else if (diaSemana == 6){
                System.out.println("Sexta");
            }else if (diaSemana == 7){
                System.out.println("Sabado");
            }else {
                System.out.println("dia invalido");
            }
            
            switch(diaSemana){
        case 1: System.out.println("Hoje e domingo"); break;
        case 2: System.out.println("Hoje e Segunda");break;
        case 3: System.out.println("Hoje e Terca");break;
        case 4: System.out.println("Hoje e Quarta");break;
        case 5: System.out.println("Hoje e Quinta");break;
        case 6: System.out.println("Hoje e Sexta");break;
        case 7: System.out.println("Hoje e Sabado");break;
        default: System.out.println("dia invalido");
        
    }
    }
    
}
