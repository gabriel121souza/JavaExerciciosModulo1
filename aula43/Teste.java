package com.gabriel.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setCurso("Ciencia da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "gabriel";
		String s2 = "Gabriel";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciencia da Computação");
		double [] nota2 = {10, 9, 8, 7};
		aluno.setNotas(nota2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
