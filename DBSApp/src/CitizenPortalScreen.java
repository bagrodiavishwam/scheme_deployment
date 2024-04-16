import java.awt.EventQueue;

import javax.swing.JFrame;

public class CitizenPortalScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void CitizenPortalScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CitizenPortalScreen window = new CitizenPortalScreen();
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
	public CitizenPortalScreen() {
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
