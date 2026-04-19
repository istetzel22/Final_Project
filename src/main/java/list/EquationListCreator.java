package list;

import java.util.ArrayList;
import java.util.Random;

import model.Equation;

public class EquationListCreator {
    private int numEquations;
    private int minNumber;
    private int maxNumber;
    private int amountOfNumbers;
    private String[] validFormats;
    private ArrayList<Equation> equations;
    
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

    public void createEquationList() {
        Random rand = new Random();
        equations = new ArrayList<Equation>();
        int[] numArray = new int[amountOfNumbers];

        for(int i = 0; i < numEquations; i++) {
            for(int j = 0; j < amountOfNumbers; j++) {
                numArray[j] = rand.nextInt(minNumber, maxNumber + 1);
            }

        }

    }

}
