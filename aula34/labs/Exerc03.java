package com.gabriel.cursojava.aula34.labs;

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("entre com o numero");
			num = sc.nextInt();
			
			if(num<0) {
				System.out.println("numero invalido entre novamente");
			}
		}while(num<0);
		System.out.println(Calculadora.fatorial(num));
		
		
	}
}
