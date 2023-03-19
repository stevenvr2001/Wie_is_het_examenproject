package be.kdg.projectbasis.model.character.Enums;

public enum Hoofddeksel {
    hoed, pet, muts, geen;
    public boolean matches(String question) {
        return question.contains(name().toLowerCase());
    }
}
