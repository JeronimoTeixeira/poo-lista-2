public class Retangulo extends Forma implements Redimensionavel{
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) {
        super(4);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", perímetro=" + getPerimetro() +
                ", área=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return largura * 2 + altura * 2;
    }

    @Override
    public void redimensionar(double x) {
        largura = largura * x;
        altura = altura * x;
    }
}
