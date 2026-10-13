// Activitat 12 — El més gran de tres números

import java.util.Scanner;

public class MesGranDeTres {
    public static void main(String[] args) {
        // TODO: llegeix 3 números i mostra quin és el més gran

        Scanner teclat = new Scanner (System.in);
        double numero1;
        System.out.println("1r número: ");
        numero1 = teclat.nextDouble();
        double numero2;
        System.out.println("2n número: ");
        numero2 = teclat.nextDouble();
        double numero3;
        System.out.println("3r número: ");
        numero3 = teclat.nextDouble();

       
        double major = numero1;

        if (numero2>major) {
            major = numero2;
        }
        if (numero3>major) {
            major = numero3;
        }

        System.out.println("El número més gran és: " + major);

    }
}
