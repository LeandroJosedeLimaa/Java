public class Produto {
    String nome;
    double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public void aplicarDesconto(double percentual) {
        this.preco -= this.preco * percentual / 100;
    }


    public static void main(String[] args) {

        Produto produto = new Produto("Smartphone", 100.0);


        System.out.println("Preço original do produto " + produto.nome + ": R$ " + produto.preco);


        produto.aplicarDesconto(20);


        System.out.println("Preço do produto após o desconto: R$ " + produto.preco);
    }
}
