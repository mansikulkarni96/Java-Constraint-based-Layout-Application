/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i6_layoutDemo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mansi
 */
public class Control extends JPanel {
    
    
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    
    private ImageIcon arrayImages[];
    private int imgCount=4;
    private int currentImage=0;
    JPanel panel= new JPanel();
    
    JButton grid;
    JButton flow;
    JButton border;
    JButton clear;
    JButton show;
    public Control()
    {
        arrayImages= new ImageIcon[imgCount];
        setLayout(new BorderLayout());
        grid= new JButton("Grid Layout");
        flow= new JButton("Flow Layout");
        border= new JButton("Border Layout");
        clear= new JButton("Clear");
        show= new JButton("Show Animation");
        panel.add(grid);
        panel.add(flow);
        panel.add(border);
        panel.add(clear);
        panel.add(show);
        add(panel,BorderLayout.BEFORE_FIRST_LINE);
        
        
        for(int index=0;index<arrayImages.length;index++)
        {
            int var= index+1;
            ImageIcon i= new ImageIcon(getClass().getResource("Arrow"+var+".png"));
            arrayImages[index]= i;
        }
        
        l1= new JLabel(arrayImages[0]);
        l2= new JLabel(arrayImages[0]);
        l3= new JLabel(arrayImages[0]);
        add(l1,BorderLayout.SOUTH);
        add(l2,BorderLayout.EAST);
        add(l3,BorderLayout.WEST);
        flow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FlowLayout flowlayout=new FlowLayout();
                setLayout(flowlayout);
                validate();
            }
        });
        grid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GridLayout gridlayout=new GridLayout(4,1);
                setLayout(gridlayout);
                validate();
            }
        });
        border.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(l1);
                remove(l2);
                remove(l3);
                BorderLayout borderlayout= new BorderLayout();
                setLayout(borderlayout);
                add(l1,BorderLayout.SOUTH);
                add(l2,BorderLayout.EAST);
                add(l3,BorderLayout.WEST);
                validate();
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setVisible(false);
                l2.setVisible(false);
                l3.setVisible(false);
            }
        });
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setVisible(true);
                l2.setVisible(true);
                l3.setVisible(true);
            }
        });
        
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(currentImage==3)
            currentImage=0;
        else
            currentImage++;
        l1.setIcon(arrayImages[currentImage]);
        l2.setIcon(arrayImages[currentImage]);
        l3.setIcon(arrayImages[currentImage]);
    }
    
}
