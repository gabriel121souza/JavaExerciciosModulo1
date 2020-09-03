package com.gabriel.cursojava.aula33.labs;

public class TesteExerc02 {

	public static void main(String[] args) {
		Conta acc = new Conta();
		acc.setUsuario("Gabriel");
		acc.setConta("975845-8");
		acc.setAgencia("25478");
		acc.setPrivilegiu(true);
		acc.setLimiteEspecial(500);
		acc.setSaldo(-10);
		
		System.out.println("Sejam Bem vindo "+ acc.getUsuario());
		System.out.println("sua conta e: "+ acc.getConta() + " e sua agencia "+ acc.getAgencia());
		System.out.println("seu saldo na conta e : "+ acc.getSaldo());
	
		boolean saqueEfetuado = acc.realizarSaque(10);
		if(saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			acc.consultarSaldo();
		}else {
			System.out.println("saldo insuficiente");
		}
		saqueEfetuado = acc.realizarSaque(500);
		System.out.println("tentativa de saque ");
		if(saqueEfetuado) {
			System.out.println("saque efetuado com sucesso");
			acc.consultarSaldo();
		}else {
			System.out.println("nao foi possivel realizar saque");
		}
		System.out.println("deposito de 500 reais");
		acc.depositar(500);
		acc.consultarSaldo();
		
		if(acc.verificarChequeEspecial()) {
			System.out.println("voce esta usando o cheque especial");
		}else {
			System.out.println("voce nao esta usando o cheque especial");
		}
		acc.realizarSaque(600);
		acc.consultarSaldo();
		
		if(acc.verificarChequeEspecial()) {
			System.out.println("esta usando cheque especial");
			
		}else {
			System.out.println("nao esta usando cheque especial");
		}
	}

	
}
