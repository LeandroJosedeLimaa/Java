public class Aluno {
    String nome;
    String matricula;


    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }


    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
    }


    public static void main(String[] args) {

        Aluno aluno = new Aluno("Leandro José", "13525122150");


        aluno.exibirInformacoes();
    }
}
