package driver;

import javax.swing.SwingUtilities;

import controller.MathleController;
import model.Equation;
import view.MathleView;

public class MathleDriver {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MathleView view  = new MathleView("Mathle", 600, 300);
                new MathleController(new Equation(), view);
            }
        });
    }
}
