import javax.swing.*;
import java.awt.*;

public class MyTextArea extends MyWindow {
    JTextArea textArea;
    JScrollPane scrollPane;
    JPanel overallPanel, textPanel;
    final static int NUM_ROWS = 5;
    final static int NUM_COLS = 20;
    public MyTextArea(String title) {
        super(title);
    }
    public void addComponents() {
        super.addComponents();
        textArea = new JTextArea(NUM_ROWS, NUM_COLS);
        textArea.setText("Khon Kaen University has several events these days.");
        textArea.append("For example, the Kaset Fair started from Jan 24.");
        textArea.append("In addition, Khon Kaen Marathon will be scheduled on Jan 26");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane = new JScrollPane(textArea);
        this.add(scrollPane);
    }
    public static void main(String[] args) {
        MyTextArea myTextArea = new MyTextArea("My Text Area");
        myTextArea.addComponents();
        myTextArea.setFrameFeatures(); 
    }
}