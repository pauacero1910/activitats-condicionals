// Activitat 17 — Qualificació d'una nota

import java.util.Scanner;

public class QualificacioNota {
    public static void main(String[] args) {
        // TODO: llegeix una nota real entre 0 i 10 (si no ho està, avisa)
        //   9-10 Excel·lent, 7-8.9 Notable, 6-6.9 Bé, 5-5.9 Suficient, <5 Insuficient
        //   Important: escriu els decimals amb punt (5.6), no amb coma

        Scanner teclat = new Scanner (System.in);

        double nota = 0;
        System.out.println("Nota: ");
        nota = teclat.nextDouble();

        if (nota < 0 || nota > 10.0) {
            System.out.println("La nota ha de ser entre 0 i 10");
        }
        else if (nota >= 9.0) {
            System.out.println("Excel·lent");
        }
        else if (nota >= 7.0) {
            System.out.println("Notable");
        }
        else if (nota >= 6.0) {
            System.out.println("Bé");
        }
        else if (nota >= 5.0) {
            System.out.println("Suficient");
        }
        else if (nota < 5.0) {
            System.out.println("Insuficient");
        }
    }
}
