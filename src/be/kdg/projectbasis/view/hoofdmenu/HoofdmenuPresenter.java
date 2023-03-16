package be.kdg.projectbasis.view.hoofdmenu;

import be.kdg.projectbasis.Main;
import be.kdg.projectbasis.model.ProgrammaModel;
import be.kdg.projectbasis.view.gegevensScene.GegevensPresenter;
import be.kdg.projectbasis.view.gegevensScene.GegevensView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HoofdmenuPresenter {

    private ProgrammaModel model;

    private HoofdmenuView view;

    public HoofdmenuPresenter(ProgrammaModel model,HoofdmenuView view) {
        this.model = model;
        this.view = view;
        this.addEventHandelers();
        this.updateView();

    }


    private void addEventHandelers() {
       view.getBtnNieuwSpel().setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               updateView();
           }
       });


                /*
                GegevensView GegevensView = new GegevensView();
                GegevensPresenter GegevensPresenter = new GegevensPresenter(model,GegevensView);
                Stage gegevensInvulStage = new Stage();
                gegevensInvulStage.initOwner(view.getScene().getWindow());
                gegevensInvulStage.setScene(new Scene(GegevensView));
                gegevensInvulStage.showAndWait();*/

    }

    private void updateView() {
        GegevensView gegevensView = new GegevensView();
        GegevensPresenter gegevensPresenter = new GegevensPresenter(model,gegevensView);
        Scene Highscores = new Scene(gegevensView);
        Main.Window.setScene(Highscores);
        Main.Window.setTitle("Highscores");
        Main.Window.show();
        Main.Window.setFullScreen(true);

    }


    public void addWindowEventHandlers() {
    }
}