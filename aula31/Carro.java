package com.gabriel.cursojava.aula31;

 class Carro {
	String marca;
	public String modelo;
	private int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
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
