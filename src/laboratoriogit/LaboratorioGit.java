/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriogit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Persona;


public class LaboratorioGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelo.Estudiante ingresoEstudiantes = new modelo.Estudiante(null, null, null, 0.0, 0.0, null, null, null, null);
        // TODO code application logic here
        List<Persona> Personas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in); //crea el scanner para ingresar datos por teclado
        String elecc;
        System.out.println("¿Desea ingresar mas Personas? ");
        elecc = entrada.nextLine();

        while (!"no".equals(elecc)) {

            String elecc2;
            System.out.print("Ingrese su rol: ");
            elecc2 = entrada.nextLine();

            if ("estudiante".equals(elecc2)) {
                System.out.println("Ingrese la carrera: ");
                String carrera = entrada.nextLine();
                System.out.println("Ingrese el semestre: ");
                String semestre = entrada.nextLine();
                System.out.println("Ingrese la materia favorita: ");
                String favorita = entrada.nextLine();
                System.out.println("Ingrese el promedio: ");
                Double promedio = Double.parseDouble(entrada.nextLine());
                
                ingresoEstudiantes.agregarEstudiante(carrera, semestre , favorita, promedio);
                
            }

            System.out.println("Desea continuar? ");
            elecc = entrada.nextLine();

        }
        ingresoEstudiantes.imprimirEstudiantes();
    }
}