package com.gabriel.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {
	@Override 
	public String getMessage() {
		return "Agenda ja esta cheia";
	}
}
