package modelo;

import java.io.Serializable;

public class Directivo extends Persona implements Serializable {
    private String cargo;
    private double sueldo;

    public Directivo(String cargo, double sueldo, double edad, String nombre, String codigo, String apodo, String email) {
        super(edad, nombre, codigo, apodo, email);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Directivo{" + "cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
}