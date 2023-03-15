package be.kdg.projectbasis.model.character;
import be.kdg.projectbasis.model.character.Enums.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterlijstComputer {
    private ArrayList<Character> characters;

    public CharacterlijstComputer() {
        characters = new ArrayList<Character>();
        try {
            File file = new File("characters.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                Geslacht geslacht = Geslacht.valueOf(parts[1]);
                HaarKleur haarKleur = HaarKleur.valueOf(parts[2]);
                Haarlengte haarLengte = Haarlengte.valueOf(parts[3]);
                HaarStijl haarStijl = HaarStijl.valueOf(parts[4]);
                Accessoires accessoire1 = Accessoires.valueOf(parts[5]);
                Accessoires accessoire2 = Accessoires.valueOf(parts[6]);
                characters.add(new Character(name, geslacht, haarKleur, haarLengte, haarStijl, accessoire1, accessoire2));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }
}
