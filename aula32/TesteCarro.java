package com.gabriel.cursojava.aula32;

public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro();
		van.setMarca("fiat");
		System.out.println(van.getMarca());
		
		van.setModelo("Ducati");
		System.out.println(van.getModelo());
	}
}
