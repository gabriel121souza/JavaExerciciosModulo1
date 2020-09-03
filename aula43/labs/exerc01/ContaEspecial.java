package com.gabriel.cursojava.aula43.labs.exerc01;

//ContaEspecial herda ContaBancaria
public class ContaEspecial extends ContaBancaria {	
	//definindo as variaveis;
	private double limite;

	//encapsula os atributos
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	//criando os metodos
	public boolean sacar(double valor) {
		//criando a variavel saldoComLimite recebe o valor do saldo + limite;
		double saldoComLimite = this.getSaldo()+limite;
		//se saldoComLimite menos o valor atribuido for maior que 0;
		if((saldoComLimite-valor) >=0) {
			//setar o valor no saldo 
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "ContaEspecial[ ";
		s+= " Limite: " +limite;
		s+= super.toString();
		s+= "]";
		return s;
	}
}
