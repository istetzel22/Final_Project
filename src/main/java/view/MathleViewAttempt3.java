package view;

import javax.swing.JLabel;

import model.Equation;

public class MathleViewAttempt3 extends MathleView {
    public MathleViewAttempt3(String title, int screenWidth, int screenHeight, Equation equation) {
        super(title, screenWidth, screenHeight, equation);
        add(new JLabel("3"), gridBag);
        add(checkButton);

    }

}