package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MathleModel;
import view.MathleView;

public class MathleController {
    
    private MathleModel model;
    private MathleView attempt1;
    private MathleView attempt2;
    private MathleView attempt3;
    private MathleView attempt4;
    private MathleView attempt5;
    private MathleView finalView;
    
    public MathleController(MathleModel model, MathleView attempt1, MathleView attempt2, MathleView attempt3, MathleView attempt4, MathleView attempt5, MathleView finalView) {
        this.model = model;
        this.attempt1 = attempt1;
        this.attempt2 = attempt2;
        this.attempt3 = attempt3;
        this.attempt4 = attempt4;
        this.attempt5 = attempt5;
        this.finalView = finalView;
        initalizeListeners();
        attempt1.setVisible(true);
        
    }

    private void initalizeListeners() {
        checkListener checkListener = new checkListener(model, attempt1, attempt2, attempt3, attempt4, attempt5, finalView);
        attempt1.addCheckListener(checkListener);
        attempt2.addCheckListener(checkListener);
        attempt3.addCheckListener(checkListener);
        attempt4.addCheckListener(checkListener);
        attempt5.addCheckListener(checkListener);
        
    }
    
    public class checkListener implements ActionListener {
        private MathleModel model;
        private MathleView attempt1;
        private MathleView attempt2;
        private MathleView attempt3;
        private MathleView attempt4;
        private MathleView attempt5;
        private MathleView finalView;
        
        enum Views {ATTEMPT_1, ATTEMPT_2, ATTEMPT_3, ATTEMPT_4, ATTEMPT_5, FINAL_VIEW}
        
        public checkListener(MathleModel model, MathleView attempt1, MathleView attempt2, MathleView attempt3, MathleView attempt4, MathleView attempt5, MathleView finalView) {
            this.model = model;
            this.attempt1 = attempt1;
            this.attempt2 = attempt2;
            this.attempt3 = attempt3;
            this.attempt4 = attempt4;
            this.attempt5 = attempt5;
            this.finalView = finalView;
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            model.updateCurrentAttempt();

            Views currentAttempt = Views.values()[model.getCurrentAttempt()];

            switch (currentAttempt) {
                case ATTEMPT_2:
                    attempt1.findColors(attempt1, model);

                    attempt2.setColors(attempt1);

                    attempt1.setVisible(false);
                    attempt2.setVisible(true);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    attempt5.setVisible(false);
                    finalView.setVisible(false);
                    
                    break;
                case ATTEMPT_3:
                    attempt2.findColors(attempt2, model);

                    attempt3.setColors(attempt1);
                    attempt3.setColors(attempt2);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(true);
                    attempt4.setVisible(false);
                    attempt5.setVisible(false);
                    finalView.setVisible(false);

                    break;
                case ATTEMPT_4:
                    attempt3.findColors(attempt3, model);

                    attempt4.setColors(attempt1);
                    attempt4.setColors(attempt2);
                    attempt4.setColors(attempt3);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(true);
                    attempt5.setVisible(false);
                    finalView.setVisible(false);
                    
                    break;
                case ATTEMPT_5:
                    attempt4.findColors(attempt4, model);

                    attempt5.setColors(attempt1);
                    attempt5.setColors(attempt2);
                    attempt5.setColors(attempt3);
                    attempt5.setColors(attempt4);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    attempt5.setVisible(true);
                    finalView.setVisible(false);

                    break;
                case FINAL_VIEW:
                    attempt5.findColors(attempt5, model);

                    finalView.setColors(attempt1);
                    finalView.setColors(attempt2);
                    finalView.setColors(attempt3);
                    finalView.setColors(attempt4);
                    finalView.setColors(attempt5);

                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    attempt5.setVisible(false);
                    finalView.setVisible(true);

                    break;
                default:
                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    attempt5.setVisible(false);
                    finalView.setVisible(false);

                    break;

            }

        }


    }

}
