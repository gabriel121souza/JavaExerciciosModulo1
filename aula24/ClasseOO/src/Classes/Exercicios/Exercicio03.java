package Classes.Exercicios;
public class Exercicio03 {
    public static void main(String [] args){
        LivroLivraria livroLivraria = new LivroLivraria();
        livroLivraria.nome = "The Joker";
        livroLivraria.autor = "Gabriel S Rodrigues";
        livroLivraria.qtdPaginas=200;
        livroLivraria.anoLancamento=2008;
        livroLivraria.preco=55.50;
        
        System.out.println(livroLivraria.nome);
        System.out.println(livroLivraria.autor);
        System.out.println(livroLivraria.anoLancamento);
        System.out.println(livroLivraria.qtdPaginas);
        System.out.println(livroLivraria.preco);
        
        
    }
}
