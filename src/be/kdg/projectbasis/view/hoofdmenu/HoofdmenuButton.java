package be.kdg.projectbasis.view.hoofdmenu;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HoofdmenuButton extends Button {
    public HoofdmenuButton(String s) {
        super(s);
        this.setBackground(new Background(new BackgroundFill(new Color(1, 1, 1, 0.5), new CornerRadii(20), new Insets(1))));
        this.setFont(new Font("Arial Black", 24));
        this.setPrefWidth(400);
        this.setPrefWidth(400);


    }
}