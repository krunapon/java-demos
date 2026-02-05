package saikaew.kanda.gui;
import javax.swing.*;
import java.awt.*;
public class Exercise5 extends Exercise4 {
    protected JPanel formPanel, languagesPanel, genderPanel;
    protected JLabel languagesLabel, genderLabel;
    protected JCheckBox pythonChkbox, javaChkbox, javascriptChkbox;
    protected JRadioButton maleButton, femaleButton, otherButton;
    public Exercise5(String title) {
        super(title);
    }

    public void addComponents(Container container) {
        super.addComponents(container);
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,2));
        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(addrLabel);
        formPanel.add(addrScrollPane);
        container.add(formPanel, BorderLayout.NORTH);
        container.add(buttonsPanel, BorderLayout.CENTER);

        languagesLabel = new JLabel("Languages:");
        javaChkbox = new JCheckBox("Java");
        pythonChkbox = new JCheckBox("Python");
        javascriptChkbox = new JCheckBox("JavaScript");
        languagesPanel = new JPanel();
        languagesPanel.add(javaChkbox);
        languagesPanel.add(pythonChkbox);
        languagesPanel.add(javascriptChkbox);
        formPanel.add(languagesLabel);
        formPanel.add(languagesPanel);
        
        genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");
        genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        formPanel.add(genderLabel);
        formPanel.add(genderPanel);


    }
    public static void createAndShowGUI() {
        Exercise5 frame = new Exercise5(myID);
        frame.addComponents(frame.getContentPane());
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}