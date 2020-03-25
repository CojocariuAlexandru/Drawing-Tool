package com.company;
import jdk.management.resource.internal.inst.AbstractPlainDatagramSocketImplRMHooks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.WindowEvent;

public class SideOptions {
    private int undoButtonX;
    private int undoButtonY;
    private int undoButtonWidth;
    private int undoButtonHeigth;

    private int resetButtonX;
    private int resetButtonY;
    private int resetButtonWidth;
    private int resetButtonHeigth;

    private int saveButtonX;
    private int saveButtonY;
    private int saveButtonWidth;
    private int saveButtonHeigth;

    private int loadButtonX;
    private int loadButtonY;
    private int loadButtonWidth;
    private int loadButtonHeigth;

    private int exitButtonX;
    private int exitButtonY;
    private int exitButtonWidth;
    private int exitButtonHeigth;

    private JButton undoButton;
    private JButton saveButton;
    private JButton loadButton;
    private JButton resetButton;
    private JButton exitButton;
    private MouseListener mouseListener;
    private MouseListener mouseListenerReset;
    private MouseListener mouseListenerSave;
    private MouseListener mouseListenerLoad;
    private MouseListener mouseListenerExit;

    private DrawingSaverLoader drawingSaverLoader;

    public SideOptions() {
        undoButtonX = 800;
        undoButtonY = 200;
        undoButtonWidth = 200;
        undoButtonHeigth = 36;

        resetButtonX = 800;
        resetButtonY = 250;
        resetButtonWidth = 200;
        resetButtonHeigth = 36;

        saveButtonX = 800;
        saveButtonY = 600;
        saveButtonWidth = 200;
        saveButtonHeigth = 36;

        loadButtonX = 800;
        loadButtonY = 650;
        loadButtonWidth = 200;
        loadButtonHeigth = 36;

        exitButtonX = 800;
        exitButtonY = 912;
        exitButtonWidth = 200;
        exitButtonHeigth = 36;

        undoButton = new JButton("Undo");
        resetButton = new JButton("Reset");
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");
        exitButton = new JButton("Exit");
        drawingSaverLoader = new DrawingSaverLoader();

        setUpListenerUndo();
        setUpListenerSave();
        setUpListenerLoad();
        setUpListenerReset();
        setUpListenerExit();
    }

    public void drawOnScreen(JFrame mainFrame) {
        undoButton.setBounds(undoButtonX, undoButtonY, undoButtonWidth, undoButtonHeigth);
        resetButton.setBounds(resetButtonX, resetButtonY, resetButtonWidth, resetButtonHeigth);
        saveButton.setBounds(saveButtonX, saveButtonY, saveButtonWidth, saveButtonHeigth);
        loadButton.setBounds(loadButtonX, loadButtonY, loadButtonWidth, loadButtonHeigth);
        exitButton.setBounds(exitButtonX, exitButtonY, exitButtonWidth, exitButtonHeigth);

        undoButton.setFont(new Font("Serif", Font.ITALIC, 24));
        resetButton.setFont(new Font("Serif", Font.ITALIC, 24));
        saveButton.setFont(new Font("Serif", Font.ITALIC, 24));
        loadButton.setFont(new Font("Serif", Font.ITALIC, 24));
        exitButton.setFont(new Font("Serif", Font.ITALIC, 24));

        undoButton.setVisible(true);
        resetButton.setVisible(true);
        saveButton.setVisible(true);
        loadButton.setVisible(true);
        exitButton.setVisible(true);

        mainFrame.add(undoButton);
        mainFrame.add(resetButton);
        mainFrame.add(saveButton);
        mainFrame.add(loadButton);
        mainFrame.add(exitButton);
    }

    private void setUpListenerUndo(){
        mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(ApplicationGUI.getShapesOnTheScreen().size() > 0){
                     ApplicationGUI.updateScreenAfterUndo();
                }
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseWheelMoved(MouseWheelEvent e) {
            }
        };
        undoButton.addMouseListener(mouseListener);
    }

    private void setUpListenerSave(){
        mouseListenerSave = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawingSaverLoader.saveDrawing();
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseWheelMoved(MouseWheelEvent e) {
            }
        };
        saveButton.addMouseListener(mouseListenerSave);
    }

    private void setUpListenerLoad(){
        mouseListenerLoad = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawingSaverLoader.loadDrawing();
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseWheelMoved(MouseWheelEvent e) {
            }
        };
        loadButton.addMouseListener(mouseListenerLoad);
    }

    private void setUpListenerReset(){
        mouseListenerReset = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                while(ApplicationGUI.getShapesOnTheScreen().size() > 0){
                    ApplicationGUI.updateScreenAfterUndo();
                }
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseWheelMoved(MouseWheelEvent e) {
            }
        };
        resetButton.addMouseListener(mouseListenerReset);
    }

    private void setUpListenerExit(){
        mouseListenerExit = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
                ApplicationGUI.applicationFrame.dispatchEvent(new WindowEvent(ApplicationGUI.applicationFrame, WindowEvent.WINDOW_CLOSING));
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseWheelMoved(MouseWheelEvent e) {
            }
        };
        exitButton.addMouseListener(mouseListenerExit);
    }
}