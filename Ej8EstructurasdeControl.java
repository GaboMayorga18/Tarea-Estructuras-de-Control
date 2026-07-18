package ej.pkg1.estructuras.de.control;
import java.util.Scanner;
/** @author Gabriel Mayorga */
public class Ej8EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String clave;

        System.out.print("Ingrese la contrasena: ");
        clave = teclado.nextLine();

        while (!clave.equals("java2026")) {
            System.out.print("Contrasena incorrecta. Intente de nuevo: ");
            clave = teclado.nextLine();
        }

        System.out.println("Acceso concedido.");
    }
}
