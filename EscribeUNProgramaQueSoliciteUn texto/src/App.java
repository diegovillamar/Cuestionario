//programa que solicite un texto**//

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        int contadorVocales = 0;

        // Contar vocales
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        // Mostrar resultado
        System.out.println("La cantidad de vocales en la cadena es: " + contadorVocales);

        scanner.close();
    }
}
