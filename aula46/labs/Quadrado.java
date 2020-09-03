package com.gabriel.cursojava.aula46.labs;

public class Quadrado extends Figura2D{
	private int lados;

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lados, 2);
	}
	
}
