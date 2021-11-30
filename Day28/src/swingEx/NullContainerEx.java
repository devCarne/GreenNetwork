package swingEx;

import javax.swing.*;

public class NullContainerEx extends JFrame {

    NullContainerEx() {
        setTitle("레이아웃이 없는 경우");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        for(int i = 1; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.setSize(50, 20);
            button.setLocation(i * 15, i * 15);
            add(button);
        }

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}
