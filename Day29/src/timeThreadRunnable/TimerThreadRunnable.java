package timeThreadRunnable;

import javax.swing.*;

public class TimerThreadRunnable implements Runnable{

    private JLabel label;

    public TimerThreadRunnable(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            label.setText(Integer.toString(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            i++;
        }
    }
}
