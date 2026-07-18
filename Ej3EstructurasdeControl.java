package ej.pkg1.estructuras.de.control;
import java.util.Scanner;

public class Ej3EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}
