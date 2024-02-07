package plantearn.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGardenView extends JPanel {
    public MyGardenView() {
        this.setBackground(Color.decode("#dfe49b"));
        this.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("My Garden");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 90));
        titleLabel.setForeground(Color.decode("#223322"));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titleLabel, BorderLayout.NORTH);

        initializePlantItems();
    }

    private void initializePlantItems() {
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(new GridLayout(0, 3));

        // Set preferred size for buttons
        Dimension buttonSize = new Dimension(100, 50);

        if (databaseIsEmpty()) {
            // Add a button to open AddPlant class panel
            JButton addButton = new JButton("Add Plant");
            addButton.setPreferredSize(buttonSize);
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Open AddPlant class panel or perform relevant action
                    // You should replace the following line with the code to open the AddPlant panel
                    System.out.println("Open AddPlant class panel");
                }
            });
            contentPanel.add(addButton);
        } else {
            // Add button-like components to contentPanel (example)
            for (int i = 0; i < 20; i++) {
                JButton button = new JButton("Button " + (i + 1));
                button.setPreferredSize(buttonSize);
                contentPanel.add(button);
            }

            // Add the same button at the last part of the plant buttons
            JButton addButton = new JButton("Add Plant");
            addButton.setPreferredSize(buttonSize);
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Open AddPlant class panel or perform relevant action
                    // You should replace the following line with the code to open the AddPlant panel
                    System.out.println("Open AddPlant class panel");
                }
            });
            contentPanel.add(addButton);
        }

        // Add contentPanel to a JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane, BorderLayout.CENTER);
    }

    // Method to simulate checking database for values
    private boolean databaseIsEmpty() {
        return true;
    }
}

