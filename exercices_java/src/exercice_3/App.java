package exercice_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme en Java qui permet d'échanger
        // le contenu de deux entiers A et B saisis par l'utilisateur.
        // et afficher ces entiers après l’échange.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Premier entier ?\n");
        int premier_entier = scanner.nextInt();

        System.out.println("Premier entier ?\n");
        int second_entier = scanner.nextInt();

        int reserve = premier_entier;
        premier_entier = second_entier;
        second_entier = reserve;

        System.out.println("Les valeurs désormais inversées sont : " + premier_entier + " et " + second_entier + ".");
        scanner.close();
    }
}
