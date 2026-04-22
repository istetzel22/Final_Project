package view;

import javax.swing.JLabel;

public class MathleViewAttempt2 extends MathleView {
    public MathleViewAttempt2(String title, int screenWidth, int screenHeight) {
        super(title, screenWidth, screenHeight);
        add(new JLabel("2"), gridBag);
        add(checkButton);

    }

}