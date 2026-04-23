package view;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Equation;

public class MathleView extends JFrame {
    public static final Color GRAY_PANNEL_COLOR = new Color(50,50,50);
    public static final Color GREEN_PANNEL_COLOR = new Color(0,200,30);
    public static final Color YELLOW_PANNEL_COLOR = new Color(155,155,30);

    final int INSET_DISTANCE = 10;
    final int NUM_ATTEMPTS = 4;
    final int MAX_X = 7;
    final int MAX_Y = 4;
    final int IPAD = 10;

    JTextField[] fields = new JTextField[] {new JTextField(), new JTextField(), new JTextField(), new JTextField()};
    Color[] fieldColors;
    JButton checkButton = new JButton("Check");
    GridBagConstraints gridBag;
    Equation equation;

    
    public MathleView(String title, int screenWidth, int screenHeight, Equation equation, int currentAttempt) {
        gridBag = new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(INSET_DISTANCE, INSET_DISTANCE, INSET_DISTANCE, INSET_DISTANCE), IPAD, 0);
        fieldColors = new Color[fields.length];
        setEquation(equation);
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        
        gridBag.gridy = 0;
        gridBag.gridx = MAX_X / 2;

        for (int y = 0; y < MAX_Y; y++) {
            gridBag.gridy++;
            for (int x = 0; x < MAX_X; x++) {
                gridBag.gridx = x;
                if(x % 2 == 0) {
                    if(y == currentAttempt - 1) {
                        add(fields[x / 2], gridBag);

                    } else if(y > currentAttempt - 1) {
                        add(new JLabel("__"), gridBag);
                        
                    }

                } else {
                    add(new JLabel(equation.getFormat().charAt(x) + ""), gridBag);

                }
            }
               
        }
        
        gridBag.gridy++;
        gridBag.gridx = MAX_X / 2 - 1;
        gridBag.gridwidth = 3;
        add(checkButton, gridBag);
        
    }

    public Color[] getFieldColors() {
        return fieldColors;
    }

    public void setFieldColors(Color[] fieldColors) {
        this.fieldColors = fieldColors;
    }

    public void setFieldColorElement(Color color, int i) {
        fieldColors[i] = color;

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

    public void setPannelColor(int x, int y) {
        System.out.println("PANNEL" + x + " " + fieldColors[x / 2]);
        JPanel panel = new JPanel();
        panel.setBackground(fieldColors[x / 2]);
        gridBag.gridx = x * 2;
        gridBag.gridy = y;
        add(panel, gridBag);

    }
    
}
