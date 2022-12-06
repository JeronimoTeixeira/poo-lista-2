import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(2, 3);
        Triangulo triangulo = new Triangulo(2, 3);
        List<Forma> formas = new ArrayList<>();

        formas.add(retangulo);
        formas.add(triangulo);

        for( Forma forma : formas){
            if(forma instanceof Redimensionavel){
                ((Redimensionavel) forma).redimensionar(0.5);
            }
            System.out.println(forma);
        }

//        System.out.println("perímetro retângulo: " + retangulo.getPerimetro());
//        System.out.println("área retângulo: " + retangulo.getArea());
//
//        System.out.println("Redimensionando");
//
//        retangulo.redimensionar(2);
//
//        System.out.println("perímetro retângulo: " + retangulo.getPerimetro());
//        System.out.println("área retângulo: " + retangulo.getArea());






    }
}