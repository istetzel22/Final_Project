package view;

import javax.swing.JLabel;

import model.Equation;

public class MathleViewAttempt4 extends MathleView {
    public MathleViewAttempt4(String title, int screenWidth, int screenHeight, Equation equation) {
        super(title, screenWidth, screenHeight, equation);
        add(new JLabel("4"), gridBag);
        add(checkButton);

    }

}