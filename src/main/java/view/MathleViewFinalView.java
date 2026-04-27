package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Equation;

public class MathleViewFinalView extends MathleView {
    private JButton finishButton = new JButton("Finish");

    public MathleViewFinalView(String title, int screenWidth, int screenHeight, Equation equation, int currentAttempt) {
        super(title, screenWidth, screenHeight, equation, currentAttempt);
        add(finishButton, gridBag);

    }

    @Override
    public void addListener(ActionListener actionListener) {
        finishButton.addActionListener(actionListener);

    }

}
