package ej.pkg1.estructuras.de.control;
import java.util.Scanner;
/** @author Gabriel Mayorga */
public class Ej11EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;
        double mayor;
        double menor;

        System.out.print("Ingrese el numero 1: ");
        numero = teclado.nextDouble();
        
        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = teclado.nextDouble();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
