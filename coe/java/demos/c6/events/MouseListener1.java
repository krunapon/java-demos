import java.awt.*;
import java.awt.event.*;
import java.time.YearMonth;

import javax.swing.*;

public class MouseListener1 extends JFrame implements MouseListener {
        final int DIAMETER = 10;
        public MouseListener1(String title) {
                super(title);
        }
        public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                BlankArea panel = (BlankArea) e.getSource();
                Graphics g = panel.getGraphics();
                String str = "(" + x + "," + y + ")";
                g.drawString(str, x, y);
                g.setColor(Color.RED);
                g.fillOval(x, y, DIAMETER, DIAMETER);
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public static void main(String[] args) {
                MouseListener1 ml = new MouseListener1("Mouse Listener1");
                BlankArea blankArea = new BlankArea(Color.YELLOW);
                blankArea.addMouseListener(ml);
                ml.setVisible(true);
                ml.setContentPane(blankArea);
                ml.setSize(new Dimension(500, 400));
                ml.setLocationRelativeTo(null);
        }
}