package com.company;
import java.io.*;
import java.util.*;

public class DrawingSaverLoader {
    public void saveDrawing(){
        try {
            // open file and writing stream
            FileOutputStream streamToExternalFile = new FileOutputStream("./savedDrawing.ser");
            ObjectOutputStream objectStream = new ObjectOutputStream(streamToExternalFile);
            objectStream.writeObject(ApplicationGUI.getShapesOnTheScreen());
            objectStream.close();
            streamToExternalFile.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void loadDrawing() {
        try {
            //open file and reading stream
            FileInputStream streamToExternalFile = new FileInputStream("./savedDrawing.ser");
            ObjectInputStream objectStream = new ObjectInputStream(streamToExternalFile);

            List<Shape> savedList = (List<Shape>) objectStream.readObject();
            ApplicationGUI.updateScreenOnLoad(savedList);
            objectStream.close();
            streamToExternalFile.close();

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Catalog class not found");
            c.printStackTrace();
        }
    }
}
