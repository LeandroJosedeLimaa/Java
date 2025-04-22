public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    public double calcularArea() {
        return largura * altura;
    }


    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }


    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(7.0, 8.0);


        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
