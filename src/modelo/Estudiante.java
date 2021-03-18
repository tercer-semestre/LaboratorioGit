/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MANUEL BERMUDEZ
 */
public class Estudiante extends Persona implements Serializable {

    private String carrera;
    private String semestre;
    private String materiaFav;
    private Double prom;

    public Estudiante(String carrera, String semestre, String materiaFav, double prom, double edad, String nombre, String codigo, String apodo, String email) {
        super(edad, nombre, codigo, apodo, email);
        this.carrera = carrera;
        this.semestre = semestre;
        this.materiaFav = materiaFav;
        this.prom = prom;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getMateriaFav() {
        return materiaFav;
    }

    public void setMateriaFav(String materiaFav) {
        this.materiaFav = materiaFav;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + ", semestre=" + semestre + ", materiaFav=" + materiaFav + ", prom=" + prom + '}';
    }

    public void agregarEstudiante(String carrera, String semestre, String favorita, Double promedio) {
        ArrayList<String> Personas = new ArrayList();
        Personas.add(carrera);
        Personas.add(semestre);
        Personas.add(favorita);
        Personas.add(promedio.toString());
        imprimirEstudiantes(Personas);

    }
    public void imprimirEstudiantes(ArrayList lista){
        System.out.println(lista);
    }
}