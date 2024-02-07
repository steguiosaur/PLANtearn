package plantearn.view;

import java.awt.*;
import javax.swing.*;

public class AppView extends JFrame {
    private JButton gardenButton;
    private JButton tasksButton;
    private JButton historyButton;

    private JPanel imageContainerPanel;
    private JLabel nameContainerLabel;

    private MyGardenView panelGarden;
    private MyTasksView panelTask;
    private MyHistoryView panelHistory;

    private JPanel fieldPanel;
    private CardLayout cardLayout;

    public AppView() {
        this.setTitle("PLANtearn");
        this.setSize(950, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.initializeMenu();
        this.initializeFieldPanel();
        this.initializeSidePanel();
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

        JPanel titleTaglinePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        titleTaglinePanel.setBackground(Color.decode("#3d550c"));

        JLabel titleLabel = new JLabel("PLANtearn");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 34));
        titleLabel.setForeground(Color.decode("#ddeedd"));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleTaglinePanel.add(titleLabel);

        JLabel tagLineLabel = new JLabel("Earn the time through plant tracking");
        tagLineLabel.setFont(new Font("Arial", Font.BOLD, 10));
        tagLineLabel.setForeground(Color.decode("#ddeedd"));
        tagLineLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleTaglinePanel.add(tagLineLabel);

        sidePanel.add(titleTaglinePanel);

        this.gardenButton = new JButton("My Garden");
        gardenButton.setFont(new Font("Calibri", Font.BOLD, 12));
        sidePanel.add(gardenButton);

        this.tasksButton = new JButton("My Tasks");
        tasksButton.setFont(new Font("Calibri", Font.BOLD, 12));
        sidePanel.add(tasksButton);

        this.historyButton = new JButton("My History");
        historyButton.setFont(new Font("Calibri", Font.BOLD, 12));
        sidePanel.add(historyButton);

        gardenButton.addActionListener(e -> showPanel("panelGarden"));
        tasksButton.addActionListener(e -> showPanel("panelTask"));
        historyButton.addActionListener(e -> showPanel("panelHistory"));

        this.imageContainerPanel = new JPanel();
        imageContainerPanel.setBackground(Color.decode("#ddeedd"));
        sidePanel.add(imageContainerPanel);

        this.nameContainerLabel = new JLabel("Juan Dela Cruz");
        nameContainerLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameContainerLabel.setForeground(Color.decode("#ddeedd"));
        nameContainerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sidePanel.add(nameContainerLabel);

        this.getContentPane().add(BorderLayout.WEST, sidePanel);
    }

    private void initializeFieldPanel() {
        fieldPanel = new JPanel();
        cardLayout = new CardLayout();
        fieldPanel.setLayout(cardLayout);
        fieldPanel.setBackground(Color.decode("#dfe49b"));

        panelGarden = new MyGardenView();
        panelTask = new MyTasksView();
        panelHistory = new MyHistoryView();

        fieldPanel.add(panelGarden, "panelGarden");
        fieldPanel.add(panelTask, "panelTask");
        fieldPanel.add(panelHistory, "panelHistory");

        this.getContentPane().add(BorderLayout.CENTER, fieldPanel);
    }

    private void showPanel(String panel) {
        cardLayout.show(fieldPanel, panel);
    }
}
