package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExemple {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLaypout Exemple");
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTf = new JTextField(20);
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageTf = new JTextField(20);
        JButton btnAction = new JButton("Send");
        JLabel outputLabel = new JLabel();

        panel.add(nameLabel);
        panel.add(nameTf);
        panel.add(ageLabel);
        panel.add(ageTf);
        panel.add(btnAction);
        panel.add(outputLabel);

        btnAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(ageTf.getText()) >= 18){
                    outputLabel.setText(nameTf.getText() + " é maior de idade");
                } else {
                    outputLabel.setText(nameTf.getText() + " é menor de idade");
                }
            }
        });

        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
