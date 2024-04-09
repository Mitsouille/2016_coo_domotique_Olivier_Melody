public class Lampe implements Appareil {

    private String nom;
    private boolean allume;

    public Lampe(String nom) {
        if (nom == null)
            nom = "Inconnu";
        this.nom = nom;
        this.allume = false;
    }

    @Override
    public void allumer() {
        this.allume = true;
    }

    @Override
    public void eteindre() {
        this.allume = false;
    }

    public String toString() {
        return "Lampe : " + this.nom + " etat : " + this.allume;
    }

}
