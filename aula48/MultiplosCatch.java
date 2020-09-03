package com.gabriel.cursojava.aula48;

public class MultiplosCatch {
	public static void main(String[] args) {
			int[] numeros = {4, 8, 16,32, 64, 128};
			int[] denominador = {2, 0, 4, 0, 8};
			
			for(int i =0; i<numeros.length; i++) {
				try {
				System.out.println(numeros[i]+ "/" +denominador[i]+ " = "+(numeros[i]/denominador[i]));
				}catch(ArithmeticException e1) {
					System.out.println("erro ao dividir por zero");
				}catch(ArrayIndexOutOfBoundsException e2) {
					System.out.println("faltou um numero no denominador");
				}
			}
	
		}
}
