package livraria;

public class Livraria {

    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Harry Potter e a Pedra Filosofal";
        l1.anoPublicacao = 1997;
        l1.numeroPaginas = 304;
        System.out.println("Titulo: " + l1.titulo);
        System.out.println("Numero de pag.: " + l1.numeroPaginas);
        System.out.println("Ano pub.: " + l1.anoPublicacao);

        l1.cadastrar();

        Livro obj1 = new Livro(44.9, "Harry Potter");
        System.out.println("Preço: " + obj1.preco);
    }
    
}