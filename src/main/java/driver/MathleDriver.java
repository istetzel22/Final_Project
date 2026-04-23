package driver;

import java.io.File;

import javax.swing.SwingUtilities;

import controller.MathleController;
import model.Equation;
import model.MathleModel;
import view.MathleViewAttempt1;
import view.MathleViewAttempt2;
import view.MathleViewAttempt3;
import view.MathleViewAttempt4;

public class MathleDriver {
    public static void main(String[] args) {
        final String TITLE = "Mathle";
        final int SCREEN_WIDTH = 600;
        final int SCREEN_HEIGHT = 300;

        Equation equation = new Equation(new int[] {4, 6, 10, 20}, "_+_+_=_");

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MathleViewAttempt1 attempt1  = new MathleViewAttempt1(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, equation, 1);
                MathleViewAttempt2 attempt2  = new MathleViewAttempt2(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, equation, 2);
                MathleViewAttempt3 attempt3  = new MathleViewAttempt3(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, equation, 3);
                MathleViewAttempt4 attempt4  = new MathleViewAttempt4(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, equation, 4);
                MathleModel model = new MathleModel(new File("equations.txt"), equation);
                new MathleController(model, attempt1, attempt2, attempt3, attempt4);

            }
        });
    }
}
