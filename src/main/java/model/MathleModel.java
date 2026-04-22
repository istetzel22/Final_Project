package model;
import java.io.File;

public class MathleModel {
    private Equation equation;
    private int currentAttempt;
    
    public MathleModel(File fileLocation, Equation equation) {
        this.equation = equation;
        currentAttempt = 0;
        
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
    
}
