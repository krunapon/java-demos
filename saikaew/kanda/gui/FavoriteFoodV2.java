package saikaew.kanda.gui;

import javax.swing.*;
import java.awt.*;

public class FavoriteFoodV2 extends FavoriteFoodV1 {
    protected JTextField nameTextField;
    protected String name = "Manee";
    protected JPanel namePanel;
    protected JPanel foodButtonsPanel;

    public FavoriteFoodV2(String title) {
        super(title);
    }

    public void addComponents(Container container) {
        super.addComponents(container);
        nameTextField = new JTextField(name, 15);
        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        container.setLayout(new BorderLayout());
        container.add(namePanel, BorderLayout.NORTH);

        foodButtonsPanel = new JPanel();
        foodButtonsPanel.add(food1Button);
        foodButtonsPanel.add(food2Button);
        foodButtonsPanel.add(food3Button);
        container.add(foodButtonsPanel, BorderLayout.SOUTH);

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