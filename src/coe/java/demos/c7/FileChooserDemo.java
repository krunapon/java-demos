package coe.java.demos.c7;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileChooserDemo extends JFrame implements ActionListener {
   /**
	 * 
	 */
	private static final long serialVersionUID = -8996328180854341895L;
private JEditorPane jep = new JEditorPane();
   public FileChooserDemo() {
      super("Editor");
      Container cp = getContentPane( );
      cp.add(new JScrollPane(jep), BorderLayout.CENTER);
      JMenu menu = new JMenu("File");
      menu.add(make("Open")); menu.add(make("Save"));
      menu.add(make("Quit"));
      JMenuBar menuBar = new JMenuBar();
      menuBar.add(menu); setJMenuBar(menuBar);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(200,300);
   }

   public void actionPerformed(ActionEvent e) {
      String ac = e.getActionCommand();
      if(ac.equals("Open")) openFile();
      else if(ac.equals("Save")) saveFile();
      else if(ac.equals("Quit")) System.exit(0);
   }

   private void openFile() {
      JFileChooser jfc = new JFileChooser();
      int result = jfc.showOpenDialog(this);
      if(result == JFileChooser.CANCEL_OPTION) return;
      try {
         File file = jfc.getSelectedFile();
         BufferedReader br = new BufferedReader(new FileReader(file));
         String s=""; int c=0;
         while((c=br.read())!=-1) s+=(char)c;
         br.close(); jep.setText(s);
      } catch (Exception e) {
         JOptionPane.showMessageDialog(this,e.getMessage(),
         "File error",JOptionPane.ERROR_MESSAGE);}
   }

   private void saveFile( ) {
      JFileChooser jfc = new JFileChooser();
      int result = jfc.showSaveDialog(this);
      if(result == JFileChooser.CANCEL_OPTION) return;
      File file = jfc.getSelectedFile();
      try {
         BufferedWriter bw = new BufferedWriter(new FileWriter(file));
         bw.write(jep.getText());
         bw.close();
      }
      catch (Exception e) {
         JOptionPane.showMessageDialog(
            this,
            e.getMessage(),
            "File Error",
            JOptionPane.ERROR_MESSAGE
         );
      }
   }

   private JMenuItem make(String name) {
      JMenuItem m = new JMenuItem(name);
      m.addActionListener(this);
      return m;
   }

   public static void main(String[] args) {
      new FileChooserDemo().setVisible(true);}
}
