package flicker.flickerWindow;

import flicker.flickerWidget.FlickerLabelWidget;

import javax.swing.*;
import java.awt.*;

public class FlickerLabelWindow extends JFrame {

    public FlickerLabelWindow() {
        setTitle("깜빡이는 레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        FlickerLabelWidget flickerLabelWidget1 = new FlickerLabelWidget("깜빡", 300L);
        JLabel jLabel = new JLabel("안깜빡");
        FlickerLabelWidget flickerLabelWidget2 = new FlickerLabelWidget("이것도 깜빡", 500L);

        container.add(flickerLabelWidget1);
        container.add(jLabel);
        container.add(flickerLabelWidget2);

        setSize(300, 150);
        setVisible(true);
    }
}

