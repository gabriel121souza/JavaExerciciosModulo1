package com.gabriel.cursojava.aula33.labs;
public class Lampada{
	private boolean ligada;
	
	public Lampada() {}
	public Lampada(boolean ligada) {
		super();
		this.ligada = ligada;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}
	
	public void mostrarEstado() {
		if(!isLigada()) {
			System.out.println("A Lampada está Desligada");
		}else {
			System.out.println("A Lampada está Ligada");
		}
	}
	
	public void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}

	} 
}
