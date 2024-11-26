package Clase2;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, Integer edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar() {

        System.out.println(nombre + " está ladrando.");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo un hueso.");
    }
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo en su cuchita.");
    }

}