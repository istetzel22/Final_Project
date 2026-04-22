package controller;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

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
            GridBagConstraints gridBag = new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.CENTER,0,new Insets(0, 0, 0, 0),0,0);
            gridBag.gridx = 0;
            if(model.findColor(0, view.getInput1()) == 0) {
                view.add(new JLabel("Correct"), gridBag);
            }
            gridBag.gridx = 2;
            if(model.findColor(1, view.getInput2()) == 0) {
                view.add(new JLabel("Correct"), gridBag);
            }
            gridBag.gridx = 4;
            if(model.findColor(2, view.getInput3()) == 0) {
                view.add(new JLabel("Correct"), gridBag);
            }
            gridBag.gridx = 6;
            if(model.findColor(3, view.getInput4()) == 0) {
                view.add(new JLabel("Correct"), gridBag);
            }

            view.setVisible(true);

        }


    }

}
