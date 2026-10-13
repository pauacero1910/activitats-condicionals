// Activitat 23 — Dies del mes (switch amb casos agrupats)

import java.util.Scanner;

public class DiesDelMes {
    public static void main(String[] args) {
        // TODO amb switch (pots agrupar casos, per exemple: case 1: case 3: ...):
        //   Mesos de 31 dies, de 30 dies, i febrer (28 dies)
        //   Controla els números fora de rang (default)

          Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el número del mes (1-12): ");
        int mes = teclat.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Aquest mes té 31 dies.");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Aquest mes té 30 dies.");
                break;

            case 2:
                System.out.println("Aquest mes té 28 dies.");
                break;

            default:
                System.out.println("Número de mes incorrecte.");
        }
    }
}
