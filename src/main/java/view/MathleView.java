package view;

import java.awt.event.ActionListener;

public interface MathleView {
    public void addCheckListener(ActionListener listener);
    public int getInputBox1() throws Exception;
    public int getInputBox2() throws Exception;
    public int getInputBox3() throws Exception;
    public int getInputBox4() throws Exception;
    
}
