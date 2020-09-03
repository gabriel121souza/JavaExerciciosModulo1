package com.gabriel.cursojava.aula34.labs;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora.adicao(8, 8);
		Calculadora.subtracao(5, 3);
		Calculadora.multiplicacao(9, 9);
		Calculadora.divisao(25, 5);
		
		System.out.println(Calculadora.soma);
		System.out.println(Calculadora.subtrair);
		System.out.println(Calculadora.multiplicar);
		System.out.println(Calculadora.dividir);
		System.out.println(Calculadora.pontecia(2, 15));
	}
}
 