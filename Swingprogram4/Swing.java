/*Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel8*/



package swing;
import javax.swing.*;
import java.awt.*;
public class Swing {
	public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Hello Swing");

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: plain, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(700, 150);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}


