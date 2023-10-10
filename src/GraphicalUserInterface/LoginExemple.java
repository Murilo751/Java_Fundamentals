package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class LoginExemple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JFrame frame = new JFrame("Login");
        Box loginBox = Box.createVerticalBox();
        Box actions = Box.createHorizontalBox();
        Container contentpane = frame.getContentPane();
        Container contentaction = frame.getContentPane();

        JLabel FN = new JLabel("First name");
        JTextField FirstName = new JTextField("semNome");
        JLabel A = new JLabel("Age");
        JTextField Age = new JTextField("semIdade");
        JLabel LN = new JLabel("First name");
        JTextField LastName = new JTextField("semSobreNome");
        JButton send = new JButton("Enviar");
        JButton clear = new JButton("Limpar");
        JLabel result = new JLabel("");

        loginBox.add(FN);
        loginBox.add(FirstName);
        loginBox.add(A);
        loginBox.add(Age);
        loginBox.add(LN);
        loginBox.add(LastName);
        actions.add(send);
        actions.add(clear);
        loginBox.add(result);
        contentpane.add(loginBox, BorderLayout.CENTER);
        contentaction.add(actions, BorderLayout.CENTER);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstName.setText(" ");
                Age.setText(" ");
                LastName.setText(" ");
            }
        });
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText(FirstName.getText() + "  " + Age.getText() + "  " +  LastName.getText());
            }
        });

        frame.setLayout(new BoxLayout(contentpane,  BoxLayout.PAGE_AXIS));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
