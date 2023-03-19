package be.kdg.projectbasis.view.gegevens;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class SceneLabel extends Label {
    public SceneLabel(String s){
        super(s);
        this.setFont(new Font("Arial Black", 24));

    }
}
