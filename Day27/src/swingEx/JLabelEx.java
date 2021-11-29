package swingEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelEx extends Frame implements ActionListener {

    JLabel label;
    JButton button;
    JTextField textField;

    JLabelEx() {

        textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        label = new JLabel();
        label.setBounds(50, 100, 250, 20);

        button = new JButton("FIND IP");
        button.setBounds(50, 150, 95, 30);
        button.addActionListener(this);

        add(textField);
        add(label);
        add(button);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String host = textField.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            label.setText("IP of " + host + " is " + ip);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        new JLabelEx();
    }
}
