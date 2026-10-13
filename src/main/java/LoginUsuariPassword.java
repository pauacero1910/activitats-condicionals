// Activitat 20 — Login amb usuari i contrasenya

import java.util.Scanner;

public class LoginUsuariPassword {
    public static void main(String[] args) {


        // Informació secreta
        final String username = "cponts";
        final String password = "qw34T1234";

        // TODO: demana username i password per teclat
        //   Digues si són correctes o no

        Scanner teclat = new Scanner (System.in);

        System.out.println("username: ");
        String usuari = teclat.nextLine();

        System.out.println("password: ");
        String contrasenya = teclat.nextLine();

        if (usuari.equals(username) && contrasenya.equals(password)) {
            System.out.println("És correcte !!!");
        }
        else {
            System.out.println("És incorrecte !!!");
        }
        
    }



















    }

