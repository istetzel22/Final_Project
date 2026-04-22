package view;

import javax.swing.JLabel;

public class MathleViewAttempt3 extends MathleView {
    public MathleViewAttempt3(String title, int screenWidth, int screenHeight) {
        super(title, screenWidth, screenHeight);
        add(new JLabel("3"), gridBag);
        add(checkButton);

    }

}