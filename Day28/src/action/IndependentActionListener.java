package action;

import javax.swing.*;
import java.awt.*;

public class IndependentActionListener extends JFrame {

    IndependentActionListener() {
        setTitle("Action Event Listener Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton button = new JButton("액션");
        button.addActionListener(new MyActionListener());

        container.add(button);
        setSize(250, 120);
        setVisible(true);


    }

    public static void main(String[] args) {
        new IndependentActionListener();
    }
}
