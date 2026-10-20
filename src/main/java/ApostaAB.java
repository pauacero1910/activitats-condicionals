// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1

import java.util.Random;
import java.util.Scanner;

public class ApostaAB {
    public static void main(String[] args) {
        // TODO: genera dos números aleatoris A i B (no els mostris encara)
        //   Pregunta per qui aposta l'usuari (A o B); guanya el número més alt
        //   Mostra els dos valors i si ha guanyat o perdut l'aposta
        
        Random generador = new Random();

        int A = generador.nextInt(10) + 1; 
        int B = generador.nextInt(10) + 1;

        Scanner teclat = new Scanner (System.in);

        System.out.println("Aposta al número A o B: ");
        char resposta1 = teclat.next().charAt(0);

        System.out.println("El número A és: " + A);
        System.out.println("El número B és: " + B);

        if (A>B) {
            if (resposta1 == 'A') {
            System.out.println("Has guanyat !!!");
            }
            else {
                System.out.println("Has perdut !!!");
            }
        } 
        else if (B>A) {
            if (resposta1 == 'B') {
            System.out.println("Has guanyat !!!");
            }
            else {
                System.out.println("Has perdut !!!");
            }
        }
        else {
    System.out.println("Empat! No has guanyat l'aposta.");
    }
}
}
