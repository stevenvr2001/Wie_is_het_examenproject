package be.kdg.projectbasis.view.gegevens.newplayer;
import be.kdg.projectbasis.Main;
import be.kdg.projectbasis.model.ProgrammaModel;
import be.kdg.projectbasis.model.highscore.HighScoreModel;
import be.kdg.projectbasis.view.spelBord.SpelBordPresenter;
import be.kdg.projectbasis.view.spelBord.SpelBordView;
import javafx.scene.Scene;


public class RegisterPresenter {

    private ProgrammaModel model;
    private RegisterView view;

    public RegisterPresenter(ProgrammaModel model, RegisterView view) {
        this.model= model;
        this.view = view;
        this.addEventHandlers();
        this.openSpelbord();
    }
    private void addEventHandlers() {
        view.getBtnSubmit().setOnAction(actionEvent -> {
            //maak een nieuwe gebruiker aan in de highscore.xml
            String username = view.getTxtUsername().getText();
            String voornaam = view.getTxtVoorNaam().getText();
            String achternaam = view.getTxtAchterNaam().getText();
            String email = view.getTxtEmail().getText();
            HighScoreModel newPlayer = new HighScoreModel(username, voornaam, achternaam, email, 0);
            System.out.println(newPlayer);
            HighScoreModel.savePlayerInfo(username, voornaam, achternaam, email,0);
            // laad de spelerinfo
                System.out.println("gebruiker aangemaakt, doorgaan naar spelbord");

                openSpelbord();
        });
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
