package be.kdg.projectbasis.view.hoofdmenu;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HoofdmenuView extends VBox {
    //1. Maak een attribuut per node (zowel controls en panes, behalve de "root pane")
//2. Pas de naam van de constructor aan naar uw klassenaam
//3. Kopieer uw control instantiaties naar "initialiseNodes()"
//4. Laat uw View-klasse overerven van het Pane type waarin alle andere Nodes van uw scherm inzitten
//5. Voeg uw controls toe aan de Nodes om ze een positie op het scherm te geven
//6. Maak public getters aan voor al uw attributen (zijnde controls, panes, ...)


    //Hier uw attributen
//Hier uw getters

    private Button btnNieuwSpel;
    private Button btnHoogsteScores;
   private Button btnHandleiding;

    public HoofdmenuView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
         btnNieuwSpel = new Button();
        btnNieuwSpel.setText("Nieuw spel");
         btnHoogsteScores = new Button("Hoogste scores");
         btnHandleiding = new Button("Handleiding");

        btnNieuwSpel.setPrefSize(200,40);
        btnHoogsteScores.setPrefSize(200,40);
        btnHandleiding.setPrefSize(200,40);

        btnNieuwSpel.setBackground(new Background( new BackgroundFill(new Color(0.8,0.8,1,1), new CornerRadii(20), null)));
        btnHoogsteScores.setBackground(new Background( new BackgroundFill(new Color(0.8,0.8,1,1), new CornerRadii(20), null)));
        btnHandleiding.setBackground(new Background( new BackgroundFill(new Color(0.8,0.8,1,1), new CornerRadii(20), null)));

        btnNieuwSpel.setFont(Font.font("Comic Sans MS",  FontWeight.EXTRA_BOLD,16));
        btnHoogsteScores.setFont(Font.font("Comic Sans MS",  FontWeight.EXTRA_BOLD,16));
        btnHandleiding.setFont(Font.font("Comic Sans MS",  FontWeight.EXTRA_BOLD,16));

    }

    private void layoutNodes() {
        this.getChildren().add(btnNieuwSpel);
        this.getChildren().add(btnHoogsteScores);
        this.getChildren().add(btnHandleiding);
        this.setSpacing(20);
        BackgroundImage achtergrondAfbeelding = new BackgroundImage(new Image("/manga.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100,100,true,true,true, true));
        this.setBackground(new Background(achtergrondAfbeelding));
        this.setAlignment(Pos.CENTER);
    }

    public Button getBtnNieuwSpel() {
        return btnNieuwSpel;
    }

    public Button getBtnHoogsteScores() {
        return btnHoogsteScores;
    }

    public Button getBtnHandleiding() {
        return btnHandleiding;
    }
}
