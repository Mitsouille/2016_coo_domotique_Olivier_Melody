public class Television implements Appareil {

    private int son = 0;

    @Override
    public void allumer() {
        this.son += 10;

        //Son max
        if (this.son > 100)
            this.son = 100;
    }

    @Override
    public void eteindre() {
        this.son = 0;
    }

    public String toString() {
        String str = "";
        str += "Television : " + son;
        return str;
    }
}
