package plantearn;

import plantearn.view.*;
import plantearn.model.*;
import plantearn.controller.*;

public class App {
    public static void main(String[] args) {
        AppView plantView = new AppView();
        AppModel plantModel = new AppModel();
        AppController plantController = new AppController(plantView, plantModel);
        plantView.setVisible(true);
    }
}
