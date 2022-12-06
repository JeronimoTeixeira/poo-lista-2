public abstract class Forma {

    private int numLados;

    public abstract double getArea();
    public abstract double getPerimetro();

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public Forma(int numLados) {
        this.numLados = numLados;
    }
}
