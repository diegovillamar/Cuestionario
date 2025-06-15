//Numero negativo**/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Introduce un número (negativo para salir): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            cantidad++;

            if (numero % 2 == 0) {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            } else {
                sumaImpares += numero;
                cantidadImpares++;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de números introducidos: " + cantidad);

        if (cantidadImpares > 0) {
            double mediaImpares = (double) sumaImpares / cantidadImpares;
            System.out.println("Media de los impares: " + mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }

        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("Mayor número par: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }

        scanner.close();
    }
}
