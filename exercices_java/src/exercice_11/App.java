package exercice_11;

public class App {

    public static void main(String[] args) throws Exception {
        // Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        // Exemple: int[] tab = {1, 2, 9, 4};

        int[] tab = { 1, 2, 9, 4 };
        int resultat = Integer.MIN_VALUE;

        for (int i = 0; i < tab.length; ++i) {
            resultat = Math.max(resultat, tab[i]);
        }

        System.out.println(resultat);
    }
}
