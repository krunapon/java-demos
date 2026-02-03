package saikaew.kanda.gui;

import javax.swing.*;
import java.awt.*;

public class FavoriteFoodV2 extends FavoriteFoodV1 {
    protected JTextField nameTextField;
    protected JPanel namePanel;
    protected JPanel foodButtonsPanel;

    public FavoriteFoodV2(String id) {
        super(id);
    }

    @Override
    public void addComponents(Container container) {
        super.addComponents(container);
        namePanel = new JPanel();
        nameTextField = new JTextField("Manee", 15);
        namePanel.add(new JLabel("Name:"));
        namePanel.add(nameTextField);
        foodButtonsPanel = new JPanel();
        foodButtonsPanel.setLayout(new FlowLayout());
        foodButtonsPanel.add(food1Button);
        foodButtonsPanel.add(food2Button);
        foodButtonsPanel.add(food3Button);
        container.removeAll();
        container.setLayout(new BorderLayout());
        container.add(namePanel, BorderLayout.NORTH);
        container.add(foodButtonsPanel, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        FavoriteFoodV2 frame = new FavoriteFoodV2(myID);
        frame.addComponents(frame.getContentPane());
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}
