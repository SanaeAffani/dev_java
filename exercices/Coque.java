public class Coque {
    private int pointsdeVie;
    private int pointsDeVieMax;

    public Coque(int pointsDeVieMax) {
        this.pointsdeVie = pointsDeVieMax;
        this.pointsDeVieMax = pointsDeVieMax;

    }

    public int getPointsdeVie() {
        return pointsdeVie;
    }

    public int getPointsDeVieMax() {
        return pointsDeVieMax;
    }

    public void setPointsdeVie(int pointsdeVie) {
        this.pointsdeVie = pointsdeVie;
    }

    public void setPointsDeVieMax(int pointsDeVieMax) {
        this.pointsDeVieMax = pointsDeVieMax;
    }

}
