package modelo;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private double edad;
    private boolean casado;
    private boolean especialista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casado=" + casado + ", especialista=" + especialista + '}';
    }

}