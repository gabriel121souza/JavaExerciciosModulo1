package com.gabriel.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	

	public Carro(String marca, String modelo, int numPassageiros) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parametros");
	}

	
	
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("chamando construtor com 2 paramentro");
	}


	public Carro() {

	}

	//metodo ou action
	void exibirAutonomia() {
		System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia() {
		System.out.println("Metodo obter Autonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
