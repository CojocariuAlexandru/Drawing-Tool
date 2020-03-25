package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.List;

public class ApplicationGUI{
    public static JFrame applicationFrame;
    private static TitleDisplayPanel titleDisplayPanel;
    private static GeneralOptionsPanel generalOptionsPanel;
    private static Canvas drawingCanvas;
    private static SideOptions sideOptions;
    private static List<Shape> shapesOnTheScreen;

    public ApplicationGUI(){
        setUpApplicationFrame();
        generalOptionsPanel = new GeneralOptionsPanel();
        titleDisplayPanel = new TitleDisplayPanel();
        drawingCanvas = new Canvas();
        sideOptions = new SideOptions();
        shapesOnTheScreen = new ArrayList<>();

        addComponentsToFrame();
    }
    public void startApplication(){
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                shapesOnTheScreen.add(
                        new Shape(generalOptionsPanel.getShapeSize(),
                                generalOptionsPanel.getShapeType(),
                                generalOptionsPanel.getShapeColor(),
                                e.getX(),
                                e.getY())
                );
                updateShpesOnTheScreen();
            }
            public void mouseDragged(MouseEvent e){}
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mouseMoved(MouseEvent e){}
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseWheelMoved(MouseWheelEvent e){}
        };
        drawingCanvas.addMouseListener(mouseListener);
    }

    private static void setUpApplicationFrame(){
        applicationFrame = new JFrame();
        applicationFrame.setResizable(false);
        applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        applicationFrame.setSize(1200, 1000);
        applicationFrame.setTitle("Drawing tool");
        applicationFrame.setLayout(null);
        applicationFrame.setVisible(true);
    }

    private static void addComponentsToFrame(){
        titleDisplayPanel.drawOnScreen(applicationFrame);
        generalOptionsPanel.drawOnScreen(applicationFrame);
        sideOptions.drawOnScreen(applicationFrame);

        drawingCanvas.setBounds(20, 200, 755, 755);
        applicationFrame.add(drawingCanvas);
    }

    public static List<Shape> getShapesOnTheScreen(){
        return shapesOnTheScreen;
    }

    public static void updateShpesOnTheScreen(){
        for(Shape s : shapesOnTheScreen){
            applicationFrame.add(s);
        }
        applicationFrame.add(drawingCanvas);

        applicationFrame.getContentPane().repaint();
    }

    public static void updateScreenAfterUndo(){
        for(Shape s : shapesOnTheScreen){
            applicationFrame.remove(s);
        }
        shapesOnTheScreen.remove(shapesOnTheScreen.size()-1);
        for(Shape s : shapesOnTheScreen){
            applicationFrame.add(s);
        }
        applicationFrame.add(drawingCanvas);
        applicationFrame.getContentPane().repaint();
    }

    public static void updateScreenOnLoad(List<Shape> newShapes){
        for(Shape s : shapesOnTheScreen){
            applicationFrame.remove(s);
        }
        shapesOnTheScreen = newShapes;
        for(Shape s : shapesOnTheScreen){
            applicationFrame.add(s);
        }
        applicationFrame.add(drawingCanvas);
        applicationFrame.getContentPane().repaint();
    }

}
