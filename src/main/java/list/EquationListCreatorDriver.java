package list;

import model.Equation;

public class EquationListCreatorDriver {
    public static void main(String[] args) {
    
        try {
            
            EquationListCreator equationListCreator = new EquationListCreator(5, -5, 20, 4, Equation.FOUR_NUMBER_VAILD_ARRAYS);

            equationListCreator.createEquationList();

            System.out.println(Equation.printEquationArray(equationListCreator.getEquations()));
            


        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        
        
    }
    

}
