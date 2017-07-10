/**
 * Created by BrokenGardener on 7/9/2017.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SwingDemo implements  ActionListener{

    JLabel jlab;

    SwingDemo(){
        JFrame jfrm = new JFrame("A Button Example");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(375, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnFirst = new JButton("First");
        JButton jbtnSecond = new JButton("Second");

        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);
        jfrm.getContentPane().add(jbtnFirst);
        jfrm.getContentPane().add(jbtnSecond);

        jlab = new JLabel("Press a button");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("First"))
            jlab.setText("First button was pressed");
        else
            jlab.setText("Second button was pressed.");
    }


    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }

        });
    }
}
