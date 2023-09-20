package GraphicalUserInterface;

import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");
        JLabel helloLabel = new JLabel("Hello World from GUI!");
        frame.add(helloLabel);
        frame.setLayout(null);
        helloLabel.setBounds(30, 20, 200, 20);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
