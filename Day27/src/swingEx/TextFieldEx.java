package swingEx;

import javax.swing.*;

public class TextFieldEx {

    public static void main(String[] args) {

        JFrame frame = new JFrame("TextField Example");

        JTextField textField1 = new JTextField("Welcome to JAVA!");
        textField1.setBounds(50, 100, 200, 30);
        JTextField textField2 = new JTextField("AWT & SWING Tutorial");
        textField2.setBounds(50, 150, 200, 30);

        frame.add(textField1);
        frame.add(textField2);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
