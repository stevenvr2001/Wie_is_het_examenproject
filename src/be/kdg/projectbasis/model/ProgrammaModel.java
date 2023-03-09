package be.kdg.projectbasis.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaModel {
    public ProgrammaModel() {

    }

    public void schrijfHighscoreWeg(Highscore wegTeSchrijvenHigscoreGegevens) {
        File mijnHighscoreBestand = new File("G:\\Mijn Drive\\Persoonlijk\\2021\\JavaFx\\Week 2b\\Highscores.csv");
        ArrayList<String> wegTeSchrijvenRegelsTekst = new ArrayList<String>();
        wegTeSchrijvenRegelsTekst.add(wegTeSchrijvenHigscoreGegevens.getSpelernaam() + ";" + wegTeSchrijvenHigscoreGegevens.getScore());
        try {
            Files.write(mijnHighscoreBestand.toPath(), wegTeSchrijvenRegelsTekst, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Highscore> leesHighscoresVanBestand(){
        //CSV bestand uitlezen
        List<Highscore> spelersinformatie = new ArrayList<Highscore>();
        File mijnHighscoreBestand = new File("G:\\Mijn Drive\\Persoonlijk\\2021\\JavaFx\\Week 2b\\Highscores.csv");
        try {
            List<String> mijnHighscoreLijnenAlsTekst = Files.readAllLines(mijnHighscoreBestand.toPath());
            for (String huidigeHighscoreLijn : mijnHighscoreLijnenAlsTekst) {
                String[] mijnHighscoreOnderdelen = huidigeHighscoreLijn.split(";");

                String spelernaam = mijnHighscoreOnderdelen[0];
                int score = Integer.parseInt(mijnHighscoreOnderdelen[1]);

                Highscore mijnUitgelezenHighscore = new Highscore(spelernaam, score);
                spelersinformatie.add(mijnUitgelezenHighscore);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spelersinformatie;
    }
}
