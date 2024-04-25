import models.Dresseur;
import models.Singe;
import models.Spectateur;
import models.Tour;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Spectateur spectateur = new Spectateur();
        Singe singe1 = new Singe("singe 1", Arrays.asList(new Tour("marcher sur les mains", "acrobatie"), new Tour("jouer du tambour", "musique")));
        Singe singe2 = new Singe("singe 2", Arrays.asList(new Tour("faire le salto", "acrobatie"), new Tour("jouer de la flûte", "musique")));

        Dresseur dresseur1 = new Dresseur("Antoine");
        Dresseur dresseur2 = new Dresseur("Michel");

        // Chaque dresseur demande à son singe d'exécuter tous ses tours
        singe1.effectuerTousTours(dresseur1, spectateur);
        singe2.effectuerTousTours(dresseur2, spectateur);
    }
}