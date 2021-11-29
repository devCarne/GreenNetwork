package swingEx;

import javax.swing.*;

public class SimpleObjectSwingEx {

    JFrame frame;

    SimpleObjectSwingEx() {
        frame = new JFrame();

        JButton button = new JButton("클릭");
        button.setBounds(130, 100, 100, 40);
        frame.add(button);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new SimpleObjectSwingEx();

    }
}
