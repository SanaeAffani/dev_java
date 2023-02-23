package simulateur.bateau;

import simulateur.bateau.piece.Coque;
import simulateur.bateau.piece.Moteur;

public class Bateau {

    // déclataion des variables
    private final String nom;
    private double milesParcourus;
    private Coque maCoque;
    private Moteur monMoteur;
    private static int nombreDeBateauxConstruits;

    public Moteur getMonMoteur() {
        return monMoteur;
    }

    public void setMonMoteur(Moteur monMoteur) {
        this.monMoteur = monMoteur;
    }

    public String getNom() {
        return nom;
    }

    // Encapsuler coque
    public Coque getMaCoque() {
        return maCoque;
    }

    // Encapsuler Coque
    public void setMaCoque(Coque maCoque) {
        this.maCoque = maCoque;
    }

    // constructeur de la classe : permet d'inititier ma variable nom et incrémenter
    // le nombre de bateaux construits
    public Bateau(String nom) {
        this.nom = nom;
        Bateau.nombreDeBateauxConstruits++;

    }

    // ...
    public static int getNombreDeBateauxConstruits() {
        return nombreDeBateauxConstruits;
    }

    // la méthode prendLaMer affiche un message avec le nom du bateau
    public boolean prendLaMer() {
        System.out.println("Le bateau << " + this.nom + " >> prend la Mer");
        return true;
    }

    // la méthode navigue prend en parametre les miles et affecte ce parametre à la
    // variable milesParcourus
    public void navigue(double miles) {
        this.milesParcourus += miles;
    }

    // la méthode arrive au port permet d'afficher un message avec le nom du bateau
    // et réinitialise la variable milesParcourus à 0
    public void arriveAuPort() {
        System.out.println(
                "Le Bateau << " + this.nom + " >> arrive Au Port ==>>> " + this.milesParcourus + " miles parcourus");
        this.milesParcourus = 0;
    }

}