public class Bateau {

    // déclataion des variables
    private final String nom;
    private double milesParcourus;
    private Coque maCoque;
    private int nombreDeBateauxConstruits = 0;

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
        this.nombreDeBateauxConstruits++;

    }

    // ...
    public int getNombreDeBateauxConstruits() {
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

    public static void main(String[] args) {

        // ici je crée une instance de mon bateau avec mon constructeur
        Bateau monBateau1 = new Bateau("OCEANS EVASION");

        // ...System.out.println("nombre de bateaux : " +
        // monBateau1.getNombreDeBateauxConstruits());

        // appel de la méthode navigue avec un parametre miles
        monBateau1.navigue(250);
        monBateau1.navigue(100);
        monBateau1.navigue(1000);
        monBateau1.navigue(300);

        // ici appel de la méthode arriveAuPort qui affiche un message et réinitialies
        // les miles parcourus à 0
        monBateau1.arriveAuPort();
        //
        Coque maCoque1 = new Coque(6);
        monBateau1.setMaCoque(maCoque1);
        System.out.println(monBateau1.getMaCoque().getPointsdeVie() + " points de vie");
        System.out.println(monBateau1.getNombreDeBateauxConstruits() + " nombre de bateaux construit ");

    }
}