package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MathleModel;
import view.AfterGameView;
import view.MathleViewAttempt;
import view.MathleViewFinalView;

public class MathleController {
    
    private MathleModel model;
    private MathleViewAttempt attempt1;
    private MathleViewAttempt attempt2;
    private MathleViewAttempt attempt3;
    private MathleViewAttempt attempt4;
    private MathleViewAttempt attempt5;
    private MathleViewFinalView finalView;
    private AfterGameView afterGameView;
    
    public MathleController(MathleModel model, MathleViewAttempt attempt1, MathleViewAttempt attempt2, MathleViewAttempt attempt3, MathleViewAttempt attempt4, MathleViewAttempt attempt5, MathleViewFinalView finalView, AfterGameView afterGameView) {
        this.model = model;
        this.attempt1 = attempt1;
        this.attempt2 = attempt2;
        this.attempt3 = attempt3;
        this.attempt4 = attempt4;
        this.attempt5 = attempt5;
        this.finalView = finalView;
        this.afterGameView = afterGameView;
        initalizeListeners();
        attempt1.setVisible(true);
        
    }

    private void initalizeListeners() {
        checkListener checkListener = new checkListener(model, attempt1, attempt2, attempt3, attempt4, attempt5, finalView, afterGameView);
        attempt1.addListener(checkListener);
        attempt2.addListener(checkListener);
        attempt3.addListener(checkListener);
        attempt4.addListener(checkListener);
        attempt5.addListener(checkListener);
        finalView.addListener(checkListener);
        
    }
    
    public class checkListener implements ActionListener {
        private MathleModel model;
        private MathleViewAttempt attempt1;
        private MathleViewAttempt attempt2;
        private MathleViewAttempt attempt3;
        private MathleViewAttempt attempt4;
        private MathleViewAttempt attempt5;
        private MathleViewFinalView finalView;
        private AfterGameView afterGameView;
        
        enum Views {ATTEMPT_1, ATTEMPT_2, ATTEMPT_3, ATTEMPT_4, ATTEMPT_5, FINAL_VIEW, AFTER_GAME_VIEW}
        
        public checkListener(MathleModel model, MathleViewAttempt attempt1, MathleViewAttempt attempt2, MathleViewAttempt attempt3, MathleViewAttempt attempt4, MathleViewAttempt attempt5, MathleViewFinalView finalView, AfterGameView afterGameView) {
            this.model = model;
            this.attempt1 = attempt1;
            this.attempt2 = attempt2;
            this.attempt3 = attempt3;
            this.attempt4 = attempt4;
            this.attempt5 = attempt5;
            this.finalView = finalView;
            this.afterGameView = afterGameView;
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            model.updateCurrentAttempt();
            
            Views currentAttempt = Views.values()[model.getCurrentAttempt()];
            System.out.println(currentAttempt);

            switch (currentAttempt) {
                case ATTEMPT_2:
                    attempt1.findColors(attempt1, model);

                    attempt2.setColors(attempt1);

                    attempt1.setVisible(false);
                    attempt2.setVisible(true);
                    
                    break;
                case ATTEMPT_3:
                    attempt2.findColors(attempt2, model);

                    attempt3.setColors(attempt1);
                    attempt3.setColors(attempt2);


                    attempt2.setVisible(false);
                    attempt3.setVisible(true);

                    break;
                case ATTEMPT_4:
                    attempt3.findColors(attempt3, model);

                    attempt4.setColors(attempt1);
                    attempt4.setColors(attempt2);
                    attempt4.setColors(attempt3);

                    attempt3.setVisible(false);
                    attempt4.setVisible(true);
                    
                    break;
                case ATTEMPT_5:
                    attempt4.findColors(attempt4, model);

                    attempt5.setColors(attempt1);
                    attempt5.setColors(attempt2);
                    attempt5.setColors(attempt3);
                    attempt5.setColors(attempt4);


                    attempt4.setVisible(false);
                    attempt5.setVisible(true);

                    break;
                case FINAL_VIEW:
                    attempt5.findColors(attempt5, model);

                    finalView.setColors(attempt1);
                    finalView.setColors(attempt2);
                    finalView.setColors(attempt3);
                    finalView.setColors(attempt4);
                    finalView.setColors(attempt5);

                    attempt5.setVisible(false);
                    finalView.setVisible(true);
                    System.out.println(model.getEquation());

                    break;
                case AFTER_GAME_VIEW:
                    finalView.setVisible(false);
                    afterGameView.setVisible(true);

                    break;
                default:
                    attempt1.setVisible(false);
                    attempt2.setVisible(false);
                    attempt3.setVisible(false);
                    attempt4.setVisible(false);
                    attempt5.setVisible(false);
                    finalView.setVisible(false);
                    afterGameView.setVisible(false);

                    break;

            }

        }


    }

}
