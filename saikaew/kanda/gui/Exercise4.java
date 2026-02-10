package saikaew.kanda.gui;
import javax.swing.*;
import java.awt.*;

public class Exercise4 extends FavoriteFoodV2 {
    protected JButton okButton, cancelButton;
    protected JPanel buttonsPanel, addrPanel;
    protected JLabel addrLabel;
    protected JTextArea addrTextArea;
    protected JScrollPane addrScrollPane;

    public void addComponents(Container container) {
        super.addComponents(container);
        nameLabel.setText("Name:");
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);
        container.add(buttonsPanel, BorderLayout.SOUTH);
        addrLabel = new JLabel("Address:");
        addrTextArea = new JTextArea(5, 20);
        addrTextArea.setText("Khon Kaen University " +
        "123 Village No. 16 Mittraphap Rd.," +
        " Nai-Muang, Muang District, Khon Kaen, " +
        "Thailand 40002 Tel : (+66) 4300 9700, " +
        "(+66) 4300 2539 Fax: (+66) 4320 2216  " +
        "Email:  inbox@kku.ac.th");
         addrTextArea.append("Khon Kaen University " +
        "123 Village No. 16 Mittraphap Rd.," +
        " Nai-Muang, Muang District, Khon Kaen, " +
        "Thailand 40002 Tel : (+66) 4300 9700, " +
        "(+66) 4300 2539 Fax: (+66) 4320 2216  " +
        "Email:  inbox@kku.ac.th");
        addrTextArea.setLineWrap(true);
        addrTextArea.setWrapStyleWord(true);
        addrScrollPane = new JScrollPane(addrTextArea);
        addrPanel = new JPanel();
        addrPanel.add(addrLabel);
        addrPanel.add(addrScrollPane);
        container.add(addrPanel, BorderLayout.CENTER);
    }
    public Exercise4(String title) {
        super(title);
    }
    public static void createAndShowGUI() {
        Exercise4 frame = new Exercise4(myID);
        frame.addComponents(frame.getContentPane());
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}