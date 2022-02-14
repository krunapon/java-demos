import javax.swing.*;
import java.awt.*;

public class MyFood extends JFrame {
    JPanel buttonsPanel, namePanel;
    public MyFood() {
        super("642-28-5829");
    }

    public void addComponents() {
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTxt = new JTextField("Kanda", 15);
        JPanel mainPanel = (JPanel) this.getContentPane();
        JButton food1Button = new JButton("Orange");
        JButton food2Button = new JButton("Pomelo");
        JButton food3Button = new JButton("Mango");

        mainPanel.setLayout(new BorderLayout());
        namePanel = new JPanel();
        buttonsPanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxt);
        buttonsPanel.add(food1Button);
        buttonsPanel.add(food2Button);
        buttonsPanel.add(food3Button);

        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFood window = new MyFood();
        window.addComponents();
        window.setFrameFeatures();
    }
}
