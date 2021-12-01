package flicker.flickerWidget;

import javax.swing.*;
import java.awt.*;

public class FlickerLabelWidget extends JLabel implements Runnable {

    private long delay;
    private Color flickerFirstColor;
    private Color flickerSecondColor;

    FlickerLabelWidget(String flickStr, Long delay) {
        this(flickStr, delay, Color.YELLOW, Color.GREEN);
    }

    FlickerLabelWidget(String flickStr, Long delay, Color flickerFirstColor, Color flickerSecondColor) {
        super(flickStr);
        this.delay = delay;
        this.flickerFirstColor = flickerFirstColor;
        this.flickerSecondColor = flickerSecondColor;

        Thread thread = new Thread(this);
    }

    @Override
    public void run() {

    }
}
