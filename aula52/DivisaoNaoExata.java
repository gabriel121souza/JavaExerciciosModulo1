package com.gabriel.cursojava.aula52;

public class DivisaoNaoExata extends UsandoMinhaException {
	protected int num;
	protected int den;
	public DivisaoNaoExata(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}
	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + "nao e um inteiro";
	}
	
	
}
