package be.kdg.projectbasis.view.gegevensScene;

import be.kdg.projectbasis.model.ProgrammaModel;
import be.kdg.projectbasis.view.hoofdmenu.HoofdmenuView;

public class GegevensPresenter {

    private ProgrammaModel model;
    private GegevensView view;

    public GegevensPresenter(ProgrammaModel model, GegevensView view) {
        this.model= model;
        this.view = view;
        this.addEventHandelers();
        this.updateView();

    }

    private void updateView() {
    }

    private void addEventHandelers() {



    }

    public void addWindowEventHandlers() {

    }
}
