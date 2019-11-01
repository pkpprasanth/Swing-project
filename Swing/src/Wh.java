import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wh {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1,num2,res1,res2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wh window = new Wh();
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
	public Wh() {
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
		
		textField = new JTextField();
		textField.setBounds(52, 42, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(52, 99, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblW = new JLabel("W");
		lblW.setBounds(22, 45, 56, 16);
		frame.getContentPane().add(lblW);
		
		JLabel lblH = new JLabel("H");
		lblH.setBounds(22, 102, 56, 16);
		frame.getContentPane().add(lblH);
		
		JLabel label = new JLabel("");
		label.setBounds(289, 45, 56, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(340, 105, 56, 16);
		frame.getContentPane().add(label_1);
		

		JLabel label_2 = new JLabel("");
		label_2.setBounds(91, 145, 56, 16);
		frame.getContentPane().add(label_2);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res1=num1*num2;
				res2=num1-num2;
				String ans = String.format("%.2f",res1);
				label.setText(ans);
				
			}
		});
		btnOk.setBounds(80, 189, 97, 25);
		frame.getContentPane().add(btnOk);
		
	}
}
