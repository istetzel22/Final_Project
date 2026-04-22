package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.MathleModel;
import view.MathleViewAttempt1;
import view.MathleViewAttempt2;
import view.MathleViewAttempt3;
import view.MathleViewAttempt4;

public class MathleController {
    private MathleModel model;
    private MathleViewAttempt1 attempt1;
    private MathleViewAttempt2 attempt2;
    private MathleViewAttempt3 attempt3;
    private MathleViewAttempt4 attempt4;

    public MathleController(MathleModel model, MathleViewAttempt1 attempt1, MathleViewAttempt2 attempt2, MathleViewAttempt3 attempt3, MathleViewAttempt4 attempt4) {
        this.model = model;
        this.attempt1 = attempt1;
        this.attempt2 = attempt2;
        this.attempt3 = attempt3;
        this.attempt4 = attempt4;
        initalizeListener();

    }

    private void initalizeListener() {
        checkListener checkListener = new checkListener(model, attempt1, attempt2, attempt3, attempt4);
        attempt1.addCheckListener(checkListener);
        attempt1.addCheckListener(checkListener);
        attempt1.addCheckListener(checkListener);
        attempt1.addCheckListener(checkListener);

    }

    public class checkListener implements ActionListener {
        private MathleModel model;
        private MathleViewAttempt1 attempt1;
        private MathleViewAttempt2 attempt2;
        private MathleViewAttempt3 attempt3;
        private MathleViewAttempt4 attempt4;


        public checkListener(MathleModel model, MathleViewAttempt1 attempt1, MathleViewAttempt2 attempt2, MathleViewAttempt3 attempt3, MathleViewAttempt4 attempt4) {
            this.model = model;
            this.attempt1 = attempt1;
            this.attempt2 = attempt2;
            this.attempt3 = attempt3;
            this.attempt4 = attempt4;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("TEST");

        }


    }

}
