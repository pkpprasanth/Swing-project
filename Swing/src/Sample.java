import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Sample {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 45));
		frame.setBounds(100, 100, 450, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtUserName.setBounds(209, 22, 188, 33);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setToolTipText("");
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtPassword.setBounds(209, 81, 188, 29);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(57, 22, 106, 25);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(57, 81, 106, 25);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxRemember = new JCheckBox("Remember");
		chckbxRemember.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxRemember.setBounds(209, 119, 113, 25);
		frame.getContentPane().add(chckbxRemember);
		
		JButton btnSingIn = new JButton("Sing In");
		btnSingIn.setBackground(Color.DARK_GRAY);
		btnSingIn.setForeground(Color.BLUE);
		btnSingIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSingIn.setBounds(83, 191, 113, 42);
		frame.getContentPane().add(btnSingIn);
		
		JButton btnSingUp = new JButton("Sing Up");
		btnSingUp.setBackground(Color.BLACK);
		btnSingUp.setForeground(Color.RED);
		btnSingUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSingUp.setBounds(228, 191, 120, 42);
		frame.getContentPane().add(btnSingUp);
	}
}
