package exercice_13;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java pour afficher un visage.

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Voulez-vous voir le visage de Damien ? Tapez 'oui' ou 'non !'");
            String choix = scanner.nextLine();

            switch (choix) {
                case "oui":
                    System.out.println("+''''''+");
                    System.out.println("[| o o |]");
                    System.out.println("|   ^   |");
                    System.out.println("|  '-'  |");
                    System.out.println(" +-----+");
                    scanner.close();
                    return;
                case "non":
                    System.out.println("Vous ratez quelque chose...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Il fallait mieux lire la consigne, on recommence !");
            }

        }

    }
}
