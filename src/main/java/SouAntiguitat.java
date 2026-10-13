// Activitat 15 — Sou i antiguitat

import java.util.Scanner;

public class SouAntiguitat {
    public static void main(String[] args) {
        // TODO: llegeix el sou i els anys d'antiguitat
        //   a) sou < 500 i antiguitat >= 10 -> augment del 20%
        //   b) sou < 500 i antiguitat < 10  -> augment del 5%
        //   c) sou >= 500                   -> sense canvis
        //   Mostra el sou a pagar

        Scanner teclat = new Scanner (System.in);

        double sou;
        System.out.println("Sou: ");
        sou = teclat.nextDouble();

        int antiguitat;
        System.out.println("Anys d'antiguitat: ");
        antiguitat = teclat.nextInt();

        if (sou < 500) {
            if (antiguitat >= 10) {
                System.out.println("Augment del 20%");
                System.out.println("Sou a pagar: " + (sou + sou*0.2));
            }
            else {
                System.out.println("Augment del 5%");
                System.out.println("Sou a pagar: " + (sou + sou*0.05));
            }
        }
        else {
             System.out.println("Sense canvis");
             System.out.println("Sou a pagar: " + sou);
       }
    }
}
