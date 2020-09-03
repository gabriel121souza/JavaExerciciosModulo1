/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.Exercicios;

/**
 *
 * @author PC
 */
public class Exercicio06 {
    public static void main(String [] args){
        Contato contato = new Contato();
        contato.nome = "Aline Nogueira";
        contato.email = "alinenog@gmail.com";
        contato.endereco = "etapa b valparaiso 1";
        contato.telefones = new String[2];
        contato.telefones[0] = "93581926";
        contato.telefones[1] = "99673189";
        
        System.out.println(contato.nome);
        System.out.println(contato.email);
        System.out.println(contato.endereco);
        System.out.println(contato.telefones[0]);
        System.out.println(contato.telefones[1]);
    }
}
