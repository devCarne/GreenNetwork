package swingCalcuator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingCalculator implements ActionListener {

    JTextField tf1, tf2, tf3;
    JButton buttonAdd, buttonSub, buttonMul, buttonDiv;

    SimpleSwingCalculator() {
        JFrame frame = new JFrame("Simple Swing Calculator");

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);

        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);

        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(50, 200, 50, 20);
        buttonAdd.addActionListener(this);

        buttonSub = new JButton("-");
        buttonSub.setBounds(120, 200, 50, 20);
        buttonSub.addActionListener(this);

        buttonMul = new JButton("*");
        buttonMul.setBounds(190, 200, 50, 20);
        buttonMul.addActionListener(this);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(260, 200, 50, 20);
        buttonDiv.addActionListener(this);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int x = Integer.parseInt(tf1.getText());
            int y = Integer.parseInt(tf2.getText());

            if (e.getSource() == buttonAdd) {
                tf3.setText(String.valueOf(x + y));
            } else if (e.getSource() == buttonSub) {
                tf3.setText(String.valueOf(x - y));
            } else if (e.getSource() == buttonMul) {
                tf3.setText(String.valueOf(x * y));
            } else if (e.getSource() == buttonDiv) {
                tf3.setText(String.valueOf(x / y));
            }
        } catch (Exception ex) {
            tf3.setText(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        new SimpleSwingCalculator();

    }

}
