package com.gabriel.cursojava.aula29;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "fiat";
		van.modelo = "ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numPassageiros);
	
		Carro van2 = new Carro("Fiat", "ducato", 10, 100, 0.2);
			van2.modelo = "ducatinho";
			System.out.println(van2.marca);
			System.out.println(van2.modelo);
			System.out.println(van2.capCombustivel);
			System.out.println(van2.consumoCombustivel);
			System.out.println(van2.numPassageiros);
			
		
	}
}
