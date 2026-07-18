package ej.pkg1.estructuras.de.control;
import java.util.Scanner;
/** @author Gabriel Mayorga */
public class Ej7EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int sumaTotal = 0;

        System.out.print("Ingrese un numero positivo (o negativo para terminar): ");
        numero = teclado.nextInt();

        while (numero >= 0) {
            cantidad = cantidad + 1;
            sumaTotal = sumaTotal + numero;

            System.out.print("Ingrese otro numero positivo (o negativo para terminar): ");
            numero = teclado.nextInt();
        }

        System.out.println("\n--- Resultados Finales ---");
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + sumaTotal);
    }
}
