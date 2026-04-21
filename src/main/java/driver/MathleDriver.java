package driver;

import javax.swing.SwingUtilities;
import view.MathleView;

public class MathleDriver {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                @SuppressWarnings("unused")
                MathleView view  = new MathleView("Mathle", 600, 300);
            }
        });
    }
}
