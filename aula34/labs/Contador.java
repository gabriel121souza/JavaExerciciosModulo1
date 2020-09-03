package com.gabriel.cursojava.aula34.labs;

public class Contador {
	static int total =0;
	public static int incremento() {
		for(int i=0; i<10; i++) {
			total++;
			System.out.println(total);
		}
		return total;
	}
	
	public static int decremento() {
		for(int i=10; i>0; i--) {
			total--;
			System.out.println(total);
		}
		return total;
	}
}
