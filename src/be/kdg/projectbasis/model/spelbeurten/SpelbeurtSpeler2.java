package be.kdg.projectbasis.model.spelbeurten;

import be.kdg.projectbasis.model.character.Character;
import be.kdg.projectbasis.model.character.CharacterlijstSpeler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SpelbeurtSpeler2 {
    private ArrayList<Character> remainingCharactersSpeler2;
    private Random random;
    private Character characterToGuess;

    public boolean spelerWin = false;

    public void setupSpeler() {
        // Een Scanner object om vragen te stellen aan de speler
        Scanner scanner = new Scanner(System.in);

        // Print alle characters voor de speler
        CharacterlijstSpeler characterlijstSpeler = new CharacterlijstSpeler();
        remainingCharactersSpeler2 = new ArrayList<>();

        System.out.println(" ");
        for (Character character : characterlijstSpeler.getCharacters()) {
            System.out.println("- " + character.getNaam());
            // Alle characters invoegen
            remainingCharactersSpeler2.add(character);
        }
        System.out.println("Kies een character uit de bovenstaande lijst dat de speler moet raden");
        // Kies een willekeurige character om te raden
        random = new Random();
        characterToGuess = remainingCharactersSpeler2.get(random.nextInt(remainingCharactersSpeler2.size()));
        System.out.println("keuze genoteerd");
        System.out.println(" ");
    }

    public void startSpelbeurt() {
        // Een Scanner object om vragen te stellen aan de speler
        Scanner scanner = new Scanner(System.in);

        // Geef de lijst met resterende karakters weer, samen met hun eigenschappen
        System.out.println(" ");
        System.out.println("Resterende karakters:");
        for (Character character : remainingCharactersSpeler2) {
            System.out.println("- " + character.getNaam() + ", geslacht: " + character.getGeslacht() + ", oogkleur: " + character.getOogkleur() +", haarkleur: " + character.getHaarKleur() + ", haarlengte: "
                    + character.getHaarlengte() + ", haarstijl: " + character.getHaarStijl() + ", gezichtsbeharing: " + character.getGezichtsbeharing() + ", hoofddeksel: " + character.getHoofddeksel() + ", accessoires: " + character.getAccessoires() + ")");
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
            Iterator<Character> iterator = remainingCharactersSpeler2.iterator();
            while (iterator.hasNext()) {
                Character character = iterator.next();
                if (character.matches(question)) {
                    iterator.remove();
                }
            }
        }
        // Als antwoord ja is
        if (answer.equals("ja")) {
            Iterator<Character> iterator = remainingCharactersSpeler2.iterator();
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
            for (Character character : remainingCharactersSpeler2) {
                System.out.println("- " + character.getNaam() + ", geslacht: " + character.getGeslacht() + ", oogkleur: " + character.getOogkleur() +", haarkleur: " + character.getHaarKleur() + ", haarlengte: "
                        + character.getHaarlengte() + ", haarstijl: " + character.getHaarStijl() + ", gezichtsbeharing: " + character.getGezichtsbeharing() + ", hoofddeksel: " + character.getHoofddeksel() + ", accessoires: " + character.getAccessoires() + ")");
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
        remainingCharactersSpeler2 = new ArrayList<>();
        for (Character character : characterlijstSpeler.getCharacters()) {
            remainingCharactersSpeler2.add(character);
        }

        // Kies een nieuwe willekeurige character om te raden
        random = new Random();
        characterToGuess = remainingCharactersSpeler2.get(random.nextInt(remainingCharactersSpeler2.size()));

        // Reset de spelerWin-flag
        spelerWin = false;
    }

}