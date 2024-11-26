package Clase1;

public class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador() {
        System.out.println("Haz creado una instancia de jugador");
    }
    public Jugador(String nombre) {
        this();
        this.nombre = nombre;
    }
    public Jugador(String nombre, Equipo equipo) {
        this(nombre);
        this.equipo = equipo;
    }

    public String getNombre() {
        return this.nombre;
    }
    public Equipo getEquipo() {
        return this.equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{nombre:" + this.nombre + ". Equipo: " + equipo.getNombre() + '}';
    }
    @Override
    public boolean equals(Object obj) {
        Jugador jugador = (Jugador) obj;
        return this == obj || this.nombre.equals(jugador.getNombre());
    }
}