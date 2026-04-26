package view;

import model.Equation;

public class MathleViewAttempt extends MathleView {

    public MathleViewAttempt(String title, int screenWidth, int screenHeight, Equation equation, int currentAttempt) {
        super(title, screenWidth, screenHeight, equation, currentAttempt);
        add(super.checkButton, gridBag);

    }

}
