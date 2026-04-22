package model;
import java.io.File;

public class MathleModel {
    public Equation equation;

    public MathleModel(File fileLocation, Equation equation) {
        this.equation = equation;
    }
}
