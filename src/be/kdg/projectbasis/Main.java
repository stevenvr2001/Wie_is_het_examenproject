package be.kdg.projectbasis;

import be.kdg.projectbasis.model.ProgrammaModel;

import be.kdg.projectbasis.model.spelbeurten.SpelbeurtComputer;
import be.kdg.projectbasis.model.spelbeurten.SpelbeurtSpeler;
import be.kdg.projectbasis.view.highscore.HighscorePresenter;
import be.kdg.projectbasis.view.highscore.HighscoreView;
import be.kdg.projectbasis.view.hoofdmenu.HoofdmenuPresenter;
import be.kdg.projectbasis.view.hoofdmenu.HoofdmenuView;
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
        HoofdmenuView view = new HoofdmenuView();
        HoofdmenuPresenter presenter = new HoofdmenuPresenter(view);
        primaryStage.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        primaryStage.show();
    }
}
