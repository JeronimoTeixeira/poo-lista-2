public class Triangulo extends Forma{
    public double base;
    public double altura;

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", perímetro=" + getPerimetro() +
                ", área=" + getArea() +
                '}';
    }

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura /2;
    }

    @Override
    public double getPerimetro() {
        double hipotenusa = Math.sqrt(base*base + altura*altura);
        return hipotenusa + base + altura;
    }
}
