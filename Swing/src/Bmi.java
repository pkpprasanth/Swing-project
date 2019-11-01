import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1,num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmi window = new Bmi();
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
	public Bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BIM");
		frame.setBounds(100, 100, 450, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(12, 13, 408, 83);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(12, 109, 408, 261);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(64, 45, 116, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(64, 100, 116, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblW = new JLabel("W");
		lblW.setBounds(12, 48, 56, 16);
		panel_1.add(lblW);
		
		JLabel lblH = new JLabel("H");
		lblH.setBounds(12, 103, 56, 16);
		panel_1.add(lblH);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(12, 161, 56, 16);
		panel_1.add(lblResult);
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setBounds(80, 161, 103, 29);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(220, 20, 60));
		label_1.setForeground(new Color(255, 69, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(195, 161, 201, 40);
		panel_1.add(label_1);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				double res = (num1/num2/num2)*10000;
				String ans=String.format("%.2f", res);
				label.setText(ans);
				if(res<18.5)
				{
					label_1.setText("Under Weight");
				}
				
			}
		});
		btnOk.setBounds(64, 203, 97, 25);
		panel_1.add(btnOk);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				label.setText(null);
				label_1.setText(null);
				
			}
		});
		btnC.setBounds(173, 203, 97, 25);
		panel_1.add(btnC);
		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(12, 377, 408, 111);
		frame.getContentPane().add(panel_2);
	}
}
