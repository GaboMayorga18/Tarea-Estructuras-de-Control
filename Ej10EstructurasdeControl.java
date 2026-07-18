package ej.pkg1.estructuras.de.control;
import java.util.Scanner;

public class Ej10EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero entero " + i + ": ");
            numero = teclado.nextInt();
            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
