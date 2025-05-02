import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringReverserSwing {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("String Reverser");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Enter text:");
        JTextField textField = new JTextField(15);
        JButton reverseButton = new JButton("Reverse");
        JLabel resultLabel = new JLabel("Reversed text will be shown here.");
        
        reverseButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                String reversed = new StringBuilder(input).reverse().toString();
                resultLabel.setText("Reversed: " + reversed);
            }
        });
        
        frame.add(label);
        frame.add(textField);
        frame.add(reverseButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
