package coe.java.demos.c6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEventDemo extends JFrame 
	implements KeyListener, ActionListener {
	JTextArea displayArea;
	JTextField typingArea;
	JButton clearTyping, clearDisplaying;
	JPanel buttonPanel;
	static final String newline
	= System.getProperty("line.separator");
	public static void main(String[] args) {
		KeyEventDemo frame = new KeyEventDemo("KeyEventDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addComponentsToPane();
		frame.pack();
		frame.setVisible(true);
	}
	
	private void addComponentsToPane() {
	 clearTyping = new JButton("Clear Typing");
	 clearDisplaying = new JButton("Clear Area");
     clearTyping.addActionListener(this);
     clearDisplaying.addActionListener(this);
     
     typingArea = new JTextField(20);
     typingArea.addKeyListener(this);
     
     displayArea = new JTextArea();
     displayArea.setEditable(false);
     displayArea.setFont(new Font("Serif", Font.BOLD, 18));
     JScrollPane scrollPane = new JScrollPane(displayArea);
     scrollPane.setPreferredSize(new Dimension(375, 125));
     
     buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
     buttonPanel.add(clearTyping);
     buttonPanel.add(clearDisplaying);
     getContentPane().add(typingArea, BorderLayout.PAGE_START);
     getContentPane().add(scrollPane, BorderLayout.CENTER);
     getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
	}
 
	public KeyEventDemo(String name) {
     super(name);
	}

	public void keyTyped(KeyEvent e) {
		displayInfo(e, "KEY TYPED:");
	}
	public void keyPressed(KeyEvent e) {
		displayInfo(e, "KEY PRESSED:");
	}
	public void keyReleased(KeyEvent e) {
		displayInfo(e, "KEY RELEASE");
	}
	
	/** Handle the button click. */
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Clear Area")) {
        	displayArea.setText("");
        } else if (command.equals("Clear Typing")) {
        	typingArea.setText("");
        	// Return the focus to the typing area.
            typingArea.requestFocusInWindow();
        }  
    }
    
    private void displayInfo(KeyEvent e, String keyStatus){
        
        //You should only rely on the key char if the event
        //is a key typed event.
        int id = e.getID();
        String keyString;
        if (id == KeyEvent.KEY_TYPED) {
            char c = e.getKeyChar();
            keyString = "key character = '" + c + "'";
        } else {
            int keyCode = e.getKeyCode();
            keyString = "key code = " + keyCode
                    + " ("
                    + KeyEvent.getKeyText(keyCode)
                    + ")";
        }
        
        String locationString = "key location: ";
        int location = e.getKeyLocation();
        if (location == KeyEvent.KEY_LOCATION_STANDARD) {
            locationString += "standard";
        } else if (location == KeyEvent.KEY_LOCATION_LEFT) {
            locationString += "left";
        } else if (location == KeyEvent.KEY_LOCATION_RIGHT) {
            locationString += "right";
        } else if (location == KeyEvent.KEY_LOCATION_NUMPAD) {
            locationString += "numpad";
        } else { // (location == KeyEvent.KEY_LOCATION_UNKNOWN)
            locationString += "unknown";
        }
        
        displayArea.append(keyStatus + newline
                + "    " + keyString + newline
                + "    " + locationString + newline);
        displayArea.setCaretPosition(displayArea.getDocument().getLength());
    }
}

 

