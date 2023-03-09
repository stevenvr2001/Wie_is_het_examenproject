package be.kdg.projectbasis.view.testscreen;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class TestScreenView extends FlowPane {
    private Button btnInvoer;
    private TextField txtUitvoer;

    public TestScreenView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.btnInvoer = new Button("Test");
        this.txtUitvoer = new TextField();
    }

    private void layoutNodes() {
        this.getChildren().add(btnInvoer);
        this.getChildren().add(txtUitvoer);
    }

    public Button getBtnInvoer() {
        return btnInvoer;
    }

    public TextField getTxtUitvoer() {
        return txtUitvoer;
    }
}
