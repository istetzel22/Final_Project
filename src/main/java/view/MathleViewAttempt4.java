package view;

import javax.swing.JLabel;

public class MathleViewAttempt4 extends MathleView {
    public MathleViewAttempt4(String title, int screenWidth, int screenHeight) {
        super(title, screenWidth, screenHeight);
        add(new JLabel("4"), gridBag);
        add(checkButton);

    }

}