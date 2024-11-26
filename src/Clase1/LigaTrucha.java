package Clase1;

import java.util.Scanner;

public class LigaTrucha {
    //Atributos de mi clase main (para invocarlo desde cualquier lugar del programa)
    static Scanner scanner = new Scanner(System.in);
    //Crear equipos de fútbol
    public static Equipo[] equipos = new Equipo[10];
    static Equipo deportivoTapitas = new Equipo("Deportivo tapitas");
    static Equipo sacachispasFC = new Equipo("Sacachispas FC");
    static Equipo riestra = new Equipo("Riestra");

    public static void main(String[] args) {
        equipos[0] = deportivoTapitas;
        equipos[1] = sacachispasFC;
        equipos[2] = riestra;

        //Dejar que el usuario decida
        int option = 0;
        do {
            Menu();
            option = scanner.nextInt();
            switch (option) {
                case 1 -> crearJugador();
                case 2 -> crearEquipo();
                case 3 -> asignarJugadorAEquipo();
                case 4 -> mostrarJugadores();
                case 5 -> mostrarEquipos();
                case 6 -> System.out.println("Muchas gracias por confiar en nuestra liga");
            }

        } while (option != 6);
    }


    private static Jugador crearJugador() {
        //Refrescar el Scanner
        scanner.nextLine();
        Jugador jugador = new Jugador();
        System.out.println("¿Cómo se llama tu jugador?: ");
        jugador.setNombre(scanner.nextLine());
        return jugador;
    }

    private static Equipo crearEquipo() {
        //Refrescar el Scanner
        scanner.nextLine();
        Equipo equipo = new Equipo();
        System.out.println("¿Cómo se llama tu equipo?: ");
        equipo.setNombre(scanner.nextLine());
        return equipo;
    }

    private static void mostrarJugadores() {    //Este método sólo muestra los jugadores con un equipo asignado
        for(Equipo equipo : equipos){
            if(equipo != null){
                for(Jugador jugador : equipo.getJugadores()){
                    System.out.println(jugador.getNombre());
                }
            }
        }
    }

    private static void mostrarEquipos() {    //Este método sólo muestra los equipos registrados
        for(Equipo equipo : equipos){
            if(equipo != null){
                System.out.println(equipo.getNombre());
            }
        }
    }

    private static void asignarJugadorAEquipo() {
        //Refrescar el scanner
        scanner.nextLine();
        System.out.println("¿Qué jugador quieres enlistar?: ");
        Jugador jugador = new Jugador(scanner.nextLine());

        System.out.println("Mira los equipos que tenemos disponibles");
        mostrarEquipos();

        System.out.println("¿En qué equipo lo quieres enlistar?: ");
        Equipo equipoMuestra = new Equipo(scanner.nextLine());

        for(Equipo equipo : equipos){
            if(equipo != null){
                if(equipo.equals(equipoMuestra)){
                    for(int i = 0; i < equipo.getJugadores().length; i++){
                        if(equipo.getJugadores()[i] == jugador){
                            System.out.println("Este jugador ya está en el equipo");
                        } else if (equipo.getJugadores()[i] == null) {
                            equipo.getJugadores()[i] = jugador;
                        }
                    }
                }
            }
        }
    }

    private static void Menu() {
        System.out.println("\033\143");
        System.out.println("Bienvenido a nuestra liga, ¿qué quieres hacer?: ");
        System.out.println("1. Crear jugador");
        System.out.println("2. Crear equipo");
        System.out.println("3. Asignar jugador a equipo");
        System.out.println("4. Mostrar jugadores");
        System.out.println("5. Mostrar equipos");
        System.out.println("6. Salir");
    }
}