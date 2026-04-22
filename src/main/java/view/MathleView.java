package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MathleView extends JFrame {
    private JTextField[] fields = new JTextField[] {new JTextField(), new JTextField(), new JTextField(), new JTextField()};
    private JButton checkButton = new JButton("Check");

    public MathleView(String title, int screenWidth, int screenHeight) {

        GridBagConstraints gridBag = new GridBagConstraints();
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        gridBag.insets = new Insets(10, 10, 10, 10);
        
        gridBag.gridx = 2;
        gridBag.gridy = 0;
        gridBag.gridwidth = 3;
        gridBag.fill = GridBagConstraints.HORIZONTAL;
        add(new JLabel(title, JLabel.CENTER), gridBag);
        gridBag.gridy = 2;
        add(checkButton, gridBag);
        
        gridBag.ipadx = 40;
        gridBag.gridwidth = 1;
        gridBag.gridy = 1;

        for(int i = 0; i < fields.length * 2; i += 2) {
            gridBag.ipadx = 40;        
            gridBag.gridx = i;
            add(fields[i / 2], gridBag);
            gridBag.gridx = i + 1;
            gridBag.ipadx = 0;
            if(i == (fields.length - 1) * 2) {
                break;
            }
            if(i == (fields.length - 2) * 2) {
                add(new JLabel("="), gridBag);
                continue;
            }
            add(new JLabel("+"), gridBag);
        }

        setVisible(true);

    }

    public void addCheckListener(ActionListener listener) {
        checkButton.addActionListener(listener);

    }

    public int getInput1() {return Integer.parseInt(fields[0].getText());}
    public int getInput2() {return Integer.parseInt(fields[1].getText());}
    public int getInput3() {return Integer.parseInt(fields[2].getText());}
    public int getInput4() {return Integer.parseInt(fields[3].getText());}

}
