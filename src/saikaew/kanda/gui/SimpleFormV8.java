package saikaew.kanda.gui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class SimpleFormV8 extends SimpleFormV7
        implements ListSelectionListener {
    ListSelectionModel lsm;

    public SimpleFormV8(String title) {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        hobbiesLst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        lsm = hobbiesLst.getSelectionModel();
    }

    public void addListeners() {
        super.addListeners();
        lsm.addListSelectionListener(this);
    }

    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        // Need to make sure that the user finishes
        // selecting
        StringBuffer message = new StringBuffer();
        if (!isAdjusting) {
            // Print the names of selected items
            List<String> selectedHobbies = hobbiesLst.getSelectedValuesList();
            int numSelected = selectedHobbies.size();
            for (int i = 0; i < numSelected; i++) {
                message.append(selectedHobbies.get(i) + " ");
            }
            JOptionPane.showMessageDialog(this, message.toString());
        }
    }
    public static void createAndShowGUI() {
        SimpleFormV8 window = new SimpleFormV8("SimpleFormV8");
        window.addComponents();
        window.addMenus();
        window.addListeners();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}