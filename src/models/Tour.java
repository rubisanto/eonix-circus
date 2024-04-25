package models;

public class Tour {

        private String nom;
        private String type; // "acrobatie" ou "musique"

        public Tour(String nom, String type) {
            this.nom = nom;
            this.type = type;
        }

        public String getNom() {
            return nom;
        }

        public String getType() {
            return type;
        }
    }

