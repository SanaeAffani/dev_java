public class Variables {

    public static void main(String[] args) {
        // Pour chaque variable, afficher sa valeur avec System.out.println();
        // Définition et assignation d'un double (nombre à virgule)
        double varDouble = 22;
        System.out.println("Variable double = " + varDouble);
        // Post incrémentation de d
        varDouble++;
        System.out.println("Variable double post incrémentée ++ " + varDouble);

        // Création d'une variable contenant un booléen, initialisé à true.
        boolean varBoolean = true;
        System.out.println("Variable Boolean = " + varBoolean);

        // Affichage du contraire de sa valeur.
        System.out.println("Le contraire de la variable boolean est : " + !varBoolean);

        // Création en une ligne de trois variables de type int, avec la valeur 4
        int a, b, c = a = b = 4;

        // Affichage de la somme de ces trois variables
        int sommeVar = a + b + c;
        System.out.println("la somme des 3 variables a + b + c = " + sommeVar);

        // Création de trois variables (var1,var2,var3) valant 3, 4 et 5
        int var1 = 3;
        int var2 = 4;
        int var3 = 5;

        // Afficher le résultat (booléen) de la comparaison suivante : var1 < var2 et
        // var2 < var3
        Boolean result = var1 < var2;
        Boolean result2 = var2 < var3;

        System.out.println("Le résultat de var1 < var2 est :" + result);
        System.out.println("Le résultat de var2< var3 est  :" + result2);
        // Afficher le résultat (booléen) de la comparaison suivante : var1 différent de
        // var2 et var2 différent de var3
        Boolean result3 = var1 != var2;
        Boolean result4 = var2 != var3;
        System.out.println("Le résultat de la comparaison var1 différent de var2 est : " + result3);
        System.out.println("Le résultat de la comparaison var2 différent de var3 est : " + result4);
        // Un petit opérateur ternaire pour finir ? Si la première variable définie
        // dans ce fichier est inférieure ou égale à la dernière
        // (de type entier) , afficher "ok" sinon afficher "ko"
        boolean inferieurOuEgale = varDouble <= var3;
        String testVariable = inferieurOuEgale ? "ok" : "pas ok";
        System.out.println("résultat d'égalité : " + testVariable);

    }

}
