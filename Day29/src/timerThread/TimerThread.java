package timerThread;

import javax.swing.*;

public class TimerThread extends Thread {

    private JLabel label;

    public TimerThread(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            label.setText(Integer.toString(i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            i++;
        }
    }
}
