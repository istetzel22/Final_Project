package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MathleModel {
    private Equation equation;
    private ArrayList<Equation> equationArray;
    private int currentAttempt;
    private File fileLocation;

    
    public MathleModel(File fileLocation, final int AMOUNT_OF_NUMBERS_IN_EQUATION) {
        this.equationArray = new ArrayList<Equation>();
        this.fileLocation = fileLocation;
        readEquationList(AMOUNT_OF_NUMBERS_IN_EQUATION);
        equation = getRandomEquationFromArrayList();
        currentAttempt = 0;
        
    }

    public MathleModel() {};

    public Equation getEquation() {
        return equation;

    }
    
    public void setEquation(Equation equation) {
        this.equation = equation;
    }
    
    public int getCurrentAttempt() {
        return currentAttempt;
    }
    
    public void setCurrentAttempt(int currentAttempt) {
        this.currentAttempt = currentAttempt;
    }

    public void updateCurrentAttempt() {
        currentAttempt++;
    }

    public void readEquationList(int AMOUNT_OF_NUMBERS_IN_EQUATION) {
        try {
            Scanner input = new Scanner(fileLocation);
            while (input.hasNextLine()) {
                String string = input.nextLine();
                equationArray.add(getEquationFromString(string, Equation.FORMAT_DELIMITER, Equation.NUMBER_DELIMITER, AMOUNT_OF_NUMBERS_IN_EQUATION));

            }
            input.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File location \"" + fileLocation + "\" not found");

        }

    }

    public Equation getRandomEquationFromArrayList() {
        Random rand = new Random();

        int index = rand.nextInt(0, equationArray.size());

        return equationArray.get(index);

    }
    
    public Equation getEquationFromString(String equationString, String formatDelimiter, String numberDelimiter, int amountOfNumbersInEquation) {
        Equation equation;
        String format = "";
        int[] numArray = new int[amountOfNumbersInEquation];
        int numArrayIndex = 0;
        int num;
        boolean reachedFormatDelimiter = false;
        try {
        for(int i = 0; i < equationString.length(); i++) {
            if(equationString.substring(i, i + 1).equals(formatDelimiter)) {
                reachedFormatDelimiter = true;
                i++;

            }

            if(!reachedFormatDelimiter) {
                format += equationString.substring(i, i + 1);

            } else {
                i++;
                if(equationString.substring(i, i + 1).equals("-")) {
                    i++;
                    num = Integer.parseInt(equationString.substring(i, i + 1));
                    numArray[numArrayIndex] = -num;
                    numArrayIndex++;

                } else {
                    num = Integer.parseInt(equationString.substring(i, i + 1));

                    if(i + 1 != equationString.length() && !equationString.substring(i + 1, i + 2).equals(numberDelimiter)) {
                        i++;
                        num *= 10;
                        num += Integer.parseInt(equationString.substring(i, i + 1));
                        
                    }
                    
                    numArray[numArrayIndex] = num;
                    numArrayIndex++;

                }

            }

        }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println(equationString);

        }

        equation = new Equation(numArray, format);

        return equation;

    }

}
