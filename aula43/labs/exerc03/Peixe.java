package com.gabriel.cursojava.aula43.labs.exerc03;

public class Peixe extends Animal {
	private String caracteristica;

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		String s = "Peixe: ";
		s+= super.toString();
		s+= "\nCaracteristica: " + caracteristica;
		return s;
	}
	}
	
