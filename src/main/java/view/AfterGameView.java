package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AfterGameView extends JFrame {
    public AfterGameView(String title, int screenWidth, int screenHeight) {
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());

        add(new JButton("HEllow"));

    }


}
