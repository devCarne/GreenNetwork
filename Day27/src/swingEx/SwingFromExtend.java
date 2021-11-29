package swingEx;

import javax.swing.*;

public class SwingFromExtend extends JFrame {

    JFrame frame;

    SwingFromExtend() {
        JButton button = new JButton("클릭");
        button.setBounds(130, 100, 100, 40);
        this.add(button);

        this.setSize(400, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new SwingFromExtend();
    }
}
