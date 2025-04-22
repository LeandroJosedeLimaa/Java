public class Livro {
    String titulo;
    String autor;
    int NumerosPaginas;

    public Livro(String titulo, String autor, int NumeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.NumerosPaginas = NumeroPaginas;
    }
    public void ExibirInformacoes() {
        System.out.println(titulo  + autor + NumerosPaginas);
    }
    public static void main(String[] args) {

        Livro Java = new Livro("Java", "Leandro", 51);
        Java.ExibirInformacoes();
    }
}

