import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest{

    /**
     * Test du constructeur d'une télécommande
     */
    @Test
    public void testAjoutLampeVide(){

        Telecommande t = new Telecommande();
        Lampe l = new Lampe("Lampe1");

        t.ajouterLampe(l);

        int taille = t.getLampes().length;
        assertEquals(1,taille,"La telecommande doit avoir une lampe.");
    }

    @Test
    public void testAjouterLampe(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");

        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        int taille = t.getLampes().length;
        assertEquals(2,taille,"La telecommande doit avoir deux lampes");
    }

    @Test
    public void testAllumerLampe0(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");

        t.ajouterLampe(l1);
        t.activerLampe(0);

        boolean allumer = t.getLampe(0).isAllume();

        assertEquals(true,allumer,"La lampe 0 doit être allumée.");
    }

    @Test
    public void testAllumerLampe1(){
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");

        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        t.getLampe(1).allumer();
        boolean allumer1 = t.getLampe(0).isAllume();
        boolean allumer2 = t.getLampe(1).isAllume();
        assertEquals(false,allumer1,"La lampe en position 0 doit etre eteinte");
        assertEquals(true,allumer2,"La lampe en position 1 doit etre allumée.");
    }

    @Test
    public void testAllumerLampeInexistante(){
        Telecommande t = new Telecommande();

        t.getLampe(0).allumer();
        boolean allumer = t.getLampe(0).isAllume();
        assertEquals(false,allumer,"Il n'y a pas de lampes");
    }
}