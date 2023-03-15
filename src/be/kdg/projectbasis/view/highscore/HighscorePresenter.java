package be.kdg.projectbasis.view.highscore;

import be.kdg.projectbasis.model.highscore.Highscore;
import be.kdg.projectbasis.model.ProgrammaModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

import java.util.List;
import java.util.TreeSet;

public class HighscorePresenter {
    private ProgrammaModel model;
    private HighscoreView view; //Pas het type van de view aan naar de view die samenhangt met deze presenter

    public HighscorePresenter(ProgrammaModel model, HighscoreView view) { //Pas het type van de view aan naar de view die samenhangt met deze presenter
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();

    }

    private void addEventHandlers() {
        //Voeg hier uw event handlers toe
        //Binnen een eventhandler ga je normaal slechts 2 zaken doen:
        //1. Nieuwe visualisaties openen (nieuwe schermen openen) of zaken die niet moeten worden onthouden (in het model) rechtstreeks aanpassen (bijvoorbeeld in het geval dat je een tekstfield rood wilt maken omdat er een niet-valide emailadres in werd geschreven
        //2. Data in het model aanpassen. Je krijgt toegang tot het model via het model-attribuut
        //Als je het model hebt geupdate en hetzelfde scherm blijft zichtbaar op het scherm, dan zou je normaal de hieronderstaande updateView methode aanroepen
    view.getBtnLezen().setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            //Pane aanmaken en nodes daaraan toevoegen
            //Het type van pane bepaalt waar de node op het scherm geplaatst wordt
            //mijnGridPane = new GridPane();
           updateView();
        }
    });

    view.getBtnSchrijven().setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            Highscore nieuweHighscore = new Highscore(view.getTxtSpelernaam().getText(), Integer.parseInt(view.getTxtScore().getText()));
          model.schrijfHighscoreWeg(nieuweHighscore);
          updateView();
        }
    });
    }

    private void updateView() {
        //Deze methode wist alle informatie die op de view zichtbaar is (maakt bijvoorbeeld textfields leeg) en herschrijft de informatie uit het model opnieuw op het scherm.
        view.getMijnGridPane().getChildren().clear();
        view.getMijnGridPane().add(view.getLblPositie(), 0, 0);
        view.getMijnGridPane().add(view.getLblSpelernaam(), 1, 0);
        view.getMijnGridPane().add(view.getLblScore(), 2, 0);

        view.getMijnGridPane().setGridLinesVisible(true);

        List<Highscore> spelersinformatie = model.leesHighscoresVanBestand();
        TreeSet<Highscore> gesorteerdeHigscores = new TreeSet<>();
        gesorteerdeHigscores.addAll(spelersinformatie);
        int positie = 1;
        for (Highscore huidigeHighscore : gesorteerdeHigscores) {
            Label lblPositieContent = new Label(Integer.toString(positie));
            //lblPositieContent.setPadding(new Insets(20,20,20,20));
            view.getMijnGridPane().add(lblPositieContent, 0, positie);
            view.getMijnGridPane().add(new Label(huidigeHighscore.getSpelernaam()), 1, positie);
            view.getMijnGridPane().add(new Label(Integer.toString(huidigeHighscore.getScore())), 2, positie);
            positie++;
        }
    }

    public void addWindowEventHandlers() {

    }
}
