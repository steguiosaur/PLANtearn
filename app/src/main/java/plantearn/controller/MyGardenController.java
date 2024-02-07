package plantearn.controller;

import javax.swing.*;

import plantearn.view.MyGardenView;

public class MyGardenController {
    private MyGardenView view;

    public MyGardenController(MyGardenView view) {
        this.view = view;
    }

    public boolean isDatabaseEmpty() {
        return true;
    }

    public void openAddPlantPanel() {
        JFrame frame = new JFrame("Add Plant");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
