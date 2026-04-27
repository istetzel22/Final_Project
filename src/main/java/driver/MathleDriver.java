package driver;

import java.io.File;

import javax.swing.SwingUtilities;

import controller.MathleController;
import model.MathleModel;
import view.AfterGameView;
import view.MathleViewAttempt;
import view.MathleViewFinalView;

public class MathleDriver {
    public static void main(String[] args) {
        final String TITLE = "Mathle";
        final int SCREEN_WIDTH = 600;
        final int SCREEN_HEIGHT = 300;
        final int AMOUNT_OF_NUMBERS = 4;

        SwingUtilities.invokeLater(
            new Runnable() {

                @Override
                public void run() {
                    MathleModel model = new MathleModel(new File("equations.txt"), AMOUNT_OF_NUMBERS);
                    MathleViewAttempt attempt1 = new MathleViewAttempt(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 1);
                    MathleViewAttempt attempt2 = new MathleViewAttempt(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 2);
                    MathleViewAttempt attempt3 = new MathleViewAttempt(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 3);
                    MathleViewAttempt attempt4 = new MathleViewAttempt(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 4);
                    MathleViewAttempt attempt5 = new MathleViewAttempt(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 5);
                    MathleViewFinalView finalView = new MathleViewFinalView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 6);
                    AfterGameView afterGameView = new AfterGameView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT);
                    new MathleController(model, attempt1, attempt2, attempt3, attempt4, attempt5, finalView, afterGameView);

                }

            }


        );

    }

}
