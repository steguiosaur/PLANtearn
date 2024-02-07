package plantearn.view;

import javax.swing.*;
import java.awt.*;

public class MyHistoryView extends JPanel {
    public MyHistoryView() {
        this.setBackground(Color.decode("#dfe49b"));
        this.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("My History");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 90));
        titleLabel.setForeground(Color.decode("#223322"));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titleLabel, BorderLayout.NORTH);
    }
}
