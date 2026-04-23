package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MathleModel;
import view.MathleView;
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
    private MathleView finalView;
    
    public MathleController(MathleModel model, MathleViewAttempt1 attempt1, MathleViewAttempt2 attempt2, MathleViewAttempt3 attempt3, MathleViewAttempt4 attempt4, MathleView finalView) {
        this.model = model;
        this.attempt1 = attempt1;
        this.attempt2 = attempt2;
        this.attempt3 = attempt3;
        this.attempt4 = attempt4;
        this.finalView = finalView;
        initalizeListeners();
        attempt1.setVisible(true);
        
    }

    private void initalizeListeners() {
        checkListener checkListener = new checkListener(model, attempt1, attempt2, attempt3, attempt4, finalView);
        attempt1.addCheckListener(checkListener);
        attempt2.addCheckListener(checkListener);
        attempt3.addCheckListener(checkListener);
        attempt4.addCheckListener(checkListener);
        
    }
    
    public class checkListener implements ActionListener {
        private MathleModel model;
        private MathleView attempt1;
        private MathleView attempt2;
        private MathleView attempt3;
        private MathleView attempt4;
        private MathleView finalView;
        
        enum Views {ATTEMPT_1, ATTEMPT_2, ATTEMPT_3, ATTEMPT_4, FINAL_VIEW}
        
        public checkListener(MathleModel model, MathleView attempt1, MathleView attempt2, MathleView attempt3, MathleView attempt4, MathleView finalView) {
            this.model = model;
            this.attempt1 = attempt1;
            this.attempt2 = attempt2;
            this.attempt3 = attempt3;
            this.attempt4 = attempt4;
            this.finalView = finalView;
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            model.updateCurrentAttempt();

            Views currentAttempt = Views.values()[model.getCurrentAttempt()];

            switch (currentAttempt) {
                case ATTEMPT_1:
                    attempt1.findColors(attempt1, model);

                    attempt1.setColors(attempt1);
                    
                    attempt1.setVisible(true);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    finalView.setVisible(false);
                    
                    break;
                case ATTEMPT_2:
                    attempt2.findColors(attempt1, model);

                    attempt2.setColors(attempt1);
                    attempt2.setColors(attempt2);

                    attempt1.setVisible(false);
                    attempt2.setVisible(true);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    finalView.setVisible(false);
                    
                    break;
                case ATTEMPT_3:
                    attempt3.findColors(attempt2, model);

                    attempt3.setColors(attempt1);
                    attempt3.setColors(attempt2);
                    attempt3.setColors(attempt3);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(true);
                    attempt4.setVisible(false);
                    finalView.setVisible(false);

                    break;
                case ATTEMPT_4:
                    attempt4.findColors(attempt3, model);

                    attempt4.setColors(attempt1);
                    attempt4.setColors(attempt2);
                    attempt4.setColors(attempt3);
                    attempt4.setColors(attempt4);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(true);
                    finalView.setVisible(false);

                    break;
                case FINAL_VIEW:
                    finalView.findColors(attempt3, model);

                    finalView.setColors(attempt1);
                    finalView.setColors(attempt2);
                    finalView.setColors(attempt3);
                    finalView.setColors(attempt4);
                    finalView.setColors(finalView);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    finalView.setVisible(true);

                default:
                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);

                    break;

            }

        }


    }

}
