package timeThreadRunnable;

import javax.swing.*;
import java.awt.*;

public class TimerThreadRunnableSwing extends JFrame{

    TimerThreadRunnableSwing() {
        setTitle("Thread in Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Gothic", Font.ITALIC, 80));
        container.add(label);

        Thread thread = new Thread(new TimerThreadRunnable(label));
        thread.start();

        setSize(300, 300);
        setVisible(true);
    }
}
