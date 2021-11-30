package action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTImeTable extends JFrame implements ActionListener {

    JButton[] buttons;
    JTextArea textArea;

    SwingTImeTable() {
        setTitle("스윙을 이용한 구구단");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        buttons = new JButton[9];

        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(""+ (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        textArea = new JTextArea();
        add(textArea);

        setSize(400, 450);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        int i = Integer.parseInt(button.getText());
        textArea.setText("");
        for (int j = 1; j <= 9; j++) {
            textArea.append(i + " * " + j + " = " + (i * j) + "\n");
        }

    }

    public static void main(String[] args) {
        new SwingTImeTable();
    }
}
