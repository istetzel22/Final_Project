package list;
import java.util.Random;

import model.Equation;

public class EquationListCreator {
    private int numEquations;
    private int minNumber;
    private int maxNumber;
    private int amountOfNumbers;
    private String[] validFormats;
    private Equation[] equations;
    
    public EquationListCreator(int numEquations, int minNumber, int maxNumber, int amountOfNumbers, String[] validFormats) throws Exception {
        if(numEquations < 1) {
            throw new Exception("Can't have less than 1 equation");
        }
        if(minNumber >= maxNumber) {
            throw new Exception("That's not how numbers work silly");
        }
        this.numEquations = numEquations;
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.amountOfNumbers = amountOfNumbers;
        this.validFormats = validFormats;
        equations = new Equation[numEquations];
        
    }

    public Equation[] getEquations() {
        return equations;
    }

    public int getNumEquations() {
        return numEquations;
    }
    
    public void setNumEquations(int numEquations) {
        this.numEquations = numEquations;
    }
    
    public String[] getValidFormats() {
        return validFormats;
    }
    
    public void setValidFormats(String[] validFormats) {
        this.validFormats = validFormats;
    }

    public void createEquationList() {
        Random rand = new Random();
        
        for(int i = 0; i < numEquations; i++) {
            boolean isEquationEqual = false;
            int[] numArray = new int[amountOfNumbers];
            String format = "";
            Equation equation = new Equation();

            while (!isEquationEqual) {
                for (int j = 0; j < numArray.length; j++) {
                    numArray[j] = rand.nextInt(minNumber, maxNumber + 1);

                }
                format = validFormats[rand.nextInt(0, validFormats.length)];                
                equation = new Equation(numArray, format);

                try {
                    isEquationEqual = equation.evaluateFourDigit();
                } catch (Exception e) {}

            }

            equations[i] = equation;

        }

    }

}
