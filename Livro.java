package livraria;

public class Livro {
    String titulo;
    int numeroPaginas;
    String genero;
    int anoPublicacao;
    double preco;
    String autor;


    public Livro(double preco, String titulo){
        this.preco = preco;
        this.titulo = titulo;
    }

    public Livro(){
        Livro obj1 = new Livro(44.9, "Harry Potter");
        
    }
    void cadastrar(){
        System.out.println("Cadastrando no banco de dados");
    }

    double calcFrete(String cep){
        double valorFrete = 0;
        System.out.println("Calculando frete para o CEP " + cep);
        return valorFrete;
    }
    
}