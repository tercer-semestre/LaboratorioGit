package modelo;

import java.io.Serializable;

public class Profesor extends Persona implements  Serializable{
    private String materia;
    private String salon;

    public Profesor(String materia, String salon, byte edad, String nombre, String codigo, String apodo, String email) {
        super(edad, nombre, codigo, apodo, email);
        this.materia = materia;
        this.salon = salon;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Profesor{" + "materia=" + materia + ", salon=" + salon + '}';
    }
}