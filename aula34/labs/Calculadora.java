package com.gabriel.cursojava.aula34.labs;

public class Calculadora {
	static int soma;
	static int subtrair;
	static int multiplicar;
	static double dividir; 
	
	public static int adicao(int num1, int num2) {
		  soma = num1 + num2;
		  return soma;
	}
	
	public static int subtracao(int num1, int num2) {
		  subtrair = num1 - num2;
		  return subtrair;
	}
	public static int multiplicacao(int num1, int num2) {
		  multiplicar = num1 * num2;
		  return multiplicar;
	}
	public static double divisao(int num1, int num2) {
		  dividir = num1 / num2;
		  return dividir;
	}
	
	public static int pontecia (int num1, int num2) {
		int total = num1;
		for(int i=1; i<num2; i++) {
			total*=num1;
		}
		return total;
	}
	public static int fatorial(int num) {
		if(num==0) {
			return 1;
		}
		int total =1;

		for(int i=num; i>1; i--) {
			total *=i;
		}
		return total;
	}
}
