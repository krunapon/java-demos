package saikaew.kanda.gui;
import javax.swing.*;
import java.awt.*;

public class Exercise6 extends Exercise5 {
    protected JLabel hobbiesLabel;
    protected JList<String> hobbiesList;
    protected String[] hobbies = {"Gaming", "Movies", "Sports"};
    public Exercise6(String title) {
        super(title);
    }

    @Override
    public void addComponents(Container container) {
        super.addComponents(container);
        hobbiesLabel = new JLabel("Hobbies:");
        hobbiesList = new JList<String>(hobbies);
        formPanel.setLayout(new GridLayout(0,2));
        formPanel.add(hobbiesLabel);
        formPanel.add(hobbiesList);
        formPanel.revalidate();
    }
    public static void createAndShowGUI() {
        Exercise6 frame = new Exercise6(myID);
        frame.addComponents(frame.getContentPane());
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}