package be.kdg.projectbasis.model.character;
import be.kdg.projectbasis.model.character.Enums.*;


import java.util.ArrayList;

public class CharacterlijstComputer {
    private ArrayList<Character> characters;

    public CharacterlijstComputer() {
        characters = new ArrayList<Character>();
        // Voeg characters toe aan de lijst
        characters.add(new Character("Alice", Geslacht.vrouw, HaarKleur.blond, Haarlengte.lang, HaarStijl.stijl, Accessoires.bril, Accessoires.oorbellen));
        characters.add(new Character("Alex", Geslacht.man, HaarKleur.blond, Haarlengte.middelang, HaarStijl.golvend, Accessoires.pet, Accessoires.bril));
        characters.add(new Character("Alana", Geslacht.vrouw, HaarKleur.bruin, Haarlengte.lang, HaarStijl.golvend, Accessoires.pet, Accessoires.halsketting));
        characters.add(new Character("Bert", Geslacht.man, HaarKleur.groen, Haarlengte.lang, HaarStijl.stijl, Accessoires.hoed, Accessoires.geen));
        characters.add(new Character("Charlie", Geslacht.man, HaarKleur.kaal, Haarlengte.kaal, HaarStijl.kaal, Accessoires.oorbellen, Accessoires.bril));
        characters.add(new Character("Dirk", Geslacht.man, HaarKleur.bruin, Haarlengte.middelang, HaarStijl.stijl, Accessoires.pet, Accessoires.hoed));
        characters.add(new Character("Gerda", Geslacht.vrouw, HaarKleur.kaal, Haarlengte.kaal, HaarStijl.kaal, Accessoires.hoed, Accessoires.bril));
        characters.add(new Character("Jennifer", Geslacht.vrouw, HaarKleur.groen, Haarlengte.lang, HaarStijl.golvend, Accessoires.halsketting, Accessoires.oorbellen));
        characters.add(new Character("Jan", Geslacht.man, HaarKleur.rood, Haarlengte.kort, HaarStijl.krullen, Accessoires.oorbellen, Accessoires.halsketting));
        characters.add(new Character("Emma", Geslacht.vrouw, HaarKleur.zwart, Haarlengte.lang, HaarStijl.stijl, Accessoires.bril, Accessoires.oorbellen));
        characters.add(new Character("Ethan", Geslacht.man, HaarKleur.bruin, Haarlengte.lang, HaarStijl.golvend, Accessoires.pet, Accessoires.bril));
        characters.add(new Character("Emily", Geslacht.vrouw, HaarKleur.blond, Haarlengte.middelang, HaarStijl.stijl, Accessoires.halsketting, Accessoires.oorbellen));
        characters.add(new Character("Frank", Geslacht.man, HaarKleur.blond, Haarlengte.kort, HaarStijl.krullen, Accessoires.hoed, Accessoires.geen));
        characters.add(new Character("Lilly", Geslacht.vrouw, HaarKleur.bruin, Haarlengte.lang, HaarStijl.krullen, Accessoires.oorbellen, Accessoires.geen));
        characters.add(new Character("Bob", Geslacht.man, HaarKleur.zwart, Haarlengte.kort, HaarStijl.krullen, Accessoires.oorbellen, Accessoires.geen));
        characters.add(new Character("Cathy", Geslacht.vrouw, HaarKleur.rood, Haarlengte.lang, HaarStijl.stijl, Accessoires.hoed, Accessoires.geen));
        characters.add(new Character("David", Geslacht.man, HaarKleur.bruin, Haarlengte.middelang, HaarStijl.golvend, Accessoires.pet, Accessoires.bril));
        characters.add(new Character("Ella", Geslacht.vrouw, HaarKleur.blond, Haarlengte.lang, HaarStijl.krullen, Accessoires.halsketting, Accessoires.oorbellen));
        characters.add(new Character("Fiona", Geslacht.vrouw, HaarKleur.bruin, Haarlengte.lang, HaarStijl.stijl, Accessoires.bril, Accessoires.oorbellen));
        characters.add(new Character("George", Geslacht.man, HaarKleur.zwart, Haarlengte.kort, HaarStijl.krullen, Accessoires.hoed, Accessoires.geen));
        characters.add(new Character("Hannah", Geslacht.vrouw, HaarKleur.rood, Haarlengte.lang, HaarStijl.golvend, Accessoires.halsketting, Accessoires.oorbellen));
        characters.add(new Character("Ivan", Geslacht.man, HaarKleur.bruin, Haarlengte.middelang, HaarStijl.stijl, Accessoires.pet, Accessoires.bril));
        characters.add(new Character("Jasmine", Geslacht.vrouw, HaarKleur.blond, Haarlengte.lang, HaarStijl.krullen, Accessoires.halsketting, Accessoires.oorbellen));
        characters.add(new Character("Karen", Geslacht.vrouw, HaarKleur.bruin, Haarlengte.lang, HaarStijl.stijl, Accessoires.bril, Accessoires.oorbellen));
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }
}
