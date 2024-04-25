package models;
import java.util.List;

public class Singe {


    private String nom;
    private List<Tour> tours;

    public Singe(String nom, List<Tour> tours) {
        this.nom = nom;
        this.tours = tours;
    }

    public void effectuerTousTours(Dresseur dresseur, Spectateur spectateur) {
        for (Tour tour : tours) {
            dresseur.demanderTour(this, tour, spectateur);
        }
    }

    public String getNom() {
        return nom;
    }
}
