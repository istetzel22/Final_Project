package model;
import java.io.File;
import model.Equation;

public class MathleModel {
    private File fileLocation;
    private Equation equation;
    private Equation[] equationArray;
    private int currentAttempt;

    
    public MathleModel(File fileLocation) {
        this.fileLocation = fileLocation;
        
    }

    public Equation getEquation() {
        return equation;
    }

    public void setEquation(Equation equation) {
        this.equation = equation;
    }

    public int getCurrentAttempt() {
        return currentAttempt;
    }

    public void updateCurrentAttempt() {
        currentAttempt++;
    }

    public void readEquationList() {
        //TODO: create this method

    }
    
}
