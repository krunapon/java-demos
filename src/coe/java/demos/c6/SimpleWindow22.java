package coe.java.demos.c6;

import javax.swing.*;
import java.awt.event.*;

class MouseListener1 implements MouseListener {
    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {

    }
}

class MouseListener2 extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {

    }
}
public class SimpleWindow22 extends JFrame {
    protected JButton closeButton, quitButton;
    protected JPanel panel;
    protected ButtonHandler22 buttonListener; // listener object

    class ButtonHandler22 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) { // e is event object
            Object srcObj = e.getSource();
            if (srcObj == closeButton) {
                System.out.println("You click close button");
            } else if (srcObj == quitButton) {
                System.out.println("You click quit button");
            }
            System.exit(0);
        }
    }
    public SimpleWindow22(String title) {
        super(title);
        buttonListener = new ButtonHandler22();
    }

    public void addComponents() {
        closeButton = new JButton("Close"); // source object
        quitButton = new JButton("Quit");
        panel = new JPanel();
        panel.add(closeButton);
        panel.add(quitButton);
        this.add(panel);
       // this.setContentPane(panel);
        //panel = (JPanel) this.getContentPane();
        //panel.add(closeButton);
    }

    public void addListeners() {
        // specify listener object to listen to source object
        // source object has this listener object
        closeButton.addActionListener(buttonListener);
        quitButton.addActionListener(buttonListener);
    }

    public void setFeatures() {
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void createAndShowGUI() {
        SimpleWindow22 window = new SimpleWindow22("My Window");
        window.addComponents();
        window.addListeners();
        window.setFeatures();

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
