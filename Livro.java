package livraria;

public class Livro {
    String titulo;
    int numeroPaginas;
    String genero;
    int anoPublicacao;
    double preco;
    String autor;

    void cadastrar(){
        System.out.println("Cadastrando no banco de dados");
    }

    double calcFrete(String cep){
        double valorFrete = 0;
        System.out.println("Calculando frete para o CEP " + cep);
        return valorFrete;
    }
    
}