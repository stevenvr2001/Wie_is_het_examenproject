package be.kdg.projectbasis;

import be.kdg.projectbasis.model.ProgrammaModel;
import be.kdg.projectbasis.view.highscore.HighscorePresenter;
import be.kdg.projectbasis.view.highscore.HighscoreView;
import be.kdg.projectbasis.view.testscreen.TestScreenPresenter;
import be.kdg.projectbasis.view.testscreen.TestScreenView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        ProgrammaModel model = new ProgrammaModel();
        HighscoreView view = new HighscoreView();
        HighscorePresenter presenter = new HighscorePresenter(model, view);
        primaryStage.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        primaryStage.show();
    }
}
