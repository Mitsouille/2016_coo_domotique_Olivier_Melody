import java.util.ArrayList;

public class Telecommande {


    private ArrayList<Lampe> lampes;

    public Telecommande(){
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout() {
        for (Lampe l : this.lampes) {
            l.allumer();
        }
    }

    public ArrayList<Lampe> getLampes() {
        return lampes;
    }

    public Lampe getLampe(int i) {
        return this.lampes.get(i);
    }

    public void setLampes(ArrayList<Lampe> lampes) {
        this.lampes = lampes;
    }

    public void setLampe(Lampe l, int i) {
        this.lampes.set(i, l);
    }

    public String toString() {
        String res = "";
        for (Lampe l : this.lampes) {
            res += l.toString();
        }
        return res;
    }
}