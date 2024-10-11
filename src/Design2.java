
import javax.swing.*;
	import java.awt.*;
public class Design2 {

	

	    
	    private JFrame frame;
	    
	    public Design2() {
	        // Create and set up the window
	        frame = new JFrame("Employee Management System");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);

	        // Call the method to set up UI components
	        designUI();
	        
	        // Display the window
	        frame.setVisible(true);
	    }

	    public void designUI() {
	        // Create a panel to hold the components
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(3, 1)); // Use GridLayout for simplicity
	        
	        // Create a button and change its color
	        JButton submitButton = new JButton("Submit");
	        submitButton.setBackground(Color.RED);  // Change button color from green to red
	        submitButton.setForeground(Color.WHITE); // Set button text color
	        
	        // Create a new label and text field
	        JLabel nameLabel = new JLabel("Enter your name:");
	        JTextField nameField = new JTextField(20); // Input field
	        
	        // Add the components to the panel
	        panel.add(nameLabel);
	        panel.add(nameField);
	        panel.add(submitButton);
	        
	        // Add the panel to the frame
	        frame.add(panel);
	    }

	    public static void main(String[] args) {
	        // Run the application
	        SwingUtilities.invokeLater(() -> new Design2());
	    }
	}

