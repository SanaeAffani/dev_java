package magasindechaussures;

public class Chaussure {
    private String nom;
    private int pointure;
    private boolean gauche;

    public String getNom() {
        return nom;
    }

    public int getPointure() {
        return pointure;
    }

    public boolean isGauche() {
        return gauche;
    }

    public void marche() {
        System.out.println("Je suis une chaussure !");
    }
}
