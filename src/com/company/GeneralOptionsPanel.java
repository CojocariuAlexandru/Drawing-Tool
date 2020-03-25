package com.company;
import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;

public class GeneralOptionsPanel{
    private int brushSizeX;
    private int brushSizeY;
    private int brushSizeWidth;
    private int brushSizeHeigth;

    private int brushSizeFormX;
    private int brushSizeFormY;
    private int brushSizeFormWidth;
    private int brushSizeFormHeigth;
    private Integer[] brushSizeOptions = {4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 40, 50, 60, 70};

    private int brushColorX;
    private int brushColorY;
    private int brushColorWidth;
    private int brushColorHeigth;

    private int brushColorFormX;
    private int brushColorFormY;
    private int brushColorFormWidth;
    private int brushColorFormHeigth;
    private String[] brushColorOptions = {"RED", "GREEN", "BLUE", "BLACK", "PURPLE"};

    private int brushShapeX;
    private int brushShapeY;
    private int brushShapeWidth;
    private int brushShapeHeigth;

    private int brushShapeFormX;
    private int brushShapeFormY;
    private int brushShapeFormWidth;
    private int brushShapeFormHeigth;
    private String[] brushShapeOptions = {"SQUARE", "TRIANGLE", "CIRCLE"};



    private JLabel brushSizeForm;
    private JComboBox brushSizeNumber;
    private JLabel brushColor;
    private JComboBox brushColorForm;
    private JLabel brushShape;
    private JComboBox brushShapeForm;

    public GeneralOptionsPanel(){
        brushSizeX = 20;
        brushSizeY = 130;
        brushSizeWidth = 200;
        brushSizeHeigth = 30;

        brushSizeFormX = 180;
        brushSizeFormY = 130;
        brushSizeFormWidth = 100;
        brushSizeFormHeigth = 36;

        brushColorX = 350;
        brushColorY = 130;
        brushColorWidth = 200;
        brushColorHeigth = 30;

        brushColorFormX = 520;
        brushColorFormY = 130;
        brushColorFormWidth = 200;
        brushColorFormHeigth = 36;

        brushShapeX = 750;
        brushShapeY = 130;
        brushShapeWidth = 200;
        brushShapeHeigth = 30;

        brushShapeFormX = 950;
        brushShapeFormY = 130;
        brushShapeFormWidth = 200;
        brushShapeFormHeigth = 36;

        brushSizeForm = new JLabel("Shape size:");
        brushSizeNumber = new JComboBox(brushSizeOptions);
        brushColor = new JLabel("Brush color:");
        brushColorForm = new JComboBox(brushColorOptions);
        brushShape = new JLabel("Brush shape:");
        brushShapeForm = new JComboBox(brushShapeOptions);
    }

    public void drawOnScreen(JFrame mainFrame){
        brushSizeForm.setBounds(brushSizeX, brushSizeY, brushSizeWidth, brushSizeHeigth);
        brushSizeNumber.setBounds(brushSizeFormX, brushSizeFormY, brushSizeFormWidth, brushSizeFormHeigth);
        brushColor.setBounds(brushColorX, brushColorY, brushColorWidth, brushColorHeigth);
        brushColorForm.setBounds(brushColorFormX, brushColorFormY, brushColorFormWidth, brushColorFormHeigth);
        brushShape.setBounds(brushShapeX, brushShapeY, brushShapeWidth, brushShapeHeigth);
        brushShapeForm.setBounds(brushShapeFormX, brushShapeFormY, brushShapeFormWidth, brushShapeFormHeigth);

        brushSizeForm.setFont(new Font("Serif", Font.BOLD, 30));
        brushSizeNumber.setFont(new Font("Serif", Font.BOLD, 30));
        brushColor.setFont(new Font("Serif", Font.BOLD, 30));
        brushColorForm.setFont(new Font("Serif", Font.BOLD, 30));
        brushShape.setFont(new Font("Serif", Font.BOLD, 30));
        brushShapeForm.setFont(new Font("Serif", Font.BOLD, 30));

        brushSizeForm.setVisible(true);
        brushSizeNumber.setVisible(true);
        brushColor.setVisible(true);
        brushColorForm.setVisible(true);
        brushShape.setVisible(true);
        brushShapeForm.setVisible(true);

        mainFrame.add(brushSizeForm);
        mainFrame.add(brushSizeNumber);
        mainFrame.add(brushColor);
        mainFrame.add(brushColorForm);
        mainFrame.add(brushShape);
        mainFrame.add(brushShapeForm);
        mainFrame.repaint();
    }

    public Integer getShapeSize(){
        return (Integer)brushSizeNumber.getSelectedItem();
    }
    public String getShapeType(){
        return (String)brushShapeForm.getSelectedItem();
    }
    public String getShapeColor(){
        return (String)brushColorForm.getSelectedItem();
    }

}
