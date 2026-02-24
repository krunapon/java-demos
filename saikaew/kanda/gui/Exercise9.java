package saikaew.kanda.gui;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Exercise9 extends Exercise8 {
    class ListSelectionHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel lsm = (ListSelectionModel) e.getSource();
            boolean isAdjusting = e.getValueIsAdjusting();
            if (!isAdjusting) {
                if (lsm.isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(Exercise9.this, "No hobbies");
                } else {
                    List<String> selectedHobbies = hobbiesList.getSelectedValuesList();
                    JOptionPane.showMessageDialog(Exercise9.this, "Selected hobbies:" +
                    String.join(",", selectedHobbies));
                }
            }
        }
    }
    public Exercise9(String title) {
        super(title);
    }

    public void addListeners() {
       super.addListeners();
       ListSelectionModel lsm = hobbiesList.getSelectionModel();
       lsm.addListSelectionListener(new ListSelectionHandler());
    }
    public static void createAndShowGUI() {
        Exercise9 frame = new Exercise9(myID);
        frame.addComponents(frame.getContentPane());
        frame.addMenus();
        frame.addListeners();
        frame.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}