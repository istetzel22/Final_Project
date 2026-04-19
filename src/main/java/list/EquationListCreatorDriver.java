package list;

import model.Equation;

public class EquationListCreatorDriver {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 1, 1};
    
        try {
            // Equation onePlusOne = new Equation(intArray, "_+_-_=_");

            // System.out.println(onePlusOne.printEquation());
            // System.out.println(onePlusOne.evaluateFourDigit());


            EquationListCreator equationListCreator = new EquationListCreator(5, -5, 20, 4, Equation.FOUR_NUMBER_VAILD_ARRAYS);

            Equation[] equationList = equationListCreator.createEquationList();

            System.out.println(Equation.printEquations(equationList));


        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        
        
    }
    

}
