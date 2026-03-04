import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        // Operadores aritméticos
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : 0;

        // Operadores relacionales
        boolean esMayor = num1 > num2;

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir entre 0");
        }

        System.out.println("¿El primer número es mayor?: " + esMayor);

        scanner.close();
    }
}