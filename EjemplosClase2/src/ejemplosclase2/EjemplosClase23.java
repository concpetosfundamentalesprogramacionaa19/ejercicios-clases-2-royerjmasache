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
public class EjemplosClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String ciudad;
        int edad;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //Limpieza del buffer de entrada de datos
        System.out.println("Ingrese su ciudad");
        ciudad = entrada.nextLine();
        /**
        System.out.println("Su nombre es: "+nombre +"\n\n\t" 
                +"Su apellido es: " +apellido +", " +"edad: " +edad +"\n"
        +"Ciudad: " +ciudad);
        */
        System.out.printf("Su nombre es %s\n\n\tSu apellido es %s, edad: %s\n"
                + "Ciudad: %s"
                , nombre, apellido, edad, ciudad);
        
    }
}
