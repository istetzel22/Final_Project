package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class MathleView extends JFrame {
    private JButton testButton1 = new JButton("test 1");
    private JButton testButton2 = new JButton("test 2");
    private JButton testButton3 = new JButton("test 3");
    private JButton testButton4 = new JButton("test 4");

    public MathleView(String title, int screenWidth, int screenHeight) {
        GridBagConstraints gridBagConstraint = new GridBagConstraints();
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        add(new JLabel("Test"), gridBagConstraint);
        gridBagConstraint.gridx = 0;
        gridBagConstraint.gridy = 0;

        add(testButton1, gridBagConstraint);
        gridBagConstraint.gridx = 1;
        gridBagConstraint.gridy = 1;

        add(testButton2, gridBagConstraint);
        gridBagConstraint.gridx = 2;
        gridBagConstraint.gridy = 2;

        add(testButton3, gridBagConstraint);
        gridBagConstraint.gridx = 3;
        gridBagConstraint.gridy = 3;

        add(testButton4, gridBagConstraint);
        gridBagConstraint.gridx = 4;
        gridBagConstraint.gridy = 4;


        setSize(screenWidth, screenHeight);
        setVisible(true);

    }

}
