package com.gabriel.cursojava.aula33.labs;

public class Conta {
	private String usuario;
	private String conta;
	private String agencia;
	private double saldo;
	private double limiteEspecial;
	private boolean privilegiu;
	
	public Conta() {}
	public Conta(String usuario, String conta, String agencia, double saldo, double limiteEspecial,
			boolean privilegiu) {
		super();
		this.usuario = usuario;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
		this.privilegiu = privilegiu;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public boolean isPrivilegiu() {
		return privilegiu;
	}
	public void setPrivilegiu(boolean privilegiu) {
		this.privilegiu = privilegiu;
	}
	
	public boolean realizarSaque(double quantiaSacar) {
		if(saldo >=quantiaSacar) {
			saldo-=quantiaSacar;
			return true;
		}else {
			if(privilegiu) {
				double limite = limiteEspecial + saldo;
				if(limite>= quantiaSacar) {
					saldo-= quantiaSacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	
	}
	
	public void depositar(double valorDepositado) {
		saldo+= valorDepositado;
		
	}
	public void consultarSaldo() {
		System.out.println("saldo da conta = " +saldo);
	}
	
	public boolean verificarChequeEspecial() {
		return saldo <0;
	}
	
	}
	
	
