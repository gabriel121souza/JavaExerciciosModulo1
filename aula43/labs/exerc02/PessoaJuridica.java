package com.gabriel.cursojava.aula43.labs.exerc02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calculaImposto() {
		return this.getRendaBruta()*0.1;
	}

	@Override
	public String toString() {
		String s = "Pessoa Juridica";
		s+=super.toString();
		s+= "\n Cnpj: "+ cnpj;
		s+= "\n imposto a ser pago: "+ calculaImposto();
		return s;
	}
	
	

}
