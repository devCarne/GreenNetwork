package swingEx;

import javax.swing.*;
import java.awt.*;

public class ThreeButtons extends JFrame {

    ThreeButtons() {
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.orange);
//      contentPane.setLayout(new FlowLayout());
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JButton("OK"), BorderLayout.CENTER);
        contentPane.add(new JButton("Cancel"), BorderLayout.WEST);
        contentPane.add(new JButton("Ignore"), BorderLayout.EAST);

        contentPane.add(new JButton("확인"), BorderLayout.NORTH);
        contentPane.add(new JButton("취소"), BorderLayout.SOUTH);
//        contentPane.add(new JButton("통과"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        ThreeButtons threeButtons = new ThreeButtons();
    }

}
