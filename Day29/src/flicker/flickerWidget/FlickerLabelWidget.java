package flicker.flickerWidget;

import javax.swing.*;
import java.awt.*;

public class FlickerLabelWidget extends JLabel implements Runnable {

    private final long delay;
    private final Color flickerFirstColor;
    private final Color flickerSecondColor;

    public FlickerLabelWidget(String flickStr, Long delay) {
        this(flickStr, delay, Color.YELLOW, Color.GREEN);
    }

    public FlickerLabelWidget(String flickStr, Long delay, Color flickerFirstColor, Color flickerSecondColor) {
        super(flickStr);
        this.delay = delay;
        this.flickerFirstColor = flickerFirstColor;
        this.flickerSecondColor = flickerSecondColor;
        setOpaque(true);

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        boolean colorSwitch = true;
        while (true) {
            setBackground(colorSwitch ? flickerFirstColor : flickerSecondColor);
            colorSwitch = !colorSwitch;

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
