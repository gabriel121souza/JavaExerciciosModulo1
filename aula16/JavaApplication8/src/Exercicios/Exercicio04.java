
package Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args){
    int  popA = 80000;
    int popB =  200000;
    int  cont = 0;
  while(popA<= popB){
      popA += (popA/100)*3;
      popB +=(popB/100)*1.5;
      cont ++;
  }
        System.out.println("populacao A: " + popA);
        System.out.println("populacao A: " + popB);
         System.out.println("populacao A ultrapassará a populacao B em " + cont);   
    }
}
