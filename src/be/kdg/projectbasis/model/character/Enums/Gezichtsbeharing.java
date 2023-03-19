package be.kdg.projectbasis.model.character.Enums;

public enum Gezichtsbeharing {
    baard, snor, geen;
    public boolean matches(String question) {
        return question.contains(name().toLowerCase());
    }
}
