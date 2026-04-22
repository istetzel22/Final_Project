package list;

import java.io.File;

import model.Equation;

public class EquationListCreatorDriver {
    public static void main(String[] args) {
        // Don't change this
        int AMOUNT_OF_NUMBERS = 4;

        // You can change these
        final int NUM_EQUATIONS = 5000;
        final int MIN_NUMBER = -5;
        final int MAX_NUMBER = 20;
        final File FILE_LOCATION = new File("equations.txt");
    
        try {
            
            EquationListCreator equationListCreator = new EquationListCreator(NUM_EQUATIONS, MIN_NUMBER, MAX_NUMBER, AMOUNT_OF_NUMBERS, Equation.FOUR_DIGIT_VAILD_ARRAY);

            equationListCreator.createEquationList();
            boolean completed = equationListCreator.writeListToFile(FILE_LOCATION);

            if(completed) {
                System.out.println("Created");
            } else {
                System.out.println("Failed");
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    

}
