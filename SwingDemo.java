/**
 * Created by BrokenGardener on 7/9/2017.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class PaintPanel extends JPanel{
    Insets ins;
    Random rand;

    PaintPanel(int w, int h){
        setOpaque(true);
        setBorder(
            BorderFactory.createLineBorder(Color.RED,1)
        );
        setPreferredSize(new Dimension(w,h));
        rand = new Random();
    }


protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int height=getHeight();
        int width=getWidth();
        ins=getInsets();
        for(int i=ins.left+5;i<=width-ins.right-5;i+=4){
        int h=rand.nextInt(height-ins.bottom);
        if(h<=ins.top)h=ins.top+1;
        g.drawLine(i,height-ins.bottom,i,h);
        }
}


    public void changeBorderSize(int size) {
        setBorder(
            BorderFactory.createLineBorder(Color.RED, size));
    }
}


public class SwingDemo{
    JButton jbtnMore;
    JButton jbtnSize;

    JLabel jlab;
    PaintPanel pp;
    boolean big;


    SwingDemo() {
        JFrame jfrm = new JFrame("A Button Example");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(375, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        pp = new PaintPanel(100, 100);
        jbtnMore = new JButton("Show More Data");
        jbtnSize = new JButton("Change Border Size");
        jlab = new JLabel("Press a button");
        jbtnMore.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                pp.repaint();
            }
        });
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(pp);
        jfrm.getContentPane().add(jbtnMore);
        jfrm.getContentPane().add(jbtnSize);

        big = false;

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
