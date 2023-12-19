package exercice_10;

public class App {

    public static void main(String[] args) throws Exception {
        // Écrivez un programme Java qui inverse une chaîne de caractères.

        StringBuilder str = new StringBuilder("Hello Damien !");
        System.out.println(str.toString());
        str.reverse();
        System.out.println(str.toString());
    }

}
