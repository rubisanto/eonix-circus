package models;

public class Dresseur {

        private String nom;

        public Dresseur(String nom) {
            this.nom = nom;
        }

        public void demanderTour(Singe singe, Tour tour, Spectateur spectateur) {
            System.out.println("Dresseur " + nom + " demande à " + singe.getNom() + " de faire le tour '" + tour.getNom() + "'");
            spectateur.reagirTour(tour, singe);
        }
    }

