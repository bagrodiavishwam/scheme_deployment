import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CitizenAadhar {

	private JFrame frame;
	private JTextField textAadhar;

	/**
	 * Launch the application.
	 */
	public static void CitizenAadhar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CitizenAadhar window = new CitizenAadhar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CitizenAadhar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Aadhar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(36, 109, 96, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textAadhar = new JTextField();
		textAadhar.setBounds(154, 111, 224, 30);
		frame.getContentPane().add(textAadhar);
		textAadhar.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CitizenPortalScreen cps = new CitizenPortalScreen();
				cps.CitizenPortalScreen();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(310, 209, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
	}
}
