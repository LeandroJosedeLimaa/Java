public class Cachorro {
    String nome, raca;
    int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println("Au Au Au");
    }

    public static void main(String[] args) {
        Cachorro Meucachorro = new Cachorro("Rex", "Pug", 12);
        Meucachorro.latir ();
    }
}
