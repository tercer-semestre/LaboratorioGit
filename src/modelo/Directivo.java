/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author MANUEL BERMUDEZ
 */
public class Directivo extends Persona implements Serializable {
    private String cargo;
    private double sueldo;
    private boolean calvo;

    public Directivo(String cargo, double sueldo, boolean calvo, double edad, String nombre, String codigo, String apodo, String email) {
        super(edad, nombre, codigo, apodo, email);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.calvo = calvo;
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

    public boolean isCalvo() {
        return calvo;
    }

    public void setCalvo(boolean calvo) {
        this.calvo = calvo;
    }

    @Override
    public String toString() {
        return "Directivo{" + "cargo=" + cargo + ", sueldo=" + sueldo + ", calvo=" + calvo + '}';
    }

    
}
