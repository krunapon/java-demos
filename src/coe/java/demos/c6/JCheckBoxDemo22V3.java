package coe.java.demos.c6;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo22V3 extends JCheckBoxDemo22 implements ItemListener {
    JLabel resultLabel;
    JTextArea resultLansTxtArea;
    JScrollPane resultLansPane;
    final static String newLine = "\n";
    public JCheckBoxDemo22V3(String title) {
        super(title);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox srcItem = (JCheckBox) e.getItemSelectable();
        String langName = srcItem.getActionCommand();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            resultLansTxtArea.append("You know well about " + langName);
        } else {
            resultLansTxtArea.append("You do not know well about " + langName);
        }
        resultLansTxtArea.append(newLine);
    }

    public void addListeners() {
        pythonChkBox.addItemListener(this);
        javaChkBox.addItemListener(this);
        cSharpChkBox.addItemListener(this);
        dartChkBox.addItemListener(this);
    }

    public void addComponents(JPanel panel) {
        super.addComponents(panel);
        JPanel aPanel = new JPanel(new BorderLayout());
        resultLabel = new JLabel("Result:");
        resultLansTxtArea = new JTextArea();
        resultLansTxtArea.setFont(new Font("SansSerif", Font.BOLD, 20));
        resultLansTxtArea.setLineWrap(true);
        resultLansPane = new JScrollPane(resultLansTxtArea);
        resultLansPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        resultLansPane.setPreferredSize(new Dimension(450,200));
        aPanel.add(resultLabel, BorderLayout.NORTH);
        aPanel.add(resultLansPane, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout());
        panel.add(languagesLabel, BorderLayout.NORTH);
        panel.add(languagesPanel, BorderLayout.CENTER);
        panel.add(aPanel, BorderLayout.SOUTH);
    }

    public static void createAndShowGUI() {
        JCheckBoxDemo22V3 window =  new JCheckBoxDemo22V3("JCheckBoxDemo");
        JPanel panel = new JPanel(); // 2.1, 3.1)
        window.addComponents(panel);
        window.add(panel);
        window.addListeners();
        window.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
