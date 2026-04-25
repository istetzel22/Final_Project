package driver;

import java.io.File;

import javax.swing.SwingUtilities;

import controller.MathleController;
import model.MathleModel;
import view.MathleView;

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
                    MathleView attempt1 = new MathleView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 1);
                    MathleView attempt2 = new MathleView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 2);
                    MathleView attempt3 = new MathleView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 3);
                    MathleView attempt4 = new MathleView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 4);
                    MathleView attempt5 = new MathleView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 5);
                    MathleView finalView = new MathleView(TITLE, SCREEN_WIDTH, SCREEN_HEIGHT, model.getEquation(), 6);
                    new MathleController(model, attempt1, attempt2, attempt3, attempt4, attempt5, finalView);
                    System.out.println(model.getEquation());

                }

            }


        );

    }

}
