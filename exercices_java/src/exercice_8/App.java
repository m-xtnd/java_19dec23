package exercice_8;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Écrire un programme en Java qui permet de saisir 10 entiers dans un tableau.
        // - compter combien y a-t-il d'éléments pairs et impairs.
        // - mettre les éléments pairs dans un tableau T1 et les éléments impairs dans
        // un tableau T2.
        // - Puis afficher T1 et T2.

        Scanner scanner = new Scanner(System.in);
        int numero_pair = 0;
        int numero_impair = 0;
        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez un nombre :");
            tab[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                numero_pair++;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                numero_impair++;
            }
        }

        System.out.println("Le total de nombres pairs est (" + numero_pair + ") et de nombres impairs est : ("
                + numero_impair + ").");

        int[] T1 = new int[numero_pair];
        int[] T2 = new int[numero_impair];

        int iT1 = 0;
        int iT2 = 0;

        for (int x = 0; x < 10; x++) {
            if (tab[x] % 2 == 0)
                T1[iT1++] = tab[x];
            else
                T2[iT2++] = tab[x];
        }
        ;

        System.out.println("Les nombres pairs sont : " + Arrays.toString(T1));
        System.out.println("Les nombres pairs sont : " + Arrays.toString(T2));

    }
}
