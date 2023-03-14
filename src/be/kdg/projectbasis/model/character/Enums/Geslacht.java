package be.kdg.projectbasis.model.character.Enums;

public enum Geslacht {
        vrouw, man;
        public boolean matches(String question) {
            return question.contains(name().toLowerCase());
        }
}
