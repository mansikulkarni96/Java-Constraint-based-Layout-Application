package i6_layoutDemo;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.*;

/**
 * This is a bare-bones framework from which you can make your components and layout managers
 * You can also create a layout using NetBeans like you did for I4.
 * Feel free to edit to your heart's content.
 * @author spragued
 */
public class I6_LayoutDemo extends JFrame implements ActionListener{

    //////////////////////
    // Member Variables
    JTextArea instructionBox;
    JPanel flowPanel;
    JPanel borderPanel;
    JPanel gridPanel;
    JPanel control;
    
     
    public I6_LayoutDemo() {
        initComponents();
        
        // Add the istructions to the text area
        InputStream in = getClass().getResourceAsStream("instructions.txt");
        try {
            instructionBox.read(new InputStreamReader(in), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void initComponents() {
        JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
        
        //TODO: All of these tabs should be filled in and use a different layout manager
        //(Flow, Border and Grid).  
        // 1) Set the Layout manager for each container. 
        // 2) Add components (buttons, radio buttons, labels, etc)  to each 
        //    component to show off your layout managers.
        flowPanel = new FlowPanelDemo();
        borderPanel = new BorderPanelDemo();
        gridPanel = new GridPanelDemo();
        control= new Control();
        // The test panel below provides examples of how the layout managers can be used.
        JPanel testPanel = new JPanel();

        jTabbedPane1.addTab("Flow Layout", flowPanel);
        jTabbedPane1.addTab("Border Layout", borderPanel);
        jTabbedPane1.addTab("Grid Layout", gridPanel);
        jTabbedPane1.addTab("Animation + Control", control);
        jTabbedPane1.addTab("Sample Layout", testPanel);
        
        // Add a button to handle the modal dialog.  Make it right justified on the bottom
        // using an embedded flow layout.
        JButton popupButton = new JButton();
        popupButton.setText("Press to Get the Party Started");
        popupButton.addActionListener(this);
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        southPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        southPanel.add(popupButton);

        
        //TODO: Can you provide a container that ensures resizing doesn't clip the text?
        // Users should be able to read the text no matter what the size of the main frame
        // provided the size is reasonable (100 x 100 pixels for example)
        instructionBox = new JTextArea();
        instructionBox.setColumns(20);
        instructionBox.setLineWrap(true);
        instructionBox.setRows(5);
        instructionBox.setWrapStyleWord(true);
        instructionBox.setEditable(false);
        
        testPanel.setLayout(new BorderLayout());
        testPanel.add(instructionBox, BorderLayout.CENTER);
        testPanel.add(southPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(jTabbedPane1);

        pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
          I6_LayoutDemo layoutDemo = new I6_LayoutDemo();
          layoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          layoutDemo.setSize(800, 400);
          layoutDemo.setVisible(true);
      });
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //Custom button text:  Feel free to modify.
        Object[] options = {"Yes",
                            "Yes"};
        int n = JOptionPane.showOptionDialog(this,
            "Are you having fun yet?", "Party Popup",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
    }
}
