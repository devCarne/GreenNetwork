package action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();

        if(button.getText().equals("Action")) {
            button.setText("액션");
        } else {
            button.setText("Action");
        }
    }
}
