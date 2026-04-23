package view;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import model.Equation;

public class MathleView extends JFrame {
    final int INSET_DISTANCE = 10;
    final int NUM_ATTEMPTS = 4;
    final int MAX_X = 7;
    final int MAX_Y = 5;
    final int IPAD = 10;

    protected JTextField[] fields = new JTextField[] {new JTextField(), new JTextField(), new JTextField(), new JTextField()};
    protected JButton checkButton = new JButton("Check");
    protected GridBagConstraints gridBag;
    protected Equation equation;

    
    public MathleView(String title, int screenWidth, int screenHeight, Equation equation) {
        gridBag = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(INSET_DISTANCE, INSET_DISTANCE, INSET_DISTANCE, INSET_DISTANCE), IPAD, 0);
        setEquation(equation);
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        
        gridBag.gridy = 0;
        gridBag.gridx = MAX_X / 2;
        
    }

    public Equation getEquation() {
        return equation;
    }

    public void setEquation(Equation equation) {
        this.equation = equation;
    }
    
    public void addCheckListener(ActionListener listener) {
        checkButton.addActionListener(listener);
    }
    
    public int getInputBox1() throws Exception {
        if(fields[0].getText() == null) {
            throw new Exception();
        }
        return Integer.parseInt(fields[0].getText());
        
    }
    public int getInputBox2() throws Exception {
        if(fields[0].getText() == null) {
            throw new Exception();
        }
        return Integer.parseInt(fields[1].getText());
        
    }
    public int getInputBox3() throws Exception {
        if(fields[0].getText() == null) {
                throw new Exception();
        }
        return Integer.parseInt(fields[2].getText());
        
    }
    public int getInputBox4() throws Exception {
        if(fields[0].getText() == null) {
                throw new Exception();
        }
        return Integer.parseInt(fields[3].getText());
    }
    
}
