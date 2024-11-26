package AbstractClassInterface.GeometriaAbstracta;

public abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();


    public interface Dibujable{
        void dibujar();
        }

}
