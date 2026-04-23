package view;

import javax.swing.JLabel;

import model.Equation;

public class MathleViewAttempt1 extends MathleView {
    final int CURRENT_ATTEMPT = 1;

    public MathleViewAttempt1(String title, int screenWidth, int screenHeight, Equation equation) {
        super(title, screenWidth, screenHeight, equation);  
        
        for (int i = 0; i < MAX_Y; i++) {
            gridBag.gridy++;
            for (int j = 0; j < MAX_X; j++) {
                gridBag.gridx = j;
                if(j % 2 == 0) {
                    if(i == CURRENT_ATTEMPT - 1) {
                        add(fields[j / 2], gridBag);

                    } else {
                        add(new JLabel("___"), gridBag);
                    }

                } else {
                    add(new JLabel(equation.getFormat().charAt(j) + ""), gridBag);

                }
            }
               
        }
        
        gridBag.gridy++;
        gridBag.gridx = MAX_X / 2 - 1;
        gridBag.gridwidth = 3;
        add(checkButton, gridBag);
    }

}
