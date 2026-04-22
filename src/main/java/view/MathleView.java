package view;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MathleView extends JFrame {
    final int INSET_DISTANCE = 10;

    protected JTextField[] fields = new JTextField[] {new JTextField(), new JTextField(), new JTextField(), new JTextField()};
    protected JButton checkButton = new JButton("Check");
    GridBagConstraints gridBag;

    public MathleView(String title, int screenWidth, int screenHeight) {
        gridBag = new GridBagConstraints();
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        gridBag.insets = new Insets(INSET_DISTANCE, INSET_DISTANCE, INSET_DISTANCE, INSET_DISTANCE);
        
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
