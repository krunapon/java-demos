import javax.swing.*;
import java.awt.*;

public class JFrame1 {
    public static void main(String[] args) {
        JFrame window = new JFrame("GUI Test");
        JPanel buttonsPanel = (JPanel) window.getContentPane();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JButton clearButton = new JButton("Clear");
        buttonsPanel.setLayout(new GridLayout(3,2));
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);
        buttonsPanel.add(submitButton);
        buttonsPanel.add(resetButton);
        buttonsPanel.add(clearButton);
       /* buttonsPanel.add(okButton, BorderLayout.NORTH);
        buttonsPanel.add(cancelButton, BorderLayout.WEST);
        buttonsPanel.add(submitButton, BorderLayout.CENTER);
        buttonsPanel.add(resetButton, BorderLayout.EAST);
        buttonsPanel.add(clearButton, BorderLayout.SOUTH);*/
        // buttonsPanel.setLayout(new FlowLayout());
        // window.add(buttonPanel);
        // window.setContentPane(buttonsPanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}