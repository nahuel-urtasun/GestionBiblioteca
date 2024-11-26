package AbstractClassInterface.GestionBiblioteca;



public class Main {
    public static void main(String[] args) {
        Revista revista1 = new Revista(1, 5, "National Geographic", 3);
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan", 148, true, 5);

        // Probar cálculo de multas en Revista
        System.out.println("----- Revista -----");
        revista1.obtenerInformacion();
        System.out.println("Multa por 5 días de retraso: $" + revista1.calcularMultas(5));

        // Probar cálculo de multas en Película
        System.out.println("\n----- Película -----");
        pelicula1.obtenerInformacion();
        System.out.println("Multa por 7 días de retraso: $" + pelicula1.calcularMultas(7));
    }
}

