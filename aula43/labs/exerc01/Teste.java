package com.gabriel.cursojava.aula43.labs.exerc01;

public class Teste {

	public static void main(String[] args) {
        System.out.println("*** Teste ContaBancaria ***");
        //inserindo o objeto conta simples
        ContaBancaria contaSimples = new ContaBancaria();
        //setando os valores na conta simples
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("11111");
        //utilizando os metodos de conta simples
        contaSimples.depositar(100);
        
        realizarSaque(contaSimples, 50);
        
        realizarSaque(contaSimples, 70);
        
        System.out.println(contaSimples);
        
        
        System.out.println("*** Teste ContaPoupança ***");
        //inserindo o objeto conta poupanca
        ContaPoupanca contaPoupacanca = new ContaPoupanca();
        //setando os valores na conta poupanca
        contaPoupacanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupacanca.setNumConta("22222");
        contaPoupacanca.setDiaRendimento(3);
        //utilizando os os metodos de poupanca
        contaPoupacanca.depositar(100);
        
        realizarSaque(contaPoupacanca, 50);
        
        realizarSaque(contaPoupacanca, 70);
        //
        if (contaPoupacanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        
        System.out.println(contaPoupacanca);
        
        System.out.println("*** Teste ContaEspecial ***");
        
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);
        
        contaEspecial.depositar(100);
        
        realizarSaque(contaEspecial, 50);
        
        realizarSaque(contaEspecial, 70);
        
        realizarSaque(contaEspecial, 80);
        
        System.out.println(contaEspecial);
    }
    
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}