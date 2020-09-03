
package exercicio;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu turno (M)Matutino (V)Vespertino (N)Noturno: ");
        char turno = sc.next().charAt(0);
        switch(turno){
            case 'm'|'M': System.out.println("Bom dia");break;
            case 'M': System.out.println("Bom dia");break;
            case 'v': System.out.println("Boa tarde");break;
            case 'V': System.out.println("Boa tarde");break;
            case 'n': System.out.println("Boa noite");break;
            case 'N': System.out.println("Boa noite");break;
            default : System.out.println("valor invalido");
        }
        
    }
}
