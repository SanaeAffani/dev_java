package simulateur;

import simulateur.bateau.Bateau;
import simulateur.bateau.piece.Coque;
import simulateur.bateau.piece.Moteur;

public class Simulation {
    public static void main(String[] args) {

        // ici je crée une instance de mon bateau avec mon constructeur qui prend un nom
        // en parametre
        Bateau monBateau1 = new Bateau("OCEANS EVASION");

        // ici appel de la méthode prendLaMer, navigue et arriveAuPort
        monBateau1.prendLaMer();
        monBateau1.navigue(250);
        monBateau1.navigue(100);
        monBateau1.arriveAuPort();

        // ici je crée une instance de Coque
        Coque coqueBateau1 = new Coque(6);

        // Assignation de coqueBateau1 à monBateau
        monBateau1.setMaCoque(coqueBateau1);

        // Affichage des points de vie de la coque de monBateau1
        // System.out.println("La coque de monBateau1 a :
        // "monBateau1.getMaCoque().getPointsdeVie() + " points de vie Max");
        System.out.println("La coque de monBateau1 a : " + coqueBateau1.getPointsdeVie() + " points de vie ");

        // une autre façon pour appeler getPointDeVie
        /*
         * int pointDeVieBateau = monBateau1.getMaCoque().getPointsdeVie();
         * System.out.println("La coque de monBateau1 a :" + pointDeVieBateau +
         * " points de vie ");
         */

        // ...

        Bateau monBateau2 = new Bateau("MON OCEANS");
        System.out.println("Le bateau << " + monBateau2.getNom() + " >>");
        System.out.println(Bateau.getNombreDeBateauxConstruits() + " est le nombre de bateaux construits ");

        // Rattachement d'un moteaur au bateau 2
        // monBateau2.setMonMoteur(new Moteur(200, 20));
        monBateau2.setMonMoteur(new Moteur(120, 10));
        System.out.println("La puissance du moteur du bateau 2 est de :" + monBateau2.getMonMoteur().getPuissance());

    }

}
