package ej.pkg1.estructuras.de.control;
import java.util.Scanner;

public class Ej9EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
