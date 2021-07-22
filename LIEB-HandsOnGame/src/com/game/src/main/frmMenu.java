package com.game.src.main;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import com.fazecast.jSerialComm.SerialPort;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu window = new frmMenu();
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
	public frmMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlayGame = new JButton("Play Game");
		btnPlayGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game game = new Game();
				
				game.setPreferredSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
				game.setMaximumSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
				game.setMinimumSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));
				
				JFrame frame = new JFrame(game.TITLE);
				frame.add(game); // adds dimension to the frame
				frame.pack(); // packs everything together
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows for exit button to work
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			
				game.start();
			}
		});
		btnPlayGame.setBounds(157, 36, 117, 29);
		frame.getContentPane().add(btnPlayGame);
	}

}
