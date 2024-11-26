package AbstractClassInterface.GestionBiblioteca;


public class Revista extends ItemBiblioteca implements Catalogable {
    private int nroEdicion;
    private int cantidadEjemplares;
    private String nombreRevista;
    private int diasRetrasoPermitidos;

    public Revista(int nroEdicion, int cantidadEjemplares, String nombreRevista, int diasRetrasoPermitidos) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
        this.diasRetrasoPermitidos = diasRetrasoPermitidos;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getDiasRetrasoPermitidos() {
        return diasRetrasoPermitidos;
    }

    public void setDiasRetrasoPermitidos(int diasRetrasoPermitidos) {
        this.diasRetrasoPermitidos = diasRetrasoPermitidos;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Revista prestada: " + nombreRevista);
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Revista devuelta: " + nombreRevista);
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        if (diasRetraso > diasRetrasoPermitidos) {
            int diasMulta = diasRetraso - diasRetrasoPermitidos;
            return diasMulta * 0.5; // $0.5 por cada día adicional
        }
        return 0; // Sin multa si está dentro del periodo permitido
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Nombre de la revista: " + nombreRevista);
        System.out.println("Número de edición: " + nroEdicion);
        System.out.println("Cantidad de ejemplares: " + cantidadEjemplares);
        System.out.println("Días de retraso permitidos: " + diasRetrasoPermitidos);
    }
}