package ej.pkg1.estructuras.de.control;
import java.util.Scanner;

public class Ej1EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int edad;
        String carrera;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Ingrese su carrera: ");
        carrera = teclado.nextLine();

        System.out.print("Ingrese su estatura: ");
        estatura = teclado.nextDouble();

        System.out.println("\n--- Datos Registrados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anos");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }
}