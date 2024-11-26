package Clase2;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void maullar(){
        System.out.println(nombre + " dice Miau!");
    }


    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo atun.");
    }
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo arriba del teclado.");

    }



}
