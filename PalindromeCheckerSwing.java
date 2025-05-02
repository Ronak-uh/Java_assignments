import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCheckerSwing {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Enter text:");
        JTextField textField = new JTextField(15);
        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel("Result will be shown here.");
        
        checkButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String input = textField.getText();
                String reversed = new StringBuilder(input).reverse().toString();
                
                if (input.equals(reversed)) 
                {
                    resultLabel.setText("The input is a Palindrome.");
                } else 
                {
                    resultLabel.setText("The input is NOT a Palindrome.");
                }
            }
        });
        
        frame.add(label);
        frame.add(textField);
        frame.add(checkButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
