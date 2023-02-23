package magasindechaussures;

public class Main {

    public static void main(String args[]) {
        Magasin monMagasin = new Magasin();
        monMagasin.setNom("Lafayette");

        ChaussureDeVille mesChaussureDeVille = new ChaussureDeVille();
        Basket mesBaskets = new Basket();
        Botte mesBottes = new Botte();
        Escarpin mesEscarpins = new Escarpin();
        Tennis mesTennis = new Tennis();

        // écrire dans setChaussure une instance de type chaussure
        monMagasin.setChaussure(mesChaussureDeVille);

        // ...faireMarcherChaussure va appeler la methode marche de l'instance chaussure
        // qui est dans monmagasin
        monMagasin.faireMarcherChaussure();

        monMagasin.setChaussure(mesBottes);
        monMagasin.faireMarcherChaussure();
        monMagasin.setChaussure(mesBaskets);
        monMagasin.faireMarcherChaussure();
        monMagasin.setChaussure(mesEscarpins);
        monMagasin.faireMarcherChaussure();
        monMagasin.setChaussure(mesTennis);
        monMagasin.faireMarcherChaussure();

    }

}
