
package exercicio;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("digite uma letra");
        char letra = sc.next().charAt(0);
        
        switch(letra){
            case 'a' : System.out.println("vogal");break;
            case 'b' : System.out.println("consoante");break;
            case 'c' : System.out.println("consoante");break;
            case 'd' : System.out.println("consoante");break;
            case 'e' : System.out.println("vogal");break;
            case 'f' : System.out.println("consoante");break;
            case 'g' : System.out.println("consoante");break;
            case 'h' : System.out.println("consoante");break;
            case 'i' : System.out.println("vogal");break;
            case 'j' : System.out.println("consoante");break;
            case 'k' : System.out.println("consoante");break;
            case 'l' : System.out.println("consoante");break;
            case 'm' : System.out.println("consoante");break;
            case 'n' : System.out.println("consoante");break;
            case 'o' : System.out.println("vogal");break;
             case 'p' : System.out.println("consoante");break;
            case 'q' : System.out.println("consoante");break;
            case 'r' : System.out.println("consoante");break;
            case 's' : System.out.println("consoante");break;
            case 't' : System.out.println("consoante");break;
            case 'u' : System.out.println("vogal");break;
            case 'v' : System.out.println("consoante");break;
             case 'w' : System.out.println("consoante");break;
            case 'x' : System.out.println("consoante");break;
            case 'y' : System.out.println("consoante");break;
            case 'z' : System.out.println("consoante");break;
            default : System.out.println("letra nao existe no nosso alfabeto");
        }
       
    }
}
