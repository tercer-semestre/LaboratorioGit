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
public class Persona extends Object implements Serializable{
    private double edad;
    private String nombre;
    private String codigo;
    private String apodo;
    private String email;

    public Persona(double edad, String nombre, String codigo, String apodo, String email) {
        this.edad = edad;
        this.nombre = nombre;
        this.codigo = codigo;
        this.apodo = apodo;
        this.email = email;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", codigo=" + codigo + ", apodo=" + apodo + ", email=" + email + '}';
    }
    
    
    
}
