// Activitat 02 — Parell o senar

import java.util.Scanner;

public class ParellSenar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és parell o senar
        //   Recorda: numero % 2 == 0 -> parell

        Scanner teclat = new Scanner (System.in);
        int numero = 0;
        System.out.println("Número: ");
        numero = teclat.nextInt();

        if(numero % 2 ==0) {
            System.out.println("Parell");
        }
        else
        {
            System.out.println("Senar");
        }  
    }
}
