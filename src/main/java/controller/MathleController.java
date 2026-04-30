package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import driver.MathleDriver;
import model.MathleModel;
import view.AfterGameView;
import view.MathleView;
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
        RestartListener restartListener = new RestartListener(model, afterGameView);

        attempt1.addListener(checkListener);
        attempt2.addListener(checkListener);
        attempt3.addListener(checkListener);
        attempt4.addListener(checkListener);
        attempt5.addListener(checkListener);
        finalView.addListener(checkListener);
        afterGameView.addRestartListener(restartListener);
        
    }

    public class RestartListener implements ActionListener {

        private MathleModel model;
        private AfterGameView afterGameView;

        public RestartListener(MathleModel model, AfterGameView afterGameView) {
            this.model = model;
            this.afterGameView = afterGameView;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setCurrentAttempt(0);
            
            attempt1.removeAll();
            attempt2.removeAll();
            attempt3.removeAll();
            attempt4.removeAll();
            attempt5.removeAll();
            finalView.removeAll();
            afterGameView.removeAll();

            attempt1.dispose();
            attempt2.dispose();
            attempt3.dispose();
            attempt4.dispose();
            finalView.dispose();
            afterGameView.dispose();
            
            MathleDriver.createInstance();
            
        }
        
        
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
            
            MathleView.updateViews(attempt1, attempt2, attempt3, attempt4, attempt5, finalView, afterGameView, model);

            

        }


    }

}
