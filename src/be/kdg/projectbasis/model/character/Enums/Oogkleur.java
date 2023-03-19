package be.kdg.projectbasis.model.character.Enums;

public enum Oogkleur {
    bruin, blauw, groen, grijs;
    public boolean matches(String question) {
        return question.contains(name().toLowerCase());
    }

}
