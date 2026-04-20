package view;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

public class MathleView extends JFrame {
    public MathleView(String title, int screenWidth, int screenHeight) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Test"));

        setSize(screenWidth, screenHeight);
        setVisible(true);

    }

}
