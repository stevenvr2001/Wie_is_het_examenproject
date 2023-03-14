package be.kdg.projectbasis.model.character.Enums;

public enum HaarKleur {
        blond, bruin, zwart, groen, blauw, rood, kaal;
        public boolean matches(String question) {
            return question.contains(name().toLowerCase());
        }
    }
