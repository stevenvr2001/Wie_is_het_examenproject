package be.kdg.projectbasis.view.gegevensScene;

import be.kdg.projectbasis.model.ProgrammaModel;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class GegevensView extends VBox {

    private Button btnContinue;

    private Label lblPlayername;

    private Label lblLeeftijd;

    private Label lblEmail;

    private TextField txtPlayernaam;

    private TextField txtLeeftijd;

    private TextField txtEmail;

    private GridPane gridpanestyle;


    public GegevensView() {
        this.initialiseNodes();
        this.layoutNodes();
    }



    private void initialiseNodes() {
      this.btnContinue = new Button("Continue");
      this.lblPlayername = new SceneLabel("Playername: ");
      this.lblLeeftijd = new SceneLabel("Leeftijd: ");
      this.lblEmail = new SceneLabel("Email: ");
      this.txtPlayernaam = new TextField();
      this.txtLeeftijd = new TextField();
      this.txtEmail = new TextField();
      this.gridpanestyle= new GridPane();


    }

    public Button getBtnContinue() {
        return btnContinue;
    }

    public Label getLblPlayername() {
        return lblPlayername;
    }

    public Label getLblLeeftijd() {
        return lblLeeftijd;
    }

    public Label getLblEmail() {
        return lblEmail;
    }

    public TextField getTxtPlayernaam() {
        return txtPlayernaam;
    }

    public TextField getTxtLeeftijd() {
        return txtLeeftijd;
    }

    public TextField getTxtEmail() {
        return txtEmail;
    }

    public GridPane getGridpanestyle() {
        return gridpanestyle;
    }

    private void layoutNodes() {


      /*  this.getChildren().add(btnContinue);
        //this.getChildren().add(lblPlayername);
       // this.getChildren().add(lblLeeftijd);
        this.getChildren().add(lblEmail);
        this.getChildren().add(txtPlayernaam);
        this.getChildren().add(txtLeeftijd);
        this.getChildren().add(txtEmail);
*/
        gridpanestyle.add(btnContinue, 2,6);
        gridpanestyle.add(lblPlayername, 0, 0);
        gridpanestyle.add(lblLeeftijd, 0, 2);
        gridpanestyle.add(lblEmail,0,3);
        gridpanestyle.add(txtPlayernaam, 3, 0);
        gridpanestyle.add(txtLeeftijd, 3, 2);
        gridpanestyle.add(txtEmail,3,3);
        gridpanestyle.setAlignment(Pos.CENTER);
        GridPane.setHalignment(lblPlayername, HPos.RIGHT);
        GridPane.setHalignment(lblLeeftijd, HPos.RIGHT);
        GridPane.setHalignment(lblEmail, HPos.RIGHT);
        gridpanestyle.setHgap(20);
        this.getChildren().add(gridpanestyle);



/*

        this.add(btnContinue, 2,6);
        this.add(lblPlayername, 0, 0);
        this.add(lblLeeftijd, 0, 2);
        this.add(lblEmail,0,3);
        this.add(txtPlayernaam, 3, 0);
        this.add(txtLeeftijd, 3, 2);
        this.add(txtEmail,3,3);

*/

        BackgroundImage achtergrondAfbeelding = new BackgroundImage(new Image("/istockphoto-1126081792-612x612.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100,100,true,true,true, true));
        this.setBackground(new Background(achtergrondAfbeelding));
        this.setAlignment(Pos.CENTER);
    }




}
