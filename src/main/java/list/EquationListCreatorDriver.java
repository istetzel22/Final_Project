package list;

import java.io.File;

import model.Equation;

public class EquationListCreatorDriver {
    public static void main(String[] args) {
    
        try {
            
            EquationListCreator equationListCreator = new EquationListCreator(5000, -5, 20, 4, Equation.FOUR_NUMBER_VAILD_ARRAYS);

            equationListCreator.createEquationList();

            System.out.println(equationListCreator.writeListToFile(new File("equations.txt")));
            


        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


        
        
    }
    

}
