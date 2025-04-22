public class Pessoa {
    String nome;
    int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void fazerAniversario() {
        this.idade++;
    }


    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Leandro", 25);


        System.out.println("Idade inicial de " + pessoa.nome + ": " + pessoa.idade);


        pessoa.fazerAniversario();


        System.out.println("Nova idade de " + pessoa.nome + " após o aniversário: " + pessoa.idade);
    }
}
