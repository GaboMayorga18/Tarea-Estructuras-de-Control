package ej.pkg1.estructuras.de.control;
import java.util.Scanner;
/** @author Gabriel Mayorga */
public class Ej4EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = teclado.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
