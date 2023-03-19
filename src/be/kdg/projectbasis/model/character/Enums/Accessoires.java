package be.kdg.projectbasis.model.character.Enums;

public enum Accessoires {
        bril, halsketting, oorbellen, geen;
        public boolean matches(String question) {
            return question.contains(name().toLowerCase());

        }
}
