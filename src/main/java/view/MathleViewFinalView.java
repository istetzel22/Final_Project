package view;

import javax.swing.JButton;

import model.Equation;

public class MathleViewFinalView extends MathleView {
    private JButton finishButton = new JButton("Finish");

    public MathleViewFinalView(String title, int screenWidth, int screenHeight, Equation equation, int currentAttempt) {
        super(title, screenWidth, screenHeight, equation, currentAttempt);
        add(finishButton, gridBag);


    }

}
