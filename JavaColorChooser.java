import java.awt.*;        
import java.awt.event.*;  
import javax.swing.*;
import java.util.Scanner ;    
//Archived By Shadow Corps

@SuppressWarnings("serial")
public class JColorChooserDemo extends JFrame 
{
   JPanel panel;
   Color bgColor = Color.LIGHT_GRAY;  
 
   
   public JColorChooserDemo() 
   {
      panel = new JPanel(new BorderLayout());
 
      JButton btnColor = new JButton("Change Color");
      panel.add(btnColor, BorderLayout.SOUTH);
      btnColor.addActionListener(new ActionListener() 
      {
         @Override
         public void actionPerformed(ActionEvent evt)
         {
            Color color = JColorChooser.showDialog(JColorChooserDemo.this,
                  "Choose a color", bgColor);
            if (color != null) { 
               bgColor = color;
            }
            panel.setBackground(bgColor); 
         }
      });
 
      setContentPane(panel);
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("JColorChooser Demo");
      setSize(300, 200);
      setLocationRelativeTo(null);  
      setVisible(true);             
   }
 
  
   public static void main(String[] args) 
   {
      
      SwingUtilities.invokeLater(new Runnable() 
      {
         @Override
         public void run() {
            new JColorChooserDemo();  
         }
      });
   }
}
