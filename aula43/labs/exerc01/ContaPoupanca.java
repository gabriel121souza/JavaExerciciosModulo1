package com.gabriel.cursojava.aula43.labs.exerc01;

import java.util.Calendar;
//heranca contaPoupanca herda da contaBancaria
public class ContaPoupanca extends ContaBancaria{
	//definindo os atributos;
	private int diaRendimento;

	//encapsule o atributoo com get e set
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	//gerando os metodos
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		//importando a classe Calendar para utilizar a data
		Calendar hoje = Calendar.getInstance();
		
		//se dia do rendimento for igual ao dia de hoje em mes
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
		//adicione ao saldo o dividendo (logica para fazer o calculo do dividendo;
			this.setSaldo(this.getSaldo()+ (this.getSaldo()+taxaRendimento));
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String s  = "contaPoupanca[ ";
		s+= "diaRendimento: "+ diaRendimento;
		s+= "; "+ super.toString();
		s+= "]";
		return s;
	}
	
	
	
}
