package plantearn.view;

import javax.swing.*;
import java.awt.*;

public class MyTasksView extends JPanel {
    public MyTasksView() {
        this.setBackground(Color.decode("#dfe49b"));
        this.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("My Tasks");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 90));
        titleLabel.setForeground(Color.decode("#223322"));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titleLabel, BorderLayout.NORTH);
    }
}
