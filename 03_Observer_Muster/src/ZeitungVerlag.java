import java.util.Date;
import java.util.ArrayList;

public class ZeitungVerlag {

    private ArrayList<IAbonnent> abonnenten = new ArrayList<IAbonnent>();

    public void registriereBeobachter(IAbonnent abonnent) {
        if (!this.abonnenten.contains(abonnent))
            abonnenten.add(abonnent);
    }
    public void entferneBeobachter(IAbonnent abonnent) {
        abonnenten.remove(abonnent);
    }

    //
    public void benachrichtigeBeobachter(Zeitung zeitung) {
        for (IAbonnent abonnent : this.abonnenten) {
            abonnent.erhalteZeitung(zeitung);
        }
    }

    public void verteileZeitung(String titel){
        Zeitung zeitung = new Zeitung(new Date(), titel);
        benachrichtigeBeobachter(zeitung);
    }

}
