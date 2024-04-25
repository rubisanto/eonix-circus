package models;

public class Spectateur {

        public void reagirTour(Tour tour, Singe singe) {
            if (tour.getType().equals("acrobatie")) {
                System.out.println("Le spectateur applaudit pendant le tour d'acrobatie '" + tour.getNom() + "' du " + singe.getNom());
            } else if (tour.getType().equals("musique")) {
                System.out.println("Le spectateur siffle pendant le tour de musique '" + tour.getNom() + "' du " + singe.getNom());
            }
        }
    }

