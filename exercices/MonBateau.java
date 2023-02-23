public class MonBateau {

    // déclataion des variables
    private String nom;
    private double milesParcourus;

    // constructeur de la classe : permet d'inititier ma variable nom
    public MonBateau(String nom) {
        this.nom = nom;
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
        MonBateau monBateau = new MonBateau("OCEANS EVASION");

        // appel de la méthode navigue avec un parametre miles
        monBateau.navigue(250);
        monBateau.navigue(100);
        monBateau.navigue(1000);
        monBateau.navigue(300);

        // ici appel de la méthode arriveAuPort qui affiche un message et réinitialies
        // les miles parcourus à 0
        monBateau.arriveAuPort();

    }
}