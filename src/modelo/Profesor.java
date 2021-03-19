package modelo;

import java.io.Serializable;

public class Profesor{
    public String nombre;
    public String ID;
    public float estatura;

    public Profesor(String nombre, String ID, float estatura) {
        this.nombre = nombre;
        this.ID = ID;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", ID=" + ID + ", estatura=" + estatura + '}';
    }
    
    
}