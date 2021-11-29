package swingEx;

import javax.swing.*;

public class FirstSwingExample {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("클릭");
        jButton.setBounds(130, 100, 100, 40);
        jFrame.add(jButton);

        jFrame.setSize(400, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
