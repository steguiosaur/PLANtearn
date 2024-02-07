package plantearn.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
