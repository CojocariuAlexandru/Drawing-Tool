package com.company;
import javax.swing.*;
import java.awt.*;

public class TitleDisplayPanel{
    private int actionAreaX;
    private int actionAreaY;
    private int actionAreaWidth;
    private int actionAreaHeigth;
    private static JLabel applicationText;

    public TitleDisplayPanel(){
        actionAreaX      = 20;
        actionAreaY      = 20;
        actionAreaWidth  = 1160;
        actionAreaHeigth = 100;

        applicationText = new JLabel("~ Draw with Alex ~", SwingConstants.CENTER);
    }

    public void drawOnScreen(JFrame mainFrame){
        applicationText.setBounds(actionAreaX, actionAreaY, actionAreaWidth, actionAreaHeigth);
        applicationText.setFont(new Font("Osaka", Font.BOLD, 40));
        mainFrame.add(applicationText);
        mainFrame.repaint();
    }

}
