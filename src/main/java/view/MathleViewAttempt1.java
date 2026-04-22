package view;

import java.awt.Font;

import javax.swing.JLabel;

public class MathleViewAttempt1 extends MathleView {
    public MathleViewAttempt1(String title, int screenWidth, int screenHeight) {
        super(title, screenWidth, screenHeight);
        add(new JLabel("1"), gridBag);
        add(checkButton);
        
    }

}
