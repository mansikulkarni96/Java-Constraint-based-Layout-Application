package i6_layoutDemo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * FlowPanelDemo makes a panel with a specific layout manager
 * and a defined set of sub-components.  This can be relatively simple.
 * I only made this a separate class to make the code more modular and hopefully simplify 
 * your code later.
 * 
 */
public class BorderPanelDemo extends JPanel {
   // private JTextField fieldMessage;
    JPanel container;
   // private JTextArea textArea;
    public BorderPanelDemo(){
       
      JButton next= new JButton("Next");
      JButton prev= new JButton("Previous");
      JButton book=new JButton("Book");
        setLayout(new BorderLayout());
        add(new JLabel("Check Available Rides"),BorderLayout.NORTH);
        add(next,BorderLayout.EAST);
        add(prev,BorderLayout.WEST);
        add(new JLabel("Travel-Mate Copyright 2018"),BorderLayout.SOUTH);
        
        JPanel j= new JPanel();
        j.setLayout(new BorderLayout());
        
        JLabel img= new JLabel();
        
        JTextArea area= new JTextArea("Ride offered by Mansi, Price:$10,\n contact:8572948427\n Ride from Northeastern to Andover\n Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus ex nunc, interdum ut felis vel, rhoncus eleifend purus. Morbi arcu lectus, semper quis quam eu, ullamcorper sodales risus. Nunc ultricies ligula eget elit fringilla, vel pharetra mi luctus. Pellentesque nec magna at mi condimentum gravida. Nulla vel tortor sit amet odio tempor posuere. Nulla facilisi. Sed non ipsum interdum, pulvinar dui vitae, pharetra magna. Nunc pulvinar massa ac congue volutpat.\n" +
"\n" +
"Nulla at purus neque. ");
        area.setWrapStyleWord(true);
        JScrollPane scroll= new JScrollPane(area);
        
        
     ImageIcon icon= new ImageIcon(getClass().getResource("car1.jpg"));
     img.setIcon(icon);
      //j.add(img,BorderLayout.NORTH);
      j.add(scroll,BorderLayout.CENTER);
      j.add(book,BorderLayout.EAST);
     add(j,BorderLayout.CENTER);
     prev.addActionListener(new ActionListener() {
           @Override
         public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "No more rides", "Information", JOptionPane.INFORMATION_MESSAGE);
         }
      });
     next.addActionListener(new ActionListener() {
           @Override
         public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null, "No more rides", "Information", JOptionPane.INFORMATION_MESSAGE);
         }
      });
     book.addActionListener(new ActionListener() {
           @Override
         public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null, "Sucessfully Booked", "Success", JOptionPane.INFORMATION_MESSAGE);
         }
      });
     
     
     
     
     
     
     
     
     /*
      btn1.addActionListener(new ActionListener() {
           @Override
         public void actionPerformed(ActionEvent e) {
            if (!jd.isVisible()) {
               jd.setVisible(true);
               JLabel lb2=new JLabel("Ride offered by Mansi, Price:$10, contact:8572948427");
               lb2.setAlignmentY(20);
               jd.add(lb2);              
            }
         }
      });*/

      
      
      
}}
