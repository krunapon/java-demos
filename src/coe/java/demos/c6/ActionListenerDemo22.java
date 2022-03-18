package coe.java.demos.c6;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerDemo22 extends SimpleWindow22 implements
    ActionListener {
    protected JTextField numClicksTxt;
    protected JButton numClicksButton;
    protected int numClicks;
    protected JPanel mainPanel;
    public ActionListenerDemo22(String title) {
        super(title);
        numClicks = 0;
    }

    public void addComponents() {
        numClicksButton = new JButton("Clicks me");
        numClicksTxt = new JTextField(20);
        mainPanel = new JPanel();
        mainPanel.add(numClicksButton);
        mainPanel.add(numClicksTxt);
        this.add(mainPanel);
    }

    public void actionPerformed(ActionEvent e) {
        numClicks++;
        numClicksTxt.setText("Button clicked " + numClicks + " times");
    }
    public void addListeners() {
        numClicksButton.addActionListener(this);
    }
    public static void createAndShowGUI() {
        ActionListenerDemo22 actionDemo = new ActionListenerDemo22("Action Listener Demo");
        actionDemo.addComponents();
        actionDemo.addListeners();
        actionDemo.setFeatures();
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
