package Clase1;

public class Equipo {
    private String nombre;
    private Jugador[] jugadores;

    public Equipo() {
        System.out.println("Haz creado un equipo de fútbol");
        this.jugadores = new Jugador[5];
    }
    public Equipo(String nombres) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        String[] jugadores = new String[this.jugadores.length];
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i] = this.jugadores[i].getNombre();
        }

        return "Equipo{nombre:" + this.nombre + ". Jugadores: {" + jugadores + "]}";
    }
    @Override
    public boolean equals(Object obj) {
        Equipo equipo = (Equipo) obj;
        return this == obj || this.nombre.equals(equipo.getNombre());
    }
}