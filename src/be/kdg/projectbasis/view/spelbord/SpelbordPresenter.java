package be.kdg.projectbasis.view.spelBord;

import be.kdg.projectbasis.model.ProgrammaModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class SpelBordPresenter {
    private SpelBordView view;
    private ProgrammaModel model;

    public SpelBordPresenter(ProgrammaModel model ,SpelBordView view) {
        this.view = view;
        this.model = model;
        this.addEventHandlers();
    }

    private void addEventHandlers() {
        view.getSubmitQuestion().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String question = view.getTxtQuestion().getText();
                if (question.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.WARNING, "Vul een vraag in", ButtonType.OK);
                    alert.showAndWait();
                } else {
                    // Hier kun je de vraag versturen naar het spelbordmodel
                    view.getTxtQuestion().clear();
                }
            }
        });

        view.getSubmitGuess().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String guess = view.getTxtGuess().getText();
                if (guess.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.WARNING, "Vul een gok in", ButtonType.OK);
                    alert.showAndWait();
                } else {
                    // Hier kun je de gok versturen naar het spelbordmodel
                    view.getTxtGuess().clear();
                }
            }
        });
    }
}
