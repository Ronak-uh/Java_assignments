import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OddEvenSwing {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Odd or Even Checker");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Enter a number:");
        JTextField textField = new JTextField(10);
        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel("Result will be shown here.");
        
        checkButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    int number = Integer.parseInt(textField.getText());
                    if (number % 2 == 0) {
                        resultLabel.setText("The number is Even.");
                    } else {
                        resultLabel.setText("The number is Odd.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid number.");
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
