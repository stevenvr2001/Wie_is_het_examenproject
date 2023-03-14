package be.kdg.projectbasis.model.spelbeurten;
import be.kdg.projectbasis.model.character.*;
import be.kdg.projectbasis.model.character.Character;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SpelbeurtSpeler {
    private ArrayList<Character> remainingCharacters;
    private Random random;
    private Character characterToGuess;

    public boolean spelerWin = false;

    public void setupSpeler() {
        // Een Scanner object om vragen te stellen aan de speler
        Scanner scanner = new Scanner(System.in);

        // Print alle characters voor de speler
        CharacterlijstSpeler characterlijstSpeler = new CharacterlijstSpeler();
        remainingCharacters = new ArrayList<>();

        System.out.println(" ");
        for (Character character : characterlijstSpeler.getCharacters()) {
            System.out.println("- " + character.getNaam());
            // Alle characters invoegen
            remainingCharacters.add(character);
        }
        System.out.println("Kies een character uit de bovenstaande lijst dat de speler moet raden");
        // Kies een willekeurige character om te raden
        random = new Random();
        characterToGuess = remainingCharacters.get(random.nextInt(remainingCharacters.size()));
        System.out.println("keuze genoteerd");
        System.out.println(" ");
    }

    public void startSpelbeurt() {
        // Een Scanner object om vragen te stellen aan de speler
        Scanner scanner = new Scanner(System.in);

        // Geef de lijst met resterende karakters weer, samen met hun eigenschappen
        System.out.println(" ");
        System.out.println("Resterende karakters:");
        for (Character character : remainingCharacters) {
            System.out.println("- " + character.getNaam() + " (geslacht: " + character.getGeslacht() + ", haarkleur: " + character.getHaarKleur() + ", haarlengte: "
                    + character.getHaarlengte() + ", haarstijl: " + character.getHaarStijl() + ", accessoire1: " + character.getaccessoire1() + ", accessoire2: " + character.getaccessoire2() + ")");
        }

            System.out.println("Stel een vraag over het karakter om te raden (bijv. 'Is het karakter een man?')");
            String question = scanner.nextLine();

            // Gebruik de vraag van de speler om te bepalen of het karakter aan de eigenschap voldoet
            String answer;
            if (characterToGuess.matches(question)) {
                answer = "ja";
                System.out.println(answer);
            } else {
                answer = "nee";
                System.out.println(answer);
            }

            // Een lijst met resterende karakters

        // Als antwoord nee is
        if (answer.equals("nee")) {
            Iterator<Character> iterator = remainingCharacters.iterator();
            while (iterator.hasNext()) {
                Character character = iterator.next();
                if (character.matches(question)) {
                    iterator.remove();
                }
            }
        }
        // Als antwoord ja is
        if (answer.equals("ja")) {
            Iterator<Character> iterator = remainingCharacters.iterator();
            while (iterator.hasNext()) {
               Character character = iterator.next();
                if (!character.matches(question)) {
                    iterator.remove();
                }
            }
        }


        // Geef de lijst met resterende karakters weer, samen met hun eigenschappen
             System.out.println(" ");
            System.out.println("Resterende karakters:");
            for (Character character : remainingCharacters) {
                System.out.println("- " + character.getNaam() + " (geslacht: " + character.getGeslacht() + ", haarkleur: " + character.getHaarKleur() + ", haarlengte: "
                        + character.getHaarlengte() + ", haarstijl: " + character.getHaarStijl() + ", accessoire1: " + character.getaccessoire1() + ", accessoire2: " + character.getaccessoire2() + ")");
            }
            System.out.println(" ");
            System.out.println("Raad het karakter (typ de naam in)");
            String guess = scanner.nextLine();

            // Als de speler het juiste karakter heeft geraden, geef het resultaat weer en stop het spel
            if (guess.equalsIgnoreCase(characterToGuess.getNaam())) {
                System.out.println("Je hebt het juiste karakter geraden! Het was " + characterToGuess.getNaam());
                spelerWin = true;
            } else {
                System.out.println("Dat is helaas niet het juiste karakter. Probeer het opnieuw.");
            }
    }
    public void reset() {
        // Reset de lijst van resterende karakters
        CharacterlijstSpeler characterlijstSpeler = new CharacterlijstSpeler();
        remainingCharacters = new ArrayList<>();
        for (Character character : characterlijstSpeler.getCharacters()) {
            remainingCharacters.add(character);
        }

        // Kies een nieuwe willekeurige character om te raden
        random = new Random();
        characterToGuess = remainingCharacters.get(random.nextInt(remainingCharacters.size()));

        // Reset de spelerWin-flag
        spelerWin = false;
    }

}