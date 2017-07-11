/**
 * Created by BrokenGardener on 7/9/2017.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SwingDemo implements  ActionListener{
    JTextField jtf;
    JLabel jlab;

    SwingDemo(){
        JFrame jfrm = new JFrame("A Button Example");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(375, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jtf = new JTextField(10);
        jtf.addActionListener(this);
        jfrm.getContentPane().add(jtf);

        jlab = new JLabel("Press a button");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

            jlab.setText("Coontent" + jtf.getText());

    }


    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }

        });
    }
}
