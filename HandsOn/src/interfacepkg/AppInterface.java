package interfacepkg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppInterface {

	private JFrame frameMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppInterface window = new AppInterface();
					window.frameMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMenu = new JFrame("Hands On - PhysioGame");
		frameMenu.setResizable(false);
		frameMenu.setBounds(100, 100, 450, 300);
		frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMenu.getContentPane().setLayout(null);
		
		JButton btnStartGame = new JButton("Play Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStartGame.setBounds(170, 43, 117, 29);
		frameMenu.getContentPane().add(btnStartGame);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(170, 104, 117, 29);
		frameMenu.getContentPane().add(btnSettings);
		
		JButton btnQuit = new JButton("New button");
		btnQuit.setBounds(307, 226, 117, 29);
		frameMenu.getContentPane().add(btnQuit);
		
		JButton btnSignal = new JButton("EMG Signal");
		btnSignal.setBounds(170, 163, 117, 29);
		frameMenu.getContentPane().add(btnSignal);
		

	}
}
