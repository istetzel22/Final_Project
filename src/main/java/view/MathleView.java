package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTextField;

public class MathleView extends JFrame {
    private JTextField[] fields = new JTextField[] {new JTextField(), new JTextField(), new JTextField(), new JTextField()};

    public MathleView(String title, int screenWidth, int screenHeight) {
        GridBagConstraints gridBag = new GridBagConstraints();
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        gridBag.insets = new Insets(10, 10, 10, 10);
        
        gridBag.gridx = 1;
        gridBag.gridy = 0;
        gridBag.gridwidth = 2;
        gridBag.fill = GridBagConstraints.HORIZONTAL;
        add(new JLabel(title, JLabel.CENTER), gridBag);
        
        gridBag.ipadx = 40;
        gridBag.gridwidth = 1;
        gridBag.gridy = 1;

        for(int i = 0; i < fields.length; i++) {
            gridBag.gridx = i;
            add(fields[i], gridBag);
        }

        gridBag.gridy = 3;
        gridBag.gridx = 1;
        gridBag.gridwidth = 2;
        gridBag.fill = GridBagConstraints.HORIZONTAL;

        add(new JButton("Check"), gridBag);

        setVisible(true);

    }

}
