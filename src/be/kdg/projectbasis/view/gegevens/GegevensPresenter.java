package be.kdg.projectbasis.view.gegevens;
import be.kdg.projectbasis.Main;
import be.kdg.projectbasis.model.ProgrammaModel;
import be.kdg.projectbasis.model.highscore.HighScoreModel;
import be.kdg.projectbasis.view.spelBord.SpelBordPresenter;
import be.kdg.projectbasis.view.spelBord.SpelBordView;
import javafx.scene.Scene;
import be.kdg.projectbasis.view.gegevens.newplayer.RegisterPresenter;
import be.kdg.projectbasis.view.gegevens.newplayer.RegisterView;

public class GegevensPresenter {

    private ProgrammaModel model;
    private GegevensView view;

    public GegevensPresenter(ProgrammaModel model, GegevensView view) {
        this.model= model;
        this.view = view;
        this.addEventHandlers();
        this.openSpelbord();
        this.createNewUser();
    }
    private void addEventHandlers() {
        view.getBtnValidate().setOnAction(actionEvent -> {
            // laad de spelerinfo
            String username = view.getTxtUsername().getText(); // haal de username op uit de view
            HighScoreModel player = HighScoreModel.readHighScore(username); // haal gegevens op van de speler
            if (player != null) {
                // als de speler al bestaat, laad de gegevens uit Highscores.xml en ga door naar SpelbordView
                String firstName = player.getVoornaam();
                String lastName = player.getAchternaam();
                int wins = player.getWins();
                System.out.println("Gebruikersnaam gevonden, doorgaan naar spelbord");
                openSpelbord();

            } else {
                // als de speler niet bestaat, open de GegevensViewNewPlayer
                createNewUser();
                System.out.println("Gebruikersnaam niet gevonden, vul je gegevens in om nieuwe gebruiker aan te maken: ");
            }
        });
    }

    private void createNewUser() {
        RegisterView registerView = new RegisterView();
        RegisterPresenter registerPresenter = new RegisterPresenter(model, registerView);
        Scene register = new Scene(registerView);
        Main.Window.setScene(register);
        Main.Window.setTitle("Nieuwe gebruiker");
        Main.Window.show();
        Main.Window.setFullScreen(true);
    }

    private void openSpelbord() {
        SpelBordView spelBordView = new SpelBordView();
        SpelBordPresenter spelBordPresenter = new SpelBordPresenter(model, spelBordView);
        Scene spelbord = new Scene(spelBordView);
        Main.Window.setScene(spelbord);
        Main.Window.setTitle("Spelbord");
        Main.Window.show();
        Main.Window.setFullScreen(true);
    }





    public void addWindowEventHandlers() {

    }
}
