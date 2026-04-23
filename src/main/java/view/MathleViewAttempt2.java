package view;

import javax.swing.JLabel;

import model.Equation;

public class MathleViewAttempt2 extends MathleView {
    public MathleViewAttempt2(String title, int screenWidth, int screenHeight, Equation equation) {
        super(title, screenWidth, screenHeight, equation);
        add(new JLabel("2"), gridBag);
        add(checkButton);

    }

}