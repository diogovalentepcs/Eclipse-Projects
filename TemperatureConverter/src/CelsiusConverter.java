import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelsiusConverter {

	private JFrame frmCelsiusConverter;
	private JTextField txtInputCelsiusDegrees;
	private JTextField txtFahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusConverter window = new CelsiusConverter();
					window.frmCelsiusConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CelsiusConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCelsiusConverter = new JFrame();
		frmCelsiusConverter.setResizable(false);
		frmCelsiusConverter.setTitle("Celsius Converter");
		frmCelsiusConverter.setBounds(100, 100, 450, 300);
		frmCelsiusConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCelsiusConverter.getContentPane().setLayout(null);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setBounds(70, 42, 61, 16);
		frmCelsiusConverter.getContentPane().add(lblCelsius);
		
		txtInputCelsiusDegrees = new JTextField();
		txtInputCelsiusDegrees.setText("Input Celsius Degrees Here");
		txtInputCelsiusDegrees.setBounds(169, 37, 211, 26);
		frmCelsiusConverter.getContentPane().add(txtInputCelsiusDegrees);
		txtInputCelsiusDegrees.setColumns(10);
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setBounds(70, 97, 92, 16);
		frmCelsiusConverter.getContentPane().add(lblFahrenheit);
		
		txtFahrenheit = new JTextField();
		txtFahrenheit.setBounds(169, 92, 211, 26);
		frmCelsiusConverter.getContentPane().add(txtFahrenheit);
		txtFahrenheit.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempCelsius;
				try {
					tempCelsius = Double.parseDouble(txtInputCelsiusDegrees.getText());
				}
				catch (NumberFormatException ex){
					JOptionPane.showMessageDialog(frmCelsiusConverter, "Format not valid!");
					return;
				}
				double tempFahr = tempCelsius * 1.8 + 32;
				txtFahrenheit.setText(Double.toString(tempFahr));
			}
		});
		btnConvert.setBounds(181, 151, 117, 29);
		frmCelsiusConverter.getContentPane().add(btnConvert);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(305, 222, 117, 29);
		frmCelsiusConverter.getContentPane().add(btnQuit);
	}
}
