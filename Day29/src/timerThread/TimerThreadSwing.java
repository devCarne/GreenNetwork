package timerThread;

import javax.swing.*;
import java.awt.*;

public class TimerThreadSwing extends JFrame {

    TimerThreadSwing() {
        setTitle("Thread in Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Gothic", Font.ITALIC, 80));
        container.add(label);

        TimerThread timerThread = new TimerThread(label);

        timerThread.start();

        setSize(300, 300);
        setVisible(true);
    }
}
