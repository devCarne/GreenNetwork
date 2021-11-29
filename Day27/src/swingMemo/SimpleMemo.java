package swingMemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMemo implements ActionListener {
    JLabel l1, l2;
    JTextArea area;
    JButton button;

    SimpleMemo() {
        JFrame frame = new JFrame("Simple Memo Ex");

        l1 = new JLabel();
        l1.setBounds(50, 25, 100, 30);
        l2 = new JLabel();
        l2.setBounds(160, 25, 100, 30);

        area = new JTextArea();
        area.setBounds(20, 75, 250, 200);

        button = new JButton("Count Words");
        button.setBounds(100, 300, 120, 30);
        button.addActionListener(this);

        frame.add(l1);
        frame.add(l2);
        frame.add(area);
        frame.add(button);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String[] words = text.split("\\s");
        l1.setText("Words : " + words.length);
        l2.setText("Characters : " + text.length());
    }
    public static void main(String[] args) {
        new SimpleMemo();
    }


}
