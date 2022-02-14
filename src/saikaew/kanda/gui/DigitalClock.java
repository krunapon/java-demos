import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class DigitalClock extends JFrame implements ActionListener {
    JLabel  l1 = new JLabel();
    Timer  t;
    public  DigitalClock() {
        super("Digital Clock");
        l1.setFont( new Font("Verdana",Font.BOLD,30) );
        l1.setHorizontalAlignment( JLabel.CENTER);
        t = new Timer(1000,this);
        t.start();
        getContentPane().add(l1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
        // call actionPerformed to get Time at the startup
        actionPerformed(null);
    }
    public void actionPerformed(ActionEvent evt)  {
        l1.setText( new Date().toString().substring(11,19));
    }
    public static void main(String args[]) {
        new DigitalClock();
    }
} // end of class
