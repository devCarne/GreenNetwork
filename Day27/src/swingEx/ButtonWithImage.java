package swingEx;

import javax.swing.*;

public class ButtonWithImage {

    ButtonWithImage() {
        JFrame frame = new JFrame("버튼에 이미지 표시");

        JButton button = new JButton(new ImageIcon("C:\\project\\GreenNetwork\\Day27\\src\\swingEx\\cross.png"));
        button.setBounds(130, 100, 100, 40);
        frame.add(button);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonWithImage();
    }
}
