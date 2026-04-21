package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Equation;
import view.MathleView;

public class MathleController {
    private Equation model;
    private MathleView view;

    public MathleController(Equation model, MathleView view) {
        this.model = model;
        this.view = view;
        initalizeListener();

    }

    private void initalizeListener() {
        checkListener checkListener = new checkListener(model, view);
        view.addCheckListener(checkListener);

    }

    public class checkListener implements ActionListener {
        private Equation model;
        private MathleView view;

        public checkListener(Equation model, MathleView view) {
            this.model = model;
            this.view = view;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Checked");
        }


    }

}
