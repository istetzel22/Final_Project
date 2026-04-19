package list;
import java.util.Random;

import model.Equation;

public class EquationListCreator {
    private int numEquations;
    private int minNumber;
    private int maxNumber;
    private int amountOfNumbers;
    private String[] validFormats;
    
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



    public Equation[] createEquationList() {
        Equation[] equations = new Equation[numEquations];

        Random rand = new Random();
        int[] numArray = new int[amountOfNumbers];
        String format;
        boolean isEquationEqual;

        for(int i = 0; i < numEquations; i++) {

            isEquationEqual = false;
            format = "";
            Equation equation = new Equation();

            while (!isEquationEqual) {
                for (int j = 0; j < numArray.length; j++) {
                    numArray[j] = rand.nextInt(minNumber, maxNumber + 1);
                }

                format = validFormats[rand.nextInt(0, validFormats.length)];
                isEquationEqual = true;
                equation.setFormat(format);
                equation.setNumbers(numArray);

            }

            equations[i] = equation;

        }

        return equations;

    }

}
