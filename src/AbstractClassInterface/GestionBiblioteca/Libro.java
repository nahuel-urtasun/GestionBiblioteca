package AbstractClassInterface.GestionBiblioteca;



public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void prestar() {
        System.out.println("Libro prestado: " + titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Libro devuelto: " + titulo);
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        return diasRetraso * 0.75; // Por ejemplo, $0.75 por día de retraso
    }

    @Override
    public void obtenerInformacion() {
        mostrarInformacion();
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}
