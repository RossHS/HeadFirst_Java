package helloworld.Ch13_GUI_SWING_Panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 02.08.2017.
 */
public class Panel {
    public static void main(String[] args) {
        Panel gui = new Panel();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton buttonTwo = new JButton("Bliss");
        JButton buttonThree = new JButton("Huh?");

        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
