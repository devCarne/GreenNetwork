package swingEx;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerEx {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        final JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 20);

        JButton button = new JButton("여기를 눌러보세요!");
        button.setBounds(50, 100, 150, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("자바에 오신 것을 환영합니다.");
            }
        });

        frame.add(button);
        frame.add(textField);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
