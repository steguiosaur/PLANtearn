package plantearn.controller;

import plantearn.view.AppView;
import plantearn.model.AppModel;

public class AppController {

    private AppView theView;
    private AppModel theModel;

    public AppController(AppView theView, AppModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }
}
