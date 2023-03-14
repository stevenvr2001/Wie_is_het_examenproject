package be.kdg.projectbasis;

import be.kdg.projectbasis.model.ProgrammaModel;

import be.kdg.projectbasis.model.spelbeurten.SpelbeurtComputer;
import be.kdg.projectbasis.model.spelbeurten.SpelbeurtSpeler;
import be.kdg.projectbasis.view.highscore.HighscorePresenter;
import be.kdg.projectbasis.view.highscore.HighscoreView;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;


public class Main extends Application{

    public static void main(String[] args) {
      //for javafx version
         Application.launch(args);
         //console app
        ProgrammaModel model = new ProgrammaModel();
        }

    @Override
    //for javafx version
    public void start(Stage primaryStage) {
        ProgrammaModel model = new ProgrammaModel();
        HighscoreView view = new HighscoreView();
        HighscorePresenter presenter = new HighscorePresenter(model, view);
        primaryStage.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        primaryStage.show();
    }
}
