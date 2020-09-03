package com.gabriel.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato cont = new Contato();
		
		cont.setNome("Gabriel");

		//Criar objeto telefone
		
		Telefone fone = new Telefone();
		fone.setTipo("Celular");
		fone.setDdd("61");
		fone.setNumero("6935829696");
		
		Telefone fone2 = new Telefone();
		fone2.setTipo("Telefone");
		fone2.setDdd("61");
		fone2.setNumero("993581926");
		
		//criar objeto Endereco
		Endereco end = new Endereco();
		end.setNomeRua("Games of thrones");
		end.setComplemento("1 etapa");
		end.setCidade("Valparaiso");
		end.setEstado("Goias");
		end.setCep("72871084");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = fone;
		telefones[1] = fone2;
		
		// instanciar objetos
		cont.setEndereco(end);
		cont.setTelefones(telefones);
		
	
		
		
		//exibir objetos
		
		if(cont != null && cont.getEndereco() != null) {
			System.out.println(cont.getNome());
			System.out.println(cont.getEndereco().getCidade());
			

		}else {
			System.out.println("o endereco nao foi instanciado");
		}
		
		
		/* if( cont != null && cont.getTelefone() != null) {
			
		System.out.println(cont.getTelefone().getDdd()+ " " + cont.getTelefone().getNumero());
		}else {
			System.out.println("o telefone nao foi instanciado");
		}*/
		
		if(cont != null && cont.getTelefones() != null) {
			for(Telefone t : cont.getTelefones()) {
					System.out.println(t.getTipo()+" "+ t.getDdd()+ " "+ t.getNumero());
			}
		}

	}

}
