// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era

        Random generador = new Random();

        int numero = generador.nextInt(1,11); // 1 i 10

        Scanner teclat = new Scanner (System.in);
        int endevina;
        System.out.println("Endivina un número aleatori entre 1 i 10");
        System.out.println("Escriu el número:");
        endevina = teclat.nextInt();

        if (numero == endevina) {
            System.out.println("Has acertat !!!");
        }
        else {
            System.out.println("No has acertat !!!");
            System.out.println("El número era: " + numero);
        }

    }
}
