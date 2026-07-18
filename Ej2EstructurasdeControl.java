package ej.pkg1.estructuras.de.control;
import java.util.Scanner;

public class Ej2EstructurasdeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        int suma, resta, multiplicacion, residuo;
        double division; 

        System.out.print("Ingrese el primer numero entero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        
        division = (double) num1 / num2; 
        
        residuo = num1 % num2; 

        System.out.println("--- Resultados de las Operaciones ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Residuo: " + residuo);
    }
}