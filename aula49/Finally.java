package com.gabriel.cursojava.aula49;

public class Finally {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16,32, 64, 128};
		int[] denominador = {2, 0, 4, 0, 8};
		
		for(int i =0; i<numeros.length; i++) {
			try {
			System.out.println(numeros[i]+ "/" +denominador[i]+ " = "+(numeros[i]/denominador[i]));
			}catch(ArithmeticException e1) {
				System.out.println("erro ao dividir por zero");
			}catch(Throwable e2) {
				System.out.println("Ocorreu um erro");
				}
			finally {
				System.out.println("imprimir sempre que acabar");
			}
			}
	}

}
