
public class ChaineDeCaractere {
    public static String getLastN(String s, int n) {
        if (s == null || n > s.length()) {
            return s;
        }
        return s.substring(s.length() - n);
    }

    public static void main(String[] args) {

        // Définition et déclaration d'une chaîne valant "Hey ?"
        String chaine1 = "Hey";

        // Définition et déclaration d'une chaîne valant "What's wrong with you ?"
        String chaine2 = "What's wrong with you ";

        // Affichage de : "Hey ? What's wrong with you ?" dans la console
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);

        // Récupérer le 5eme caractère de la deuxième String : ici c'est chaine2
        char str = chaine2.charAt(4);
        System.out.println("le 5eme caractère de la deuxième String  est : " + str);

        /*
         * Récupérer la chaîne de caractères composée des 10 derniers caractères de la
         * deuxième String
         */
        int n = 10;
        System.out.println("les 10 derniers caractères de la deuxième String sont : " + getLastN(chaine2, n));

        // Changer les 10 derniers caractères de la deuxieme String en majuscule.

        System.out.println(
                "les 10 derniers caractères de la deuxième String en Majuscule  : "
                        + getLastN(chaine2, n).toUpperCase());

    }

}
