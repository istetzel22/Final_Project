package list;

import model.Equation;

public class EquationListCreatorDriver {
    public static void main(String[] args) {
    
        try {
            
            EquationListCreator equationListCreator = new EquationListCreator(3, -5, 20, 4, Equation.FOUR_NUMBER_VAILD_ARRAYS);

            Equation[] equationList = equationListCreator.createEquationList();

            System.out.println(Equation.printEquations(equationList));


        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        
        
    }
    

}
