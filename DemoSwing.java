import javax.swing.*;
import java.awt.*;

class DemoSwing {
    public static void main(String[] args) {
        // create a jframe
        JFrame frame = new JFrame("JButton Example with FlowLayout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set FlowLayout
        frame.setLayout(new FlowLayout());

        // create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Event handling (ActionListener)

    button1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked"));

        // add buttons to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // make frame visible
        frame.setVisible(true);
        // frame.setResizable(false);
    }
}