package com.gabriel.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
	
			MinhaCalculadora calc = new MinhaCalculadora();
			MinhaCalculadora[] calcArray = new MinhaCalculadora[9];
			calc.soma(1, 2);
			calc.soma(3, 8, 5);
			calc.soma(3.0, 4.5);
		
	}

}
