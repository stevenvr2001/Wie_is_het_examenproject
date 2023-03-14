package be.kdg.projectbasis.model;
import be.kdg.projectbasis.model.spelbeurten.SpelbeurtComputer;
import be.kdg.projectbasis.model.spelbeurten.SpelbeurtSpeler;
import be.kdg.projectbasis.model.spelbeurten.Speler;

import java.util.List;
import java.util.Scanner;

public class ProgrammaModel{
    public static void ProgrammaModel(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Laad de highscores

        // vraag aan de speler om zijn/haar gegevens in te voeren als het een nieuwe speler is
        System.out.println("Ben je een nieuwe speler? (ja/nee)");
        String newPlayer = scanner.nextLine();
        if (newPlayer.equals("ja")) {
            Speler.gegevensSpeler();
        } else {
            System.out.println("Welkom terug!");
        }

        // maak instanties van alle nodige klasses
        SpelbeurtSpeler spelbeurtSpeler = new SpelbeurtSpeler();
        SpelbeurtComputer spelbeurtComputer = new SpelbeurtComputer();

        // begin met de setup en laat elke speler een character kiezen
        spelbeurtComputer.setupComputer();
        spelbeurtSpeler.setupSpeler();

        // start spelbeurt speler en wissel om de beurt af met computer totdat iemand wint
        boolean gameOver = false; // nieuwe variabele
        while (!gameOver) { // verander de voorwaarde in een boolean expressie
            spelbeurtSpeler.startSpelbeurt();
            if (spelbeurtSpeler.spelerWin) {
                System.out.println("Gefeliciteerd, je hebt gewonnen!");
                gameOver = true; // verander de gameOver-status
            } else {
                spelbeurtComputer.startSpelbeurt();
                if (spelbeurtComputer.computerWin) {
                    System.out.println("Helaas, de computer heeft gewonnen.");
                    gameOver = true; // verander de gameOver-status
                }
            }
        }

        // print de highscores

        //mogelijkheid om opnieuw te spelen met nieuwe characters
        System.out.println("Wil je opnieuw spelen? (ja/nee)");
        String newGame = scanner.nextLine();
        //reset de gekozen characters en start nieuw spel
        if (newGame.equals("ja")) {
            spelbeurtSpeler.reset();
            spelbeurtComputer.reset();
         ProgrammaModel(args);
        } else {
            System.out.println("Bedankt voor het spelen!");
        }
    }

    public void schrijfHighscoreWeg(Highscore nieuweHighscore) {
    }

    public List<Highscore> leesHighscoresVanBestand() {
        return null;
    }
}
