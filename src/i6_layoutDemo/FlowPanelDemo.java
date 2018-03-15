package i6_layoutDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * FlowPanelDemo makes a panel with a specific layout manager
 * and a defined set of sub-components.
 * 
 */
public class FlowPanelDemo extends JPanel {
    public FlowPanelDemo(){
        //TODO:
        // Set the layout manager
        // Make components and add them here
        // (you can have sub-panels with their own layout managers if  you want)
      setLayout(new FlowLayout()); 
      JPanel cont=new JPanel();
     
      
      
      //lb1.setVerticalAlignment(JLabel.TOP);
      JPanel j=new JPanel();
      //JButton btn1=new JButton("Previous Rides");
      //j.add(btn1);
      JTextField txt1=new JTextField("Downtown",15);
      j.add(new JLabel("From Location "));
      j.add(txt1);
      
      add(j,FlowLayout.LEFT);
      JPanel j1=new JPanel();
      //JButton btn2=new JButton("Current Rides");
      //j1.add(btn2);
      JTextField txt2=new JTextField("Northeastern",15);
      j.add(new JLabel("To Location "));
      j.add(txt2);
      add(j1,FlowLayout.CENTER);
      JPanel j2=new JPanel();
      JButton btn3=new JButton("Find Rides");
      j2.add(btn3);
      add(j2,FlowLayout.RIGHT);
      JDialog jd= new JDialog();
      jd.setSize(400, 200);
      JTextField txt=new JTextField();
      
      btn3.addActionListener(new ActionListener() {
           @Override
         public void actionPerformed(ActionEvent e) {
            if (!jd.isVisible()) {
               jd.setVisible(true);
               JLabel lb2=new JLabel("Ride offered by Mansi, Price:$10, contact:8572948427");
               lb2.setAlignmentY(20);
               jd.add(lb2);              
            }
         }
      });

     
      JPanel panel = new JPanel();
      panel.add(btn3);

      add(panel);
      
    }}
    

