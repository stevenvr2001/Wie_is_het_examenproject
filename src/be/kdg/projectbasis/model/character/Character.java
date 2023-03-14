package be.kdg.projectbasis.model.character;
import be.kdg.projectbasis.model.character.Enums.*;

public class Character {
        private String naam;
        private HaarKleur haarKleur;
        private Accessoires accessoire1;

        private Accessoires accessoire2;
        private Haarlengte haarlengte;
        private Geslacht geslacht;
        private HaarStijl haarStijl;
        public Character(String naam,Geslacht geslacht, HaarKleur haarKleur, Haarlengte haarlengte, HaarStijl haarStijl, Accessoires accessoire1, Accessoires accessoire2) {
            this.naam = naam;
            this.haarKleur = haarKleur;
            this.geslacht = geslacht;
            this.haarlengte = haarlengte;
            this.haarStijl = haarStijl;
            this.accessoire1 = accessoire1;
            this.accessoire2 = accessoire2;
        }

        public String getNaam() {
            return naam;
        }

    public HaarKleur getHaarKleur() {
        return haarKleur;
    }

    public Accessoires getaccessoire1() {
        return accessoire1;
    }

    public Accessoires getaccessoire2() {
        return accessoire2;
    }

    public Haarlengte getHaarlengte() {
        return haarlengte;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public HaarStijl getHaarStijl() {
        return haarStijl;
    }

    public boolean matches(String question) {
            // Gebruik de vraag van de speler om te bepalen of het karakter aan de eigenschap voldoet
            if (question.contains("man") || question.contains("vrouw")) {
                return geslacht.matches(question);
            } else if (question.contains("bruin") || question.contains("kaal") || question.contains("rood")|| question.contains("blauw") || question.contains("groen") || question.contains("blond") || question.contains("zwart")) {
                return haarKleur.matches(question);
            } else if (question.contains("bril") || question.contains("pet") || question.contains("oorbel") || question.contains("ketting") || question.contains("geen")  || question.contains("hoed")) {
                return accessoire1.matches(question);
            } else if (question.contains("bril") || question.contains("pet") || question.contains("oorbel") || question.contains("ketting") || question.contains("geen")  || question.contains("hoed")) {
                return accessoire2.matches(question);
            } else if (question.contains("kort") || question.contains("lang") || question.contains("kaal") || question.contains("middelang")){
                return haarlengte.matches(question);
            } else if (question.contains("krullen") || question.contains("stijl") || question.contains("kaal") || question.contains("golvend")){
                return haarStijl.matches(question);
            }
            return false;
        }
    }
