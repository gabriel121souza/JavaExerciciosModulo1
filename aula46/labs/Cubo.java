package com.gabriel.cursojava.aula46.labs;

public class Cubo extends Figura3D {
	private int aresta;

	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(aresta, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * (aresta*aresta);
	}
	
}
