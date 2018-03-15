package i6_layoutDemo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * FlowPanelDemo makes a panel with a specific layout manager
 * and a defined set of sub-components.  This can be relatively simple.
 * I only made this a separate class to make the code more modular and hopefully simplify 
 * your code later.
 * 
 */
public class GridPanelDemo extends JPanel {
    public GridPanelDemo(){
        super();
        //TODO:
        // Set the layout manager
        // Make components and add them here
        // (you can have sub-panels with their own layout managers if  you want)
        setLayout(new GridLayout(4,1));
        JPanel j1= new JPanel();
        JPanel j2= new JPanel();
        JPanel j3= new JPanel();
        JPanel j4= new JPanel();
        
        JLabel lb1=new JLabel("Ride History");
        JLabel lb12=new JLabel(" Travelled with Amit 2/12/18  Northeastern to DownTown");
        JButton jb1=new JButton("Details");
        JLabel lb13=new JLabel(" Travelled with Ishan 2/12/18 Northeastern to Andover");
        JButton jb2=new JButton("Details");
        JLabel lb14=new JLabel(" Travelled with Samy 2/12/18  Northeastern to Burlington");
        JButton jb3=new JButton("Details");
        
        j1.add(lb1);
        j2.add(lb12);
        j3.add(lb13);
        j4.add(lb14);
        j2.add(jb1);
        j3.add(jb2);
        j4.add(jb3);
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        
        jb1.addActionListener(new ActionListener() {
            JFrame fr= new JFrame();
           
           @Override
         public void actionPerformed(ActionEvent e) {
              fr.setSize(200, 200);
               JTextArea a= new JTextArea("Travelled On: 2/01/18\nTravelled From: Northeastern To: Downtown\nPrice paid: $5\nTravelled with:Rosy and Sarthak");
               JScrollPane sc= new JScrollPane(a);
               fr.add(sc);
               fr.setVisible(true);
         }
      });
        jb2.addActionListener(new ActionListener() {
            JFrame fr= new JFrame();
           @Override
         public void actionPerformed(ActionEvent e) {
           fr.setSize(200, 200);
               JTextArea a= new JTextArea("Travelled On: 2/05/18\nTravelled From: Northeastern To: Haymarket\nPrice paid: $5\nTravelled with:Rosy and Sarthak");
               JScrollPane sc= new JScrollPane(a);
               fr.add(sc);
               fr.setVisible(true);
         }
      });
        jb3.addActionListener(new ActionListener() {
            JFrame fr= new JFrame();
           @Override
         public void actionPerformed(ActionEvent e) {
          
                fr.setSize(200, 200);
               JTextArea a= new JTextArea("Travelled On: 2/06/18\nTravelled From: Northeastern To: Andover\nPrice paid: $5\nTravelled with:Rosy and Sarthak");
               JScrollPane sc= new JScrollPane(a);
               fr.add(sc);
               fr.setVisible(true);

         }
      });
     
     
    }
}
