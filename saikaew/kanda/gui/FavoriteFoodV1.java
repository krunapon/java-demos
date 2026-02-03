package saikaew.kanda.gui;

import javax.swing.*;
import java.awt.*;

public class FavoriteFoodV1 extends JFrame {

    protected JLabel nameLabel;
    protected JButton food1Button;
    protected JButton food2Button;
    protected JButton food3Button;

    private static final String myID = "683040123-4";

    public FavoriteFoodV1(String id) {
        super(id);
    }

    public void setFrameFeatures() {
        this.setTitle("Favorite Food V1");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public void addComponents(Container container) {
        nameLabel = new JLabel("Manee");
        food1Button = new JButton("Orange");
        food2Button = new JButton("Sushi");
        food3Button = new JButton("Mango");
        container.setLayout(new FlowLayout());
        container.add(nameLabel);
        container.add(food1Button);
        container.add(food2Button);
        container.add(food3Button);
    }

    public static void createAndShowGUI() {
        FavoriteFoodV1 frame = new FavoriteFoodV1(myID);
        frame.addComponents(frame.getContentPane());
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

}
