package com.gabriel.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("entre com um numero decimal: ");
		try {
			double num = leNumero();
			System.out.println("voce entrou com "+ num);
		} catch (Exception e) {
			System.out.println("entrada invalida: ");
			e.printStackTrace();
		}
	}
	public static double leNumero()throws Exception{
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}
}
