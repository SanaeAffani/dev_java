package magasindechaussures;

public class Magasin {
    private String nom;
    private String adresse;
    private Chaussure chaussureEnVitrine;

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setChaussure(Chaussure nouvelleChaussure) {
        this.chaussureEnVitrine = nouvelleChaussure;
    }

    public void faireMarcherChaussure() {
        this.chaussureEnVitrine.marche();
    }

    public static void main(String args[]) {
        ChaussureDeVille mesChaussureDeVille = new ChaussureDeVille();
        Basket mesBaskets = new Basket();
        Botte mesBottes = new Botte();
        Escarpin mesEscarpins = new Escarpin();
        Tennis mesTennis = new Tennis();

        mesTennis.marche();
        mesChaussureDeVille.marche();
        mesBaskets.marche();
        mesBottes.marche();
        mesEscarpins.marche();
    }

}
