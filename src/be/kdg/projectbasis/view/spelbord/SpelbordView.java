package be.kdg.projectbasis.view.spelbord;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpelbordView {

    // The names of the 20 characters
    private String[] names = {"Alex", "Bella", "Cindy", "David", "Ethan", "Fiona", "George", "Hannah", "Ivan", "Jenny", "Kevin", "Linda", "Mike", "Nancy", "Oscar", "Penny", "Quinn", "Ryan", "Sandy", "Tom"};

    // The image views for each character
    private ImageView[] imageViews = new ImageView[names.length];

    // The text field for user input
    private TextField textField;

    // The label for feedback
    private Label label;

    // The submit button
    private Button submitButton;

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) {
        // Create a grid pane for the character image views
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        // Create and add the character image views to the grid pane
        for (int i = 0; i < 20; i++) {
            Image image = new Image("alex" + ".jpg"); // Load image from file
            imageViews[i] = new ImageView(image); // Create image view from image
            imageViews[i].setFitWidth(100); // Set width of image view
            imageViews[i].setPreserveRatio(true); // Preserve aspect ratio of image view
            gridPane.add(imageViews[i], i % 5, i / 5); // Add image view to grid pane
            gridPane.alignmentProperty().set(Pos.CENTER); // Center grid pane

            // Set up the action for each image view when clicked
            int index = i; // Store index of current loop iteration in a final variable
            imageViews[i].setOnMouseClicked(e -> selectCharacter(index));
        }

        // Create a horizontal box for the text field and submit button
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        // Create and add the text field and submit button to the horizontal box
        textField = new TextField();
        textField.setPromptText("Enter your guess");

        submitButton = new Button("Submit");
        hBox.getChildren().addAll(textField, submitButton);

        // Create a label for feedback
        label = new Label("Welcome to Guess Who!");

        // Set up the action for the submit button
        submitButton.setOnAction(e -> checkGuess());

        // Create a vertical box for the main layout
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        // Add all components to vBox
        vBox.getChildren().addAll(gridPane, hBox, label);

        // Create scene
        Scene scene = new Scene(vBox);

        primaryStage.setTitle("Wie is het?");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    // A method to select a character when an image view is clicked
    private void selectCharacter(int index) {
        // Set text field to name of selected character
        textField.setText(names[index]);
    }
    private void checkGuess() {
        // Get user's input
        String guess = textField.getText().trim();

        // Check if input is empty
        if (guess.isEmpty()) {
            label.setText("Please enter a name.");
            return;
        }

        // Check if input matches any of the character names
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (guess.equalsIgnoreCase(names[i])) {
                found = true;
                break;
            }
        }

        // Display feedback accordingly
        if (found) {
            label.setText("You guessed right!");
        } else {
            label.setText("Sorry, wrong guess.");
        }

        // Clear text field
        textField.clear();
    }
}


