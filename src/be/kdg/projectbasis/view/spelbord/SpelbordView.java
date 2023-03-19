package be.kdg.projectbasis.view.spelBord;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class SpelBordView extends Parent {
    private ImageView[] characterImages;
    private TextField txtQuestion;
    private Label lblQuestion;
    private Button submitQuestion;
    private TextField txtGuess;
    private Label lblGuess;
    private Button submitGuess;
    private GridPane gridpaneControls;
    private GridPane gridpaneCharacters;

    public SpelBordView() {
        super();
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.lblQuestion = new Label("Vraag: ");
        this.txtQuestion = new TextField();
        this.submitQuestion = new Button("Verstuur vraag");
        this.lblGuess = new Label("Gok een personage: ");
        this.txtGuess = new TextField();
        this.submitGuess = new Button("Verstuur gok");
    }

    private void layoutNodes() {
        gridpaneControls = new GridPane();
        gridpaneControls.add(lblQuestion, 0, 0);
        gridpaneControls.add(txtQuestion, 1, 0);
        gridpaneControls.add(submitQuestion, 2, 0);
        gridpaneControls.add(lblGuess, 0, 1);
        gridpaneControls.add(txtGuess, 1, 1);
        gridpaneControls.add(submitGuess, 2, 1);

        gridpaneCharacters = new GridPane();

    }

    public ImageView[] getCharacterImages() {
        return characterImages;
    }

    public TextField getTxtQuestion() {
        return txtQuestion;
    }

    public Label getLblQuestion() {
        return lblQuestion;
    }

    public Button getSubmitQuestion() {
        return submitQuestion;
    }

    public TextField getTxtGuess() {
        return txtGuess;
    }

    public Label getLblGuess() {
        return lblGuess;
    }

    public Button getSubmitGuess() {
        return submitGuess;
    }

    public GridPane getGridpaneControls() {
        return gridpaneControls;
    }

    public GridPane getGridpaneCharacters() {
        return gridpaneCharacters;
    }
}
