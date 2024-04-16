import java.awt.EventQueue;

import javax.swing.JFrame;

public class GovernmentPortalScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void GovernmentPortalScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GovernmentPortalScreen window = new GovernmentPortalScreen();
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
	public GovernmentPortalScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1470, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
