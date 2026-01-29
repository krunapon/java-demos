//package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameDemo1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("683040136-5");
        JPanel buttonsPanel = new JPanel();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JLabel label = new JLabel("Natchanon: ");
        JButton PadThai = new JButton("Pad Thai");
        JButton SomTum = new JButton("Som Tum");
        JButton TomYum = new JButton("Tom Yum");

        buttonsPanel.add(label);
        buttonsPanel.add(PadThai);
        buttonsPanel.add(SomTum);
        buttonsPanel.add(TomYum);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(buttonsPanel);
        frame.setLocation(200, 150);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }
}