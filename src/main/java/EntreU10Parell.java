// Activitat 14 — Entre 1 i 10 i parell (if-else aniuada)

import java.util.Scanner;

public class EntreU10Parell {
    public static void main(String[] args) {
        // TODO amb if-else aniuada: llegeix un número enter
        //   Digues si està entre 1 i 10 I, a més, si és parell

        Scanner teclat = new Scanner (System.in);
        int num;
        System.out.println("Número enter: ");
        num = teclat.nextInt();

        if (num >= 1 && num <= 10) {
            if (num% 2 ==0) {
                System.out.println("El númerno està entre 1 i 10 i és parell");
            }
            else {
                System.out.println("El númerno està entre 1 i 10 i és imparell");
            }
        }
        else {
            if (num% 2 ==0) {
                System.out.println("El númerno no està entre 1 i 10 i és parell");
            }
            else {
                System.out.println("El númerno no està entre 1 i 10 i és imparell");
            }
        }

    }
}
