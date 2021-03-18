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


/**
 *
 * @author MANUEL BERMUDEZ
 */
public class LaboratorioGit {
    List<Persona> Personas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner  entrada = new Scanner(System.in); //crea el scanner para ingresar datos por teclado
        String elecc;
        System.out.println("Desea ingresar mas Personas?");
        elecc=entrada.nextLine();
        
        
        
    }
    
    
    public void eleccion(String elecc){
       while("si".equals(elecc)){
            Scanner  entrada = new Scanner(System.in);
            String elecc2;
            System.out.print("Ingrese su rol");
            elecc2=entrada.nextLine();
            
            
            /* HACER QUE PERSONA SE COMPORTE COMO "PERSONA" EN VEZ DE STRING
            Personas.add((Persona)elecc2);
        
*/
    }
    }
    
}
