import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.sql.*;

public class MainScreen extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField txtWelcomeToThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					int a = 5;
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
		MySQLConnection.connectDB();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(0, 0, 1470, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(51, 146, 1356, 93);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Scheme 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scheme1 s1 = new Scheme1();
				s1.Scheme1Screen();
			}
		});
		btnNewButton.setBounds(596, 25, 211, 43);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(51, 236, 1356, 93);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton_1 = new JButton("Scheme 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scheme2 s2 = new Scheme2();
				s2.Scheme2Screen();
			}
		});
		btnNewButton_1.setBounds(596, 23, 211, 43);
		panel_1.add(btnNewButton_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(51, 326, 1356, 93);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_2 = new JButton("Scheme 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scheme3 s3 = new Scheme3();
				s3.Scheme3Screen();
			}
		});
		btnNewButton_2.setBounds(596, 30, 211, 43);
		panel_2.add(btnNewButton_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(225, 28, 998, 66);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		txtWelcomeToThe = new JTextField();
		txtWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToThe.setText("Welcome to the Scheme Portal!");
		txtWelcomeToThe.setBounds(172, 10, 707, 46);
		panel_3.add(txtWelcomeToThe);
		txtWelcomeToThe.setColumns(10);
		txtWelcomeToThe.setEditable(false);
	}

}
