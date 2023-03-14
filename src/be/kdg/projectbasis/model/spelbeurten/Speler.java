package be.kdg.projectbasis.model.spelbeurten;

import java.util.Scanner;
public class Speler {
    private final String naam;
    private final String voornaam;
    private final int leeftijd;
    private final int aantalWins;

    public Speler(String naam, String voornaam, int leeftijd, int aantalWins) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.leeftijd = leeftijd;
        this.aantalWins = aantalWins;
    }
    public static Speler gegevensSpeler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw gegevens in:");
        System.out.print("Voornaam: ");
        String voornaam = scanner.nextLine();
        System.out.print("Naam: ");
        String naam = scanner.nextLine();
        System.out.print("Leeftijd: ");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();

        Speler speler = new Speler(naam, voornaam, leeftijd, 0);
        return speler;
    }


}
