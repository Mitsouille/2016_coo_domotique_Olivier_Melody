import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    public void activerAppareil(int indiceAppareil) {
        this.appareils.get(indiceAppareil).allumer();
    }

    public void desactiverAppareil(int indiceAppareil) {
        this.appareils.get(indiceAppareil).eteindre();
    }

    public void activerTout() {
        for (Appareil a : this.appareils)
            a.allumer();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Appareil : ");
        for (Appareil a : this.appareils) {
            str.append(a.toString());
            str.append("\n");
        }
        return new String(str);
    }
}
