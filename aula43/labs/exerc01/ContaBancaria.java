package com.gabriel.cursojava.aula43.labs.exerc01;

public class ContaBancaria {
	//declarar variaveis da super classe ContaBancaria;
	private String nomeCliente;
	private String numConta;
	private double saldo;

	
	//encapsule os atributos com getters e setters

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//criando os metodos da classe como sacar depositar e o toString;
	
	public void depositar(double valor) {
			saldo+=valor;
	}
	public boolean sacar(double valor) {
		if((saldo-valor)>=0) {
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String s = "ContaBancaria [";
		s+= " nomeCliente: "+ nomeCliente;
		s+= " numConta: " + numConta;
		s+= " saldo: " + saldo;
		s+= " ]";
		return s;
	}
	
}
