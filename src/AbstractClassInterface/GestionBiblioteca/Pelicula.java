package AbstractClassInterface.GestionBiblioteca;



public class Pelicula extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String director;
    private int duracion; // En minutos
    private boolean disponible; // Indica si la película está disponible
    private int diasRetrasoPermitidos;

    public Pelicula(String titulo, String director, int duracion, boolean disponible, int diasRetrasoPermitidos) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.disponible = disponible;
        this.diasRetrasoPermitidos = diasRetrasoPermitidos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDiasRetrasoPermitidos() {
        return diasRetrasoPermitidos;
    }

    public void setDiasRetrasoPermitidos(int diasRetrasoPermitidos) {
        this.diasRetrasoPermitidos = diasRetrasoPermitidos;
    }

    @Override
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Película prestada: " + titulo);
        } else {
            System.out.println("La película no está disponible.");
        }
    }

    @Override
    public void devolver() {
        disponible = true;
        System.out.println("Película devuelta: " + titulo);
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        if (diasRetraso > diasRetrasoPermitidos) {
            int diasMulta = diasRetraso - diasRetrasoPermitidos;
            return diasMulta * 1.0; // $1.0 por cada día adicional
        }
        return 0; // Sin multa si está dentro del periodo permitido
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("Días de retraso permitidos: " + diasRetrasoPermitidos);
    }
}
