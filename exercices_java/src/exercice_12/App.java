package exercice_12;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme Java qui permet à l'utilisateur de deviner un nombre
        // choisi
        // aléatoirement par l'ordinateur.
        // Le programme doit donner des indications à l'utilisateur sur si le nombre à
        // deviner
        // est plus grand ou plus petit que la proposition de l'utilisateur.
        // Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné
        // le nombre.

        Random random = new Random();
        int numero_random = random.nextInt(50);
        Scanner scanner = new Scanner(System.in);
        int choix = -1;

        System.out.println(numero_random);

        System.out.println("Trouvez le nombre aléatoire entre 1 et 50. Entrez votre nombre :");
        choix = scanner.nextInt();

        while (choix != numero_random) {
            if (choix < numero_random) {
                System.out.println("Trop petit ! Recommencez. Nouvel essai :");
                choix = scanner.nextInt();
            }

            else if (choix > numero_random) {
                System.out.println("Trop grand ! Recommencez. Nouvel essai :");
                choix = scanner.nextInt();
            }

        }

        System.out.println("Félicitations ! Vous avez trouvé le nombre aléatoire.");

        scanner.close();
    }
}
