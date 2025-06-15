//Numeros Pares**//

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los límites del rango
        System.out.print("Ingresa el número inicial del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final del rango: ");
        int fin = scanner.nextInt();

        // Validar que los números sean positivos y que el inicio no sea mayor al fin
        if (inicio < 0 || fin < 0) {
            System.out.println("Los números deben ser positivos.");
        } else if (inicio > fin) {
            System.out.println("El número inicial debe ser menor o igual que el final.");
        } else {
            System.out.println("Números pares en el rango de " + inicio + " a " + fin + ":");
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
