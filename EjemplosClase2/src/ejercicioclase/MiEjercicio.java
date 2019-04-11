/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author royer
 */
public class MiEjercicio {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre = "";
    String apellido = "";
    int edad = 0;
    String ciudad = "";
    String pais = "";
    int nota1 = 0;
    float nota2 = 0;
    float promedio = 0;
    System.out.println("Ingrese su nombre");
    nombre = entrada.nextLine();
    System.out.println("Ingrese su apellido");
    apellido = entrada.nextLine();
    System.out.println("Ingrese su edad");
    edad = entrada.nextInt();
    entrada.nextLine();
    System.out.println("Ingrese la ciudad");
    ciudad = entrada.nextLine();
    System.out.println("Ingrese el país");
    pais = entrada.nextLine();
    System.out.println("Ingrese la primera nota");
    nota1 = entrada.nextInt();
    System.out.println("Ingrese la segunda nota");
    nota2 = entrada.nextInt();
    promedio = (nota1 + nota2)/2;
    System.out.printf("Nombre: %s\nSu apellido es: %s\nCiudad: %s\n"
            + "País: %s\nNota: %s, %s\nPromedio: %s", nombre, apellido, ciudad, pais, nota1, nota2, promedio);
    
    }
}
