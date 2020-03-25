package com.company;
import java.awt.*;
import javax.swing.*;

public class Shape extends JComponent {
    private Integer shapeSize;
    private String shapeType;
    private String shapeColor;
    private int mouseClickedX;
    private int mouseClickedY;
    private int[] TriangleCoordinatesX = new int[3];
    private int[] TriangleCoordinatesY = new int[3];

    public Shape(Integer shapeSize, String shapeType, String shapeColor, int mouseClickedX, int mouseClickedY){
        this.shapeSize = shapeSize;
        this.shapeType = shapeType;
        this.shapeColor = shapeColor;
        this.mouseClickedX = mouseClickedX;
        this.mouseClickedY = mouseClickedY;
        this.setBounds(20, 200, 755, 755);
    }

    @Override
    public void paintComponent(Graphics g) {
        setGraphicsColor(g);
        if(shapeType.compareTo("SQUARE") == 0){
            g.drawRect(mouseClickedX - shapeSize/2, mouseClickedY -shapeSize/2, shapeSize, shapeSize);
        }
        else if(shapeType.compareTo("CIRCLE") == 0){
            g.drawOval(mouseClickedX - shapeSize/2, mouseClickedY -shapeSize/2, shapeSize, shapeSize);
        }
        else if(shapeType.compareTo("TRIANGLE") == 0){
            TriangleCoordinatesX[0] = mouseClickedX;
            TriangleCoordinatesX[1] = mouseClickedX-shapeSize;
            TriangleCoordinatesX[2] = mouseClickedX+shapeSize;

            TriangleCoordinatesY[0] = mouseClickedY-shapeSize;
            TriangleCoordinatesY[1] = mouseClickedY+shapeSize;
            TriangleCoordinatesY[2] = mouseClickedY+shapeSize;

            g.drawPolygon(TriangleCoordinatesX, TriangleCoordinatesY, 3);
        }
    }

    private void setGraphicsColor(Graphics g){
        if(shapeColor.compareTo("RED") == 0){
            g.setColor(Color.RED);
        }
        else if(shapeColor.compareTo("BLUE") == 0){
            g.setColor(Color.BLUE);
        }
        else if(shapeColor.compareTo("GREEN") == 0){
            g.setColor(Color.GREEN);
        }
        else if(shapeColor.compareTo("BLACK") == 0){
            g.setColor(Color.BLACK);
        }
        else if(shapeColor.compareTo("PURPLE") == 0){
            g.setColor(Color.MAGENTA);
        }
    }

    public Integer getShapeSize(){
        return shapeSize;
    }
    public String getShapeType(){
        return shapeType;
    }
    public String getShapeColor(){
        return shapeColor;
    }
}
