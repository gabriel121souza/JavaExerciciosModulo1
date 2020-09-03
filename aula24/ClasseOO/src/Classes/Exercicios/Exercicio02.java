package Classes.Exercicios;
public class Exercicio02 {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.nome = "As Cronicas do Rei Careca";
        livro.autor = "Gabriel de Souza Rodrigues";
        livro.isbn = "D662FA4";
        livro.qtdPaginas = 275;
        livro.anoLancamento = 2020;
        
        System.out.println("nome do livro: " + livro.nome);
        System.out.println("Autor: "+livro.autor);
        System.out.println("quantidade de paginas: " +livro.qtdPaginas);
        System.out.println("ano de Lancamento: " + livro.anoLancamento);
        System.out.println("isbn: "+ livro.isbn);
    }
}
