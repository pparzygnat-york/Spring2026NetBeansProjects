/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
/*
 * HelloWorldSwing.java requires no other files. 
 */        
import java.awt.Dimension;
import java.awt.TextArea;
import javax.swing.*;

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Hello OOP Spring 2026");
        frame.setLocation(100,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        TextArea textArea = new TextArea("Text Here", 5, 40);
        // textArea.setEditable(false);
        JLabel label = new JLabel("Hello World");
        Dimension wsd = new Dimension(600, 400);
        frame.getContentPane().add(label);
        frame.getContentPane().add(textArea);
        frame.setMinimumSize(wsd);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}