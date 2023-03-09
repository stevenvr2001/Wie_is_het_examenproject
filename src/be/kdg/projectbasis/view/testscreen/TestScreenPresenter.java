package be.kdg.projectbasis.view.testscreen;

import be.kdg.projectbasis.model.ProgrammaModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TestScreenPresenter {
    private ProgrammaModel model;
    private TestScreenView view;

    public TestScreenPresenter(ProgrammaModel model, TestScreenView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        view.getBtnInvoer().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                view.getTxtUitvoer().setText("Hallo iedereen!");
            }
        });
    }

    private void updateView() {

    }

    public void addWindowEventHandlers() {

    }

}
