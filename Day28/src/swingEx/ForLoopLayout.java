package swingEx;

import javax.swing.*;
import java.awt.*;

public class ForLoopLayout extends JFrame {

    ForLoopLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(1, 10));

        for(int i = 0; i < 10; i++) {
            contentPane.add(new JButton(Integer.toString(i)));
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ForLoopLayout();
    }
}
