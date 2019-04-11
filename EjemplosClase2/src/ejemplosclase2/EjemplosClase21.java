/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author royer
 */
public class EjemplosClase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        
        System.out.println("Ingrese sus nombres");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos");
        apellido = entrada.nextLine();
        System.out.println("Su nombre es: "+nombre +"\n\n\t" 
                +"Sus apellidos son: " +apellido);
    }
}
