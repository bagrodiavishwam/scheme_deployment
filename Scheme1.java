import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scheme1 {

	private JFrame frame;
	private JTextField txtScheme;

	/**
	 * Launch the application.
	 */
	public static void Scheme1Screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scheme1 window = new Scheme1();
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
	public Scheme1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1470, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtScheme = new JTextField();
		txtScheme.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtScheme.setHorizontalAlignment(SwingConstants.CENTER);
		txtScheme.setText("Scheme 1");
		txtScheme.setBounds(707, 23, 161, 54);
		frame.getContentPane().add(txtScheme);
		txtScheme.setColumns(10);
		txtScheme.setEditable(false);
		
//		JButton btnNewButton = new JButton("Close");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//			}
//		});
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		btnNewButton.setBounds(748, 175, 96, 37);
//		frame.getContentPane().add(btnNewButton);
	}

}
