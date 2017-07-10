/**
 * Created by BrokenGardener on 7/9/2017.
 */
import javax.swing.*;


public class SwingDemo {
    SwingDemo(){
        JFrame jfrm = new JFrame("A Simple Swing Program");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing powers the modern Java GUI");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }

        });
    }
}
