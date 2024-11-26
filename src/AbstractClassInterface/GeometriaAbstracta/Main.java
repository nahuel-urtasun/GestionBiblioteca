package AbstractClassInterface.GeometriaAbstracta;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo= new Rectangulo(6,3);
        Triangulo triangulo= new Triangulo(3,4,5);

        System.out.printf("area: %.2f%n", circulo.calcularArea());




        System.out.println("perimetro: " + circulo.calcularPerimetro());
        circulo.dibujar();

        System.out.println("area: " + rectangulo.calcularArea());
        System.out.println("perimetro: " + rectangulo.calcularPerimetro());
        rectangulo.dibujar();

        System.out.println("area: " + triangulo.calcularArea());
        System.out.println("perimetro: " + triangulo.calcularPerimetro());
        triangulo.dibujar();





    }
}
