package Classes.Exercicios;

import java.util.Date;

public class Exercicio04 {
public static void main(String[] args){
    
           LivroBiblioteca livro = new LivroBiblioteca();
        livro.nome = "The Joker";
        livro.autor = "Gabriel S Rodrigues";
        livro.qtdPaginas=200;
        livro.anoLancamento=2008;
        livro.dataEntrega = new Date();
        livro.emprestado = true;
        livro.emprestadoA = "Daniel Raflas";
    
        System.out.println(livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.anoLancamento);
        System.out.println(livro.qtdPaginas);
        System.out.println(livro.dataEntrega);
        System.out.println(livro.emprestado);
        System.out.println(livro.emprestadoA);
        
}    
}
