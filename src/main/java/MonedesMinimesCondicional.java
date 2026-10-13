// Activitat 27 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix una quantitat de cèntims: ");
        int centims = teclat.nextInt();

        if (centims < 0) {
            System.out.println("Error: la quantitat ha de ser igual o superior a 0.");
        } else {

            int monedes;

            monedes = centims / 200;
            centims = centims % 200;
            if (monedes > 0) {
                System.out.println("Monedes de 2 euros: " + monedes);
            }

            monedes = centims / 100;
            centims = centims % 100;
            if (monedes > 0) {
                System.out.println("Monedes de 1 euro: " + monedes);
            }
        
            monedes = centims / 50;
            centims = centims % 50;
            if (monedes > 0) {
                System.out.println("Monedes de 50 cèntims: " + monedes);
            }
            
            monedes = centims / 20;
            centims = centims % 20;
            if (monedes > 0) {
                System.out.println("Monedes de 20 cèntims: " + monedes);
            }
         
            monedes = centims / 10;
            centims = centims % 10;
            if (monedes > 0) {
                System.out.println("Monedes de 10 cèntims: " + monedes);
            }

            monedes = centims / 5;
            centims = centims % 5;
            if (monedes > 0) {
                System.out.println("Monedes de 5 cèntims: " + monedes);
            }
           
            monedes = centims / 2;
            centims = centims % 2;
            if (monedes > 0) {
                System.out.println("Monedes de 2 cèntims: " + monedes);
            }

            monedes = centims / 1;
            if (monedes > 0) {
                System.out.println("Monedes de 1 cèntim: " + monedes);
            }




    }
}
}
