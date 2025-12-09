import javax.swing.*;
import java.awt.*;

public class MyForm1 extends MyWindow {
    JLabel nameLabel;
    JTextField nameTxtField;
    JPanel namePanel, overallPanel;
    final int TXTFIELD_WIDTH = 15;
    public MyForm1(String title) {
        super(title);
    }
    public void addComponents() {
        super.addComponents();
        nameLabel = new JLabel("Name:");
        nameTxtField = new JTextField(TXTFIELD_WIDTH);
        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxtField);
        overallPanel = (JPanel) getContentPane();
        overallPanel.setLayout(new BorderLayout());
        overallPanel.add(namePanel, BorderLayout.NORTH);
        overallPanel.add(buttonsPanel, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        MyForm1 myForm1 = new MyForm1("My Form");
        myForm1.addComponents();
        myForm1.setFrameFeatures();

    }
}