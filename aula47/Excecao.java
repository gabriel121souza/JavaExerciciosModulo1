package com.gabriel.cursojava.aula47;

public class Excecao {
		public static void main(String[] args) {
			
			try {
					int [] vetor = new int[4];
					
					System.out.println("Antes da exception");
					
					vetor[4] = 1;
					
					System.out.println("esse Texto nao sera impressao");
				
			}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("excesao acessar um indice do vetor que nao existe");
			}
			
			System.out.println("esse texto sera impresso apos a exception");
		}
}
