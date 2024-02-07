package plantearn.view;

import java.awt.*;
//import java.awt.event.ActionListener;
import javax.swing.*;

public class AppView extends JFrame {
    private JButton gardenButton;
    private JButton tasksButton;
    private JButton historyButton;

    private JPanel imageContainerPanel;
    private JLabel nameContainerLabel;
    private JLabel currentPageLabel;

    public AppView() {
        this.setTitle("PLANtearn");
        this.setSize(950, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.initializeMenu();
        this.initializeSidePanel();
        this.initializeFieldPanel();
    }

    public void setCurrentPageLabel(String newCurrentPageLabel) {
        this.currentPageLabel.setText(newCurrentPageLabel);
    }

    private void initializeMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuGarden = new JMenu("Garden");
        JMenu menuTask = new JMenu("Task");
        JMenu menuHistory = new JMenu("History");
        JMenu menuHelp = new JMenu("Help");
        JMenu menuAbout = new JMenu("About");

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));

        menuGarden.add(exitItem);

        menuBar.add(menuGarden);
        menuBar.add(menuTask);
        menuBar.add(menuHistory);
        menuBar.add(menuHelp);
        menuBar.add(menuAbout);

        this.getContentPane().add(BorderLayout.NORTH, menuBar);
    }

    private void initializeSidePanel() {
        JPanel sidePanel = new JPanel(new GridLayout(7, 1));
        sidePanel.setPreferredSize(new Dimension(this.getWidth()/4, this.getHeight()));
        sidePanel.setBackground(Color.decode("#3d550c"));

        JLabel titleLabel = new JLabel("PLANtearn");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 34));
        titleLabel.setForeground(Color.decode("#ddeedd"));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sidePanel.add(titleLabel);

        this.gardenButton = new JButton("My Garden");
        gardenButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10 ,10));
        sidePanel.add(gardenButton);

        this.tasksButton = new JButton("My Tasks");
        tasksButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10 ,10));
        sidePanel.add(tasksButton);

        this.historyButton = new JButton("My History");
        historyButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10 ,10));
        sidePanel.add(historyButton);

        this.imageContainerPanel = new JPanel();
        sidePanel.add(imageContainerPanel);

        this.nameContainerLabel = new JLabel("Insert Name");
        sidePanel.add(nameContainerLabel);

        this.getContentPane().add(BorderLayout.WEST, sidePanel);
    }

    private void initializeFieldPanel() {
        JPanel fieldPanel = new JPanel(new GridLayout(3, 1));
        fieldPanel.setBackground(Color.decode("#dfe49b"));

        this.getContentPane().add(BorderLayout.CENTER, fieldPanel);
    }
}
