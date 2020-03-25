package com.company;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, 750, 750);
        g.setColor(Color.WHITE);
        g.fillRect(1, 1, 749, 749);
    }
}
