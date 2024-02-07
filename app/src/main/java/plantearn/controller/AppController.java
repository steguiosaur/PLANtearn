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

        // Add action listeners to the buttons
        this.theView.addGardenButtonListener(new GardenButtonListener());
        this.theView.addTasksButtonListener(new TasksButtonListener());
        this.theView.addHistoryButtonListener(new HistoryButtonListener());
    }

    // Inner classes to handle button clicks
    class GardenButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.showGardenPanel();
        }
    }

    class TasksButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.showTasksPanel();
        }
    }

    class HistoryButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.showHistoryPanel();
        }
    }
}

