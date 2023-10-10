package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutExemple {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Exemple");
        Box horizontalBox = Box.createVerticalBox();
        Container contentpane = frame.getContentPane();

        JButton btnFIRST = new JButton("FIRST");
        JButton btnSECOND = new JButton("SECOND");
        JButton btnTHIRD = new JButton("THIRD");
        JButton btnFOURTH = new JButton("FOURTH");
        JButton btnFIFTH = new JButton("FIFTH");
        JButton btnSIXTH = new JButton("SIXTH");

        horizontalBox.add(btnFIRST);
        horizontalBox.add(btnSECOND);
        horizontalBox.add(btnTHIRD);
        horizontalBox.add(btnFOURTH);
        horizontalBox.add(btnFIFTH);
        horizontalBox.add(btnSIXTH);
        contentpane.add(horizontalBox, BorderLayout.NORTH);
        frame.setLayout(new BoxLayout(contentpane, BoxLayout.PAGE_AXIS));
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
