package view;

import java.awt.FlowLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AfterGameView extends JFrame {
    private JButton restartButton = new JButton("Restart?");

    public AfterGameView(String title, int screenWidth, int screenHeight) {
        setTitle(title);
        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        add(restartButton);

    }

    public void addRestartListener(ActionListener actionListener) {
        restartButton.addActionListener(actionListener);

    }


}
