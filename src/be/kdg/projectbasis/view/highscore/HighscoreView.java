package be.kdg.projectbasis.view.highscore;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HighscoreView extends VBox {
    private Label lblPositie;
    private Label lblSpelernaam;
    private Label lblScore;
    private Button btnLezen;
    private Button btnSchrijven;
    private Button btnTerug;
    private TextField txtSpelernaam;
    private TextField txtScore;
    private GridPane mijnGridPane;

    public HighscoreView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        lblPositie = new Label("Positie");
         lblSpelernaam = new Label("Spelernaam");
         lblScore = new Label("Score");
         btnLezen = new Button("Lezen");
         btnSchrijven = new Button("Schrijven");
         txtSpelernaam = new TextField();
         txtScore = new TextField();
        mijnGridPane = new GridPane();
         btnTerug = new Button("Terug");
    }

    private void layoutNodes() {
        this.getChildren().add(mijnGridPane);
        this.getChildren().add(btnTerug);
        this.setAlignment(Pos.CENTER_RIGHT);
        this.getChildren().add(btnLezen);
        this.getChildren().add(txtSpelernaam);
        this.getChildren().add(txtScore);
        this.getChildren().add(btnSchrijven);
    }

    public Label getLblPositie() {
        return lblPositie;
    }

    public Label getLblSpelernaam() {
        return lblSpelernaam;
    }

    public Label getLblScore() {
        return lblScore;
    }

    public Button getBtnLezen() {
        return btnLezen;
    }

    public Button getBtnSchrijven() {
        return btnSchrijven;
    }

    public Button getBtnTerug() {
        return btnTerug;
    }

    public TextField getTxtSpelernaam() {
        return txtSpelernaam;
    }

    public TextField getTxtScore() {
        return txtScore;
    }

    public GridPane getMijnGridPane() {
        return mijnGridPane;
    }
}
