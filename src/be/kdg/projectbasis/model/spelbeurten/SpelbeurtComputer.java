package be.kdg.projectbasis.model.spelbeurten;
import be.kdg.projectbasis.model.character.*;
import be.kdg.projectbasis.model.character.Character;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SpelbeurtComputer {
    private ArrayList<Character> remainingCharactersComputer;
    private Random random;
    private Character chosenCharacter;

    public boolean computerWin = false;
    Scanner scanner = new Scanner(System.in);
    
    public void setupComputer() {
        // Print alle characters voor de speler
        CharacterlijstSpeler characterlijstSpeler = new CharacterlijstSpeler();
        remainingCharactersComputer = new ArrayList<>();

        for (Character character : characterlijstSpeler.getCharacters()) {
            System.out.println("- " + character.getNaam());
            // Alle characters invoegen
            remainingCharactersComputer.add(character);
        }
        System.out.println("Kies een character uit de bovenstaande lijst dat de computer moet raden");
        // Kies een character voor de computer om te raden
        String chosenCharacterName = scanner.nextLine();
        // haal het gekozen character uit de lijst met resterende characters
        for (Character character : remainingCharactersComputer) {
            if (character.getNaam().equalsIgnoreCase(chosenCharacterName)) {
                chosenCharacter = character;
                break;
            }
        }
        System.out.println("keuze genoteerd");
    }

    public void startSpelbeurt() {
        // Een Random object om vragen te stellen aan de speler uit de lijst met vragen
        Random random = new Random();
        ComputerQuestions computerQuestions = new ComputerQuestions();
        boolean computerWin = false;

        // Geef de lijst met resterende karakters weer, samen met hun eigenschappen
        System.out.println("Resterende karakters:");
        for (Character character : remainingCharactersComputer) {
            System.out.print(" - " + character.getNaam());
        }

        System.out.println("Stel een vraag over het karakter om te raden (bijv. 'Is het karakter een man?')");
        String question = computerQuestions.getRandomQuestion();
        System.out.println(question);

            // Gebruik de vraag van de computer om te bepalen of het karakter aan de eigenschap voldoet
            String answer;
            if (chosenCharacter.matches(question)) {
                answer = "ja";
                System.out.println(answer);
            } else {
                answer = "nee";
                System.out.println(answer);
            }

            // Een lijst met resterende karakters

        // Als antwoord nee is
        if (answer.equals("nee")) {
            Iterator<Character> iterator = remainingCharactersComputer.iterator();
            while (iterator.hasNext()) {
                Character character = iterator.next();
                if (character.matches(question)) {
                    iterator.remove();
                }
            }
        }
        // Als antwoord ja is
        if (answer.equals("ja")) {
            Iterator<Character> iterator = remainingCharactersComputer.iterator();
            while (iterator.hasNext()) {
                Character character = iterator.next();
                if (!character.matches(question)) {
                    iterator.remove();
                }
            }
        }
        // Geef de lijst met resterende karakters weer, samen met hun eigenschappen

            System.out.println("Raad het karakter (typ de naam in)");
            String guess = remainingCharactersComputer.get(random.nextInt(remainingCharactersComputer.size())).getNaam();
            System.out.println(guess);

            // Als de computer het juiste karakter heeft geraden, geef het resultaat weer en stop het spel
            if (guess.equalsIgnoreCase(chosenCharacter.getNaam())) {
                System.out.println("Je hebt het juiste karakter geraden! Het was " + chosenCharacter.getNaam());
                computerWin = true;
            } else {
                System.out.println("Dat is helaas niet het juiste karakter. Probeer het opnieuw.");
            }
    }
    public void reset() {
        // Reset de lijst van resterende karakters
        CharacterlijstSpeler characterlijstSpeler = new CharacterlijstSpeler();
        remainingCharactersComputer = new ArrayList<>();
        for (Character character : characterlijstSpeler.getCharacters()) {
            remainingCharactersComputer.add(character);
        }

        // Kies een nieuw character om te raden
        String chosenCharacterName = scanner.nextLine();
        // haal het gekozen character uit de lijst met resterende characters
        for (Character character : remainingCharactersComputer) {
            if (character.getNaam().equalsIgnoreCase(chosenCharacterName)) {
                chosenCharacter = character;
                break;
            }
        }
        System.out.println("keuze genoteerd");

        // Reset de computerWin-flag
        computerWin = false;
    }
}